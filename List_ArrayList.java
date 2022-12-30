
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
    add()
    isEmpty()
    Collection.sort()
    remove()
    set(index, value) Use for replace value
    get()             parameter will be value & it's print index
    equal()
    contain()
    IndexOf()
*/

public class List_ArrayList {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> number =new ArrayList<> ();//LinkedList same to same   (Just replace)
                                                 //List<Integer> number =new LinkedList<> ();/

        number.add(20);
        number.add(10);
        number.add(2,30);
        number.add(40);
        number.add(4,50);
        System.out.println("\n\tArrayList.........");
        Collections.sort(number);
        System.out.println("Accending Order:");
        System.out.print(number+" ");
       /* Collections.sort(number,Collections.reverseOrder());
        System.out.println("\nDescending Order:");
        System.out.print(number+" ");*/
      
    //another way to print ArrayList    
       /* for(int x : number){
            System.out.print(x+" ");
        }*/
        System.out.println("\n=>Size:"+number.size());
        
//...................ArrayList_Remove  

        number.remove(2);
        System.out.println("\n\tAfter remove one content :  .remove()");
        System.out.print(number+" ");
       
//...................ArrayList_Clear
        /*number.clear();
        System.out.println("\n\tAfter Clear ArrayList :");
        System.out.print(number+" \n");*/
        
//...................ArrayList_Check_Empty Or not... !!  

        boolean i=number.isEmpty();
        System.out.println("\n\tAfter Check ArrayList :  .isEmpty()");
        System.out.println("=>ArrayList?  : "+i);

//...................ArrayList_Check_Is this value available....? !! 
        System.out.println("\n\t Check ArrayList Value Is available :  .contains(40)");
        boolean con=number.contains(40);
        System.out.print("=>Is 40 available into this ArrayIist? : "+con);
        
//...................ArrayList_Check_IndexOf....? !!  
        
        System.out.println("\n\n\t Check ArrayList Value Index Position :  .indesOf(40)");
        int position=number.indexOf(40);
        System.out.print("=>Is 40 Index:"+position);
        System.out.println("\nSize:"+number.size());
        
//...................ArrayList_Set.... !!  
        
        System.out.println("\n\n\tArrayList Set_Value:  .Set(4,50)");
        number.set(3, 60);
        System.out.print(""+number);
        
//...................ArrayList_Get.... !!  
        
        System.out.println("\n\n\tArrayList Get_Value:  .Get(0)");
        int x=number.get(0);
        System.out.print(""+x);
        System.out.println("");   
    }
}
