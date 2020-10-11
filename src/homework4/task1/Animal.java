package homework4.task1;

public abstract class Animal implements Action {
    protected String name;
    protected FamilyOfAnimal familyOfAnimal;
    protected TypeOfFood typeOfFood;
    protected String breed;

    public Animal(String name, FamilyOfAnimal familyOfAnimal, TypeOfFood typeOfFood, String breed) {
        this.name = name;
        this.familyOfAnimal = familyOfAnimal;
        this.typeOfFood = typeOfFood;
        this.breed = breed;
    }
}