import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"vishnu", 50000, "trainer",35);
        Employee e2=new Employee(2,"Rahul",80000, "Senior trainer",40);
        Employee e3=new Employee(3,"Gandhi", 30000, "Admin",18);
        Employee e4=new Employee(4,"Harish", 100000, "Manager",28);
        Employee e5=new Employee(5,"Amar", 40000, "clerk",38);
        ArrayList<Employee> al=new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        
        Collections.sort(al,(a,b)-> b.name.compareTo(a.name));

        for(Employee e:al){
            System.out.println(e);
        }
    }
}
