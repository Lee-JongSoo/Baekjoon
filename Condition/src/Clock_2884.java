import java.util.Scanner;

public class Clock_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        minute -= 45;
        if (minute < 0) {
            minute = 60 + minute;
            if (hour <= 0) hour = 23;
            else hour--;
        }

        System.out.println(hour + " " + minute);
    }
}
