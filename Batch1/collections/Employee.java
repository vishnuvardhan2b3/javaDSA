public class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;
    String designation;
    int age;
    public Employee(int id, String name, double salary, String designation, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.age = age;
    }
    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
                + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Employee other) {
         return Integer.compare(other.age, this.age);
    }
    
}
