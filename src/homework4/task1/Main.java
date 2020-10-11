package homework4.task1;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Happy", FamilyOfAnimal.FELINE, TypeOfFood.CARNIVOROUS, "Scottish fold");
        Dog dog = new Dog("Haru", FamilyOfAnimal.CANINE, TypeOfFood.OMNIVOROUS, "Akita-inu");
        Mouse mouse = new Mouse("Jerry", FamilyOfAnimal.RODENT, TypeOfFood.HERBIVORE, "Hamster");

        System.out.println("Cat: name " + cat.name + ", " + cat.familyOfAnimal + ", " + cat.typeOfFood + ", " + cat.breed);
        cat.voice();
        cat.move();
        cat.eatSomeone(mouse);
        cat.eatenBySomeone(dog);

        System.out.println("\nDog: name " + dog.name + ", " + dog.familyOfAnimal + ", " + dog.typeOfFood + ", " + dog.breed);
        dog.voice();
        dog.move();
        dog.eatSomeone(cat);
        dog.eatSomeone(mouse);

        System.out.println("\nMouse: name " + mouse.name + ", " + mouse.familyOfAnimal + ", " + mouse.typeOfFood + ", " + mouse.breed);
        mouse.voice();
        mouse.move();
        mouse.eatenBySomeone(cat);
        mouse.eatenBySomeone(dog);
    }
}