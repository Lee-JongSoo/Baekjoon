import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {

    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age == o.age) return this.name.charAt(0) - o.name.charAt(0);
        else return this.age - this.age;
    }
}


public class AgeSorting_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            ints[i] = sc.nextInt();
            strings[i] = sc.next();
        }

    }
}