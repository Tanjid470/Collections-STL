
package Collections;

import java.util.*;
public class Map_HashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        Map<String,Integer> number=new HashMap<>();
        number.put("Tanjid", 1470);
        number.putIfAbsent("Akash",1486);
        number.put("Tanjid", 1471);// It's will replace with previous  same key
        number.put("Rafi", 1496);
        number.put("Surovi", 1495);
        number.put("Jawad", 1486); 
       
        System.out.print("Enter replace key :");
        String name=input.next();
        System.out.print("Enter the replace value : ");
        int p=input.nextInt();
        try{
        number.replace(name, 1496,p);}
        catch(Exception e){
            System.out.println("Catch"); 
        }
        System.out.println(number.remove("Surovi", 1495));
        
        //  Iterate
        for (Map.Entry<String,Integer> x : number.entrySet()) {
            System.out.println(x);
        }
//        for (Map.Entry<String,Integer> x : number.entrySet()) {
//            System.out.println(x.getKey());
//        }
//        for (Map.Entry<String,Integer> x : number.entrySet()) {
//            System.out.println(x.getValue());
//        }
       
    
        //System.out.println(""+number);
        
        System.exit(0);        
    }
}
