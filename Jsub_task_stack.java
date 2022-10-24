import java.util.Stack;
import java.util.Scanner;

public class Jsub_task_stack {
    public static void main(String[] args) {

        int b;
        int c;
        
        System.out.println("원하는 숫자를 입력하세요.");
        
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        System.out.println("입력한 숫자: "+num);
        a.close();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= num; i++) {
            if (i<=1) {
                System.out.print(i+"\t");
                stack.push(i);
            } else {
                b = stack.peek();
                stack.pop();
                c = b + stack.peek();
                System.out.print(c+"\t");
                stack.pop();
                stack.push(b);
                stack.push(c);
            }
        }          
    }
}