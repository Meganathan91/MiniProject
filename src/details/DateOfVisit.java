package details;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOfVisit {
    private static String dateOfVisit;
    public String getDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        dateOfVisit = dateFormat.format(date);
        return dateOfVisit;
    }
}
