package homework4.task1;

public class Cat extends Animal implements Eat, Eatable {
    public Cat(String name, FamilyOfAnimal familyOfAnimal, TypeOfFood typeOfFood, String breed) {
        super(name, familyOfAnimal, typeOfFood, breed);
    }

    @Override
    public void move() {
        System.out.println(this.name + " sneaks");
    }

    @Override
    public void voice() {
        System.out.println(this.name + " says \"Meow\"");
    }

    @Override
    public void eatSomeone(Animal animal) {
        animal.getClass().getSimpleName();
        System.out.println(this.name + " the cat ate " + animal.name);
    }

    @Override
    public void eatenBySomeone(Animal animal) {
        animal.getClass().getSimpleName();
        System.out.println(this.name + " was eaten by " + animal.name);
    }
}