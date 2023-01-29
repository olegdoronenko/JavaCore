import java.util.regex.*;

public class Regex {
    static public void main(String[] args) {
        System.out.println(isGmailOrOutlook("pipa@outlook.com"));
    }




    public static boolean isGmailOrOutlook(String email) {
        //Твой код тут
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
