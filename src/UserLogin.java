import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogin {
        public static boolean FirstNameValidator(String name) {
            String y = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(y);
            Matcher matcher = pattern.matcher(name);
            if (matcher.find())
                return true;
            else
                return false;
        }

        public static boolean LastNameValidator(String name) {
            String y = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(y);
            Matcher matcher = pattern.matcher(name);
            if (matcher.find())
                return true;
            else
                return false;
        }

        public static void main(String[] args) {
            UserLogin u = new UserLogin();
            System.out.println(u.FirstNameValidator("Rushi"));
            System.out.println(u.LastNameValidator("Dhande"));
            //System.out.println(u);

        }
    }

