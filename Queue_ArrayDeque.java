
package Collections;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class Queue_ArrayDeque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.add(10);
        adq.offer(25);
        adq.offerFirst(440);
        adq.offerFirst(800);
        adq.offerLast(35);
//        System.out.println("Peek :"+adq.peek());

        System.out.println("PeekLast :"+adq.peekLast());
        System.out.println("PeekFirst:"+adq.peekFirst());
        
        System.out.println(adq+" ");
        
        adq.pollLast();
        System.out.println("\nPollLast :\n"+adq+" ");
        
        adq.pollFirst();
        System.out.println("\nPollFirst   :\n"+adq+" ");
//        adq.poll(); 
//        System.out.println(adq+" ");
        System.exit(0);        
    }
    
}
