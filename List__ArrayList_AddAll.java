
package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class List__ArrayList_AddAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list+" ");
        
        ArrayList<Integer> newlist=new ArrayList<>();
        newlist.add(222);
        newlist.add(333);
        newlist.add(444);
        System.out.println(newlist+" ");
        
        list.addAll(newlist);
//        System.out.println(list+" ");

        Iterator<Integer> it=list.iterator(); //Use to print the value
        while(it.hasNext()){                  //(Like as for each loop)
            System.out.print(it.next()+" ");
        }System.out.println("\n\n\n\n\n\n\n");
        
        
      
        System.exit(0);        
    }
    
}
