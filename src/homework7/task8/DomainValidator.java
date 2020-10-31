package homework7.task8;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class DomainValidator {

    public static void main(String[] args) {
        String REGEX_DOMAIN = "^htt(p|ps)://\\w{2,20}\\.(com|by|de|ua|ru)/$";

        ArrayList<String> listDomain = new ArrayList<>();
        listDomain.add("http://example.com/");//true
        listDomain.add("https://ex1mple.by/");//true
        listDomain.add("example.com");//false
        listDomain.add("https://Ex1mple.by/");//true
        listDomain.add("http://example.com");//false
        listDomain.add("https:example.com/");//false

        Pattern pattern = Pattern.compile(REGEX_DOMAIN);
        for (String string : listDomain) {
            System.out.println(pattern.matcher(string).matches());
        }
    }
}