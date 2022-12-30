
package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*

offer(20)  Use add the value
poll()     Use to remove from the FIFO 

*/


public class Queue_LinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(20);
        System.out.println("Queue : "+queue);
        
        System.out.println("The first value: "+queue.peek());
//        queue.clear();
//        System.out.println("      "+queue.poll()); //If empty print NULL
//        System.out.println("      "+queue.remove());// if empty print exception
       
            System.out.println("\nThe Remove Value from first:"+queue.poll());
            queue.poll();
            System.out.println("Updated Queue : "+queue);
        
        System.exit(0);        
    }
    
}
