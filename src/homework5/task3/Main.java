package homework5.task3;

public class Main {

    public static void main(String[] args) {
        Generics<String> string = new Generics<>();
        Generics<Integer> numb = new Generics<>();
        Generics<Double> dub = new Generics<>();
        Generics<Character> character = new Generics<>();

        string.setValue(new String[]{"123", "4567", "Tro-lo-lo"});
        numb.setValue(new Integer[]{0, 2, 3, 7, -5});
        dub.setValue(new Double[]{8.23, 17.2356886415454, 15.46, 0.12});
        character.setValue(new Character[]{'m', 'c', '_', '0', '!', '9'});

        System.out.println(string.getT(2));
        System.out.println(numb.getT(4));
        System.out.println(dub.getT(1));
        System.out.println(character.getT(4));
    }
}