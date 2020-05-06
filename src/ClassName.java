import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASSNAME_REGEX = "^[CAP][\\d]{4}[GHIKLM]{1}$";

    public boolean validateClassName(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
