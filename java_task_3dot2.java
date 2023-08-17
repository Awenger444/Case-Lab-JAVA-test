import java.util.Scanner;

public class java_task_3dot2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(check(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
    public static boolean check(String str){
        int counter = 0;
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) == str.charAt(str.length() - 1 - i)){
                counter++;
            }
        }
        return counter == str.length() / 2;
    }
}
