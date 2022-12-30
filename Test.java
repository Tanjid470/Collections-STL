
package Collections;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//                  Stack
//        
//        Stack<Integer> sk=new Stack<>();
//        sk.push(20);
//        sk.push(30);
//        sk.push(40);
//        System.out.println(sk.pop());
//        System.out.println("hi :"+sk.peek());

//               ArrayDeque
//                            
//          ArrayDeque<Integer> value=new ArrayDeque<>();
//          value.offer(10);
//          value.offer(20);
//          value.offer(30);
//          value.offer(40);
//          value.offer(50);
//          
//          System.out.println("Poll First : "+value.pollFirst());
//          System.out.println("Peek First : "+value.peekFirst());
//          System.out.println("pol Last   : "+value.pollLast());
//          System.out.println(value);

//                   Priority Queue
//            Queue<Integer> pq = new PriorityQueue<>();
//            pq.offer(33);
//            pq.offer(22);
//            pq.offer(11);
//            pq.offer(44);
//            pq.offer(55);
//            System.out.println(pq);
//            System.out.println("Priority Poll : "+pq.poll());
//            System.out.println("Priority Peek : "+pq.peek());

//                      Hash Set
//     As like linkedList : Difference(Repeted value not allow)             
//              Set<Integer> hs=new HashSet<>();
//              hs.add(11);
//              hs.add(22);
//              hs.add(33);
//              hs.add(44);
//              hs.add(55);
//              hs.add(44);
//              System.out.println(hs);

                 //  Noob Queue

//        Queue<Integer> queue=new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            queue.offer(i);
//        }
//        while(! queue.isEmpty()){
//            Integer value=queue.poll();  //poll and print it
//            System.out.println(value+"");
//        }
//        System.out.println(queue.isEmpty());
//              
    
                   // Noob Stack
                            
//    Stack<Integer> queue=new Stack<>();
//        for (int i = 0; i < 10; i++) {
//            queue.push(i);
//        }
//        while(! queue.isEmpty()){
//            Integer value=queue.pop();  //poll and print it
//            System.out.println(value+"");
//        }
//        System.out.println(queue.isEmpty());


    Map<String,Integer> number=new TreeMap<>();
        number.put("Tanjid", 1470);
        number.putIfAbsent("Akash",1486);
        number.put("Tanjid", 1471); // It's will replace with previous  same key
        number.put("Rafi", 1496);
        number.put("Surovi", 1495);
        number.put("Jawad", 1486); 
        System.out.println(number.remove("Surovi", 1495));
        
        //  Iterate
        for (Map.Entry<String,Integer> x : number.entrySet()) {
            System.out.println(x);
        }

    

          
        
        System.exit(0);        
    }
}
