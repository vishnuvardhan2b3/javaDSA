public class Employee implements Comparable<Employee> {
    int eid;
    String ename;
    double sal;
    int age;
    String designation;
    public Employee(int eid, String ename, double sal, int age, String designation) {
        this.eid = eid;
        this.ename = ename;
        this.sal = sal;
        this.age = age;
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "[eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", age=" + age + ", designation="
                + designation + "]";
    }
    @Override
    public int compareTo(Employee other) {
        return  Double.compare(other.sal,this.sal);
    }
   
}
