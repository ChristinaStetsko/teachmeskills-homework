package homework6.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Plants {

    private Map<String, String> plants = new HashMap<>();

    {
        plants.put("Аир", "Злаковидные растения");
        plants.put("Цереус перуанский", "Растения с прямостоячими стеблями");
        plants.put("Плющ", "Лианы и ампельные растения");
        plants.put("Примула", "Розеточные растения");
    }

    private void printPlantType() {
        Scanner scanner = new Scanner(System.in);
        String plant = scanner.nextLine();
        System.out.println("Растение " + plant + " относится к виду" + plants.get(plant));
    }

    private void printAll() {
        for (Map.Entry<String, String> item : plants.entrySet()) {
            System.out.println(item.getKey() + " – " + item.getValue());
        }
    }

    public void greeting() {
        System.out.println("Здравствуй, юный падаван! Программа  \"Юный ботаник\" приветствует тебя!");
    }

    public void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыбирай действие:" +
                "\n1 - Вывести весь имеющийся список растений с описанием и примерами." +
                "\n2 - Узнать тип введённого растения");
        if (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    printAll();
                    break;
                case 2:
                    System.out.println("Введите своё растение.");
                    printPlantType();
                    break;
                default:
                    System.out.println("Вы ввели неправильное значение");
                    break;
            }
        }
    }
}
