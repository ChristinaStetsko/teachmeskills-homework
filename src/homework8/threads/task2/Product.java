package homework8.threads.task2;

public enum Product {
    ITEM1 ("Хлебушек"),
    ITEM2 ("Колбаска"),
    ITEM3 ("Чипсики"),
    ITEM4 ("Кола"),
    ITEM5 ("Мыло");

    private String description;

    Product(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
