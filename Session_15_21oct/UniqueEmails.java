
import java.util.HashSet;

public class UniqueEmails {
    public static void main(String[] args) {
        String[] emails = {
            "Tanisa@123gmail.com",
            "rtanis.tr.lokh@gmail.com",
            "tanisha+gfuehgi@gmail.com"
        };

        HashSet<String> uniqueEmails = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String currentEmail = emails[i];

            int atPosition = currentEmail.indexOf('@');
            String local = currentEmail.substring(0, atPosition);
            String domain = currentEmail.substring(atPosition + 1);

            int plusPosition = local.indexOf('+');

            if (plusPosition != -1) {
                local = local.substring(0, plusPosition);
            }

            local = local.replace(".", "");
            currentEmail = local + "@" + domain;

            uniqueEmails.add(currentEmail);
        }

        System.out.println(uniqueEmails.size());
    }
}
