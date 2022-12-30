package Collections;

import java.util.Scanner;
import java.util.Stack;

/*

push(20) Use for add value
peek()   Check the toppest value
pop()    Remove value from the top

 */
public class List_Stack_LIFO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<String> student = new Stack<>();
        student.push("Tanjid");
        student.push("Jawad");
        student.push("Rafi");
        student.push("Surovi");
        System.out.println("Stack:" + student + " ");

        student.add("Tonmoy");
        System.out.println("Stack:" + student + " ");

        System.out.println("Top Check :" + student.peek());

        student.pop();
        System.out.println("Stack:" + student + " ");
        System.out.println("Top Check :" + student.peek());
        System.exit(0);
    }

}
