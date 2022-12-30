
package Collections;

import java.util.*;
import java.util.HashSet;
import java.util.Set;


public class Student_TestHashSet {
    String name;
    int id;
    Student_TestHashSet(String name,int id){
        this.name=name;
        this.id  =id;
    }  

    @Override
    public String toString() 
    {
        return "Student_TestHashSet{" + "name=" + name + ", id=" + id + '}';
    }
    // Hash Code generate
    // Fore same value or String Haast generate same HashCode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
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
        final Student_TestHashSet other = (Student_TestHashSet) obj;
        return this.id == other.id;
    }

    

}
class HashSett{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            Set<Student_TestHashSet> std=new HashSet<>();
            std.add(new Student_TestHashSet("Tanjid",1470));
            std.add(new Student_TestHashSet("Jawad",1486));
            std.add(new Student_TestHashSet("Rafi",1496));
            std.add(new Student_TestHashSet("Rokon",1470));
//            System.out.println(std);
            for (Student_TestHashSet x : std)
            {
                System.out.println(x);
            }
         
        System.exit(0);        
    }

    
}