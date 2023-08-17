import java.util.Scanner;

public class java_task_2 {
    static class Int{
        int number;
        public Int(int num){
            number = num;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Int a = new Int(scan.nextInt()), b = new Int(scan.nextInt());
        swap(a, b);
        System.out.println(a.number + " " + b.number);
    }
    public static void swap(Int a, Int b){
        a.number += b.number;
        b.number = a.number - b.number;
        a.number -= b.number;
    }
}
