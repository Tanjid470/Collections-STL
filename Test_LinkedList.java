
package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Test_LinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> value=new Vector<>();
        List<String> value2=new LinkedList<>();
        value.add("Dhaka");
        value.add("Noakhali");
        value.add("Lakshmipur");
        value.add("Raipur");
        value.add("Lakshmipur");
        value.add("Lakshmipur");
        
        value2.add("Brazil");  value2.add("Portugal");  value2.add("Spain");
        
        System.out.println(value);
        System.out.println("Last Insert Lakshmipur Position: "+value.lastIndexOf("Lakshmipur")); // ArrayList Can take repated value
                                                             //LastIndexOf print the last position
        System.out.println("Index Find out : "+value.indexOf("Raipur"));
        value.remove("Lakshmipur");  //ArrayList remove from Start
        value.addAll(value2);
        value.set(1,"Tanjid");
        System.out.print("Removing :");
        System.out.println(value);
        System.out.println("Is here Dhaka Available check : "+value.contains("Dhaka"));
        
        boolean s=value.equals(value2);
        System.out.println(""+s);
        System.out.println(""+value.get(0));
        
        System.exit(0);        
    }
}
