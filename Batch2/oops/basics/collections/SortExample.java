import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"vishnu", 50000, 35, "trainer");
        Employee e2=new Employee(2,"Raja", 30000, 25, "Admin");
        Employee e3=new Employee(3,"Hari", 70000, 45, "Senior Trainer");
        Employee e4=new Employee(4,"Guru", 40000, 22, "clerk");
        Employee e5=new Employee(5,"Anil", 100000, 30, "Manager");
        ArrayList<Employee> al=new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        Collections.sort(al);
        for(Employee e:al){
            System.out.println(e);
        }
    }
}
