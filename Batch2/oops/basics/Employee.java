public class Employee {
  int id;
  String name;
  String dept;
  double salary;
  public Employee()
  {
    System.out.println("No arg constructor called");
  }
  public Employee(String name){
    this.name=name;
  }
  public Employee( int id, String name, String dept, double salary)
  {
    this("sulthana");
    this.id = id;
    this.dept = dept;
    this.salary = salary;

  }
   
  public void displayDetails(){ 
    System.out.println(id);
    System.out.println(dept);
    System.out.println(name);
    System.out.println(salary);

  }
  public static void main(String[] args)
  {
    Employee e = new Employee(200,"sulthana","it",100000);
    e.displayDetails();

  }
}
