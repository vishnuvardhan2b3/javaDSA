public class Employee {
    int id;
    String name;
    String departement;
    double sal;
    public Employee (int id,String name,String departement,double sal){
        this.id = id;
        this.name= name;
        this.departement=departement;
        this.sal=sal;
    }
    public void displayDetails(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("departement: "+departement);
        System.out.println("sal: "+sal);
    }
    public static void main(String[] args) {
        Employee e1=new Employee(101, "gamana sri", "sales", 50000);
        e1.displayDetails();
        Employee e2=new Employee(102,"cherry","finance",100000);
        e2.displayDetails();
    }
}
