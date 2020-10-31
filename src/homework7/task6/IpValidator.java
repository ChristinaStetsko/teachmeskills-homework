package homework7.task6;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class IpValidator {

    public static void main(String[] args) {
        String REGEX_IP = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
        ArrayList<String> listIp = new ArrayList<>();
        listIp.add("255.103.1.16");//true
        listIp.add("000.103.0001.16");//false
        listIp.add("255.103.161111");//false
        listIp.add("255.103.abc.16");//false

        Pattern pattern = Pattern.compile(REGEX_IP);
        for (String string : listIp) {
            System.out.println(pattern.matcher(string).matches());
        }
    }
}