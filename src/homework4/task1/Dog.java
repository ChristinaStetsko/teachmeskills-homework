package homework4.task1;

public class Dog extends Animal implements Eat {
    public Dog(String name, FamilyOfAnimal familyOfAnimal, TypeOfFood typeOfFood, String breed) {
        super(name, familyOfAnimal, typeOfFood, breed);
    }

    @Override
    public void move() {
        System.out.println(this.name + " is running");
    }

    @Override
    public void voice() {
        System.out.println(this.name + " says \"Woof!\"");
    }

    @Override
    public void eatSomeone(Animal animal) {
        animal.getClass().getSimpleName();
        System.out.println(this.name + " the dog ate " + animal.name);
    }
}