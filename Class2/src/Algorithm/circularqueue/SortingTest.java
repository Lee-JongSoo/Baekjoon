package Algorithm.circularqueue;

import java.util.Comparator;

public class SortingTest {
    public static void main(String[] args) {

        ArrayQueue<Student> q = new ArrayQueue<>();

        q.offer(new Student("김자바", 92));
        q.offer(new Student("이시플", 72));
        q.offer(new Student("조시샵", 98));
        q.offer(new Student("파이손", 51));

        q.sort(customComp);	// Comparator을 넘겨준다.

        for(Object a : q.toArray()) {
            System.out.println(a);
        }
    }

    // 사용자 설정 comparator(비교기)
    static Comparator<Student> customComp = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.score - o1.score;
        }
    };

}

