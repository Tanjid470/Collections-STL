
package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Set_HashSet 
{    
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
     /// HashSet<Integer> hs=new HashSet<>();
      LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        hs.add(22);
        hs.add(33);
        hs.add(44);
        hs.add(55);
        hs.add(55);//Repeated vaalue HashSet can't store
        System.out.println(hs+"  "); 
        System.exit(0);        
    }   
}
