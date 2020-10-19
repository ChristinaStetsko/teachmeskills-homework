package homework4.task1;

public class Mouse extends Animal implements Eatable {
    public Mouse(String name, FamilyOfAnimal familyOfAnimal, TypeOfFood typeOfFood, String breed) {
        super(name, familyOfAnimal, typeOfFood, breed);
    }

    @Override
    public void move() {
        System.out.println(this.name + " escapes");
    }

    @Override
    public void voice() {
        System.out.println(this.name + " squeaks");
    }

    @Override
    public void eatenBySomeone(Animal animal) {
        System.out.println(this.name + " was eaten by " + animal.name);
    }
}