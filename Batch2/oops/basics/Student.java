public class Student{
    int id;
    String name;
    String department;
    double per;
    public Student(int id,String name,String department,double per)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.per=per;
    }
    public void displayDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(department);
        System.out.println(per);
    }
    public static void main(String[] args) {
        Student s=new Student(101,"raja","CSE",78.9);
        Student s1=new Student(102,"rani","MECH",98.99);
        s1.displayDetails();
        s.displayDetails();
    }
}