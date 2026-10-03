import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterUtility {
    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public String formatTimestamp(long timestamp) {
        return formatter.format(new Date(timestamp));
    }
}