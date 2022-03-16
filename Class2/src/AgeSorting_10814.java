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
       return this.age - o.age;
    }
}

public class AgeSorting_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Person> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            arrayList.add(new Person(age, name));
        }

        Collections.sort(arrayList);
        for (int i = 0; i < n; i++) {
            System.out.println(arrayList.get(i).age + " " + arrayList.get(i).name);
        }
    }
}