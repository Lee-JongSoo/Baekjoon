import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public String solution(int a, int b) {
        String answer = "";
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1, b);
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);

        answer = sdf.format(date).toUpperCase();
        return answer;
    }
}
