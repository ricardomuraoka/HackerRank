package TimeConversion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public class Result {

    public static String timeConversion(String s) throws ParseException {
        DateFormat input = new SimpleDateFormat("hh:mm:ssa");
        DateFormat output = new SimpleDateFormat("HH:mm:ss");
        return output.format(input.parse(s));

    }
}
