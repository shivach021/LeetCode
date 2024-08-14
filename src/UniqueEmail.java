import java.util.Arrays;

public class UniqueEmail {

    public static void main(String[] args) {
        String[] input = new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println(numUniqueEmails(input));
    }

    public static int numUniqueEmails(String[] emails) {
       return (int) Arrays.stream(emails)
               .map(email -> {
                   String[] parts = email.split("@");
                   return parts[0].split("\\+")[0].replaceAll("\\.", "")+"@"+parts[1];
               }).distinct().count();
    }
}
