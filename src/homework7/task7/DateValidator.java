package homework7.task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {

    public static void main(String[] args) {
        String REGEX_DATE_AND_TIME = "^\\d{4}/([1-9]|1[0-2])/([1-9]|[1-2][0-9]|3[0-1]) " +
                "([0-1]?[0-9]|2[0-3])(:([0-5][0-9])){2}$";
        Scanner scanner = new Scanner(System.in);
        String dateAndTime = scanner.nextLine();

        Pattern pattern = Pattern.compile(REGEX_DATE_AND_TIME);
        Matcher matcher = pattern.matcher(dateAndTime);
        System.out.println(matcher.matches());
    }
}