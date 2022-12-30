
package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;


class student{
    int id;
    student(int id){
        this.id=id;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final student other = (student) obj;
        return this.id == other.id;
    }
    
}

public class Test_SingleCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Map<String,student> number=new HashMap<>();
        number.put("Tanjid",new student(1470));
        number.put("jawad",new student(1470));
        number.put("Tanjid",new student(1470));
        
        
        for (Map.Entry<String, student> e : number.entrySet()) {
            System.out.println(e);
        }
     
        
        System.exit(0);        
    }   
    
}
