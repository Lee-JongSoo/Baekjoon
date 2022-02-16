import java.util.Scanner;

public class Clock2_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int finish = sc.nextInt();

        minute += finish;
        if (minute >= 60) {
            int result = minute;
            for (int i = 0; i < result / 60; i++) {
                minute-=60;
                hour++;
                if (hour==24) hour = 0;
            }
        }

        System.out.println(hour + " " + minute);
    }
}