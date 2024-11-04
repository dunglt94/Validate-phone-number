import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static final String PHONE_NUMBER_REGEX = "^[(]\\d{2}[)]-[(]\\d{9}[)]$";

    public PhoneNumber() {}

    public boolean validate(String number) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
