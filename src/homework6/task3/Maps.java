package homework6.task3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Set<String> set = map.keySet();
        Collection<String> list = map.values();

        map.put("1", "Тро-ло-ло");
        map.put("2", "Тра-ля-ля");
        map.put("3", "Хи-хи");
        map.put("4", "Ха-ха");

        System.out.println("Ключи: " + set);
        System.out.println("Значения: " + list);
    }
}