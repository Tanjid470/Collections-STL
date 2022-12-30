
package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Queue_PriorityQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQueue<Integer> queue=new PriorityQueue<>();// toLowerCase
//      Queue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());// toUpperCase
        queue.offer(20);
        queue.offer(70);
        queue.offer(40);
        queue.offer(10);
        queue.offer(80);
        System.out.println("Priority_Queue : "+queue);
        
        System.out.println("The first value: "+queue.peek());
    
            System.out.println("\nThe Remove Value from first: "+queue.poll());
           
            //queue.poll();
            System.out.println("Updated PriorityQueue After Poll : "+queue);
        
        
        System.exit(0);        
    }
    
}
