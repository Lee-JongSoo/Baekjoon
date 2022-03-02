import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point2 implements Comparable<Point2>{
    public int x, y;
    Point2(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Point2 o){
        if(this.y==o.y) return this.x-o.x;
        else return this.y-o.y;
    }
}

class CoordinateSort_11651 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Point2> arr=new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Point2(x, y));
        }
        Collections.sort(arr);
        for(Point2 o : arr) System.out.println(o.x+" "+o.y);
    }
}
