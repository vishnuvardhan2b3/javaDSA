class Student{
    int id;
    String name;
    String department;
    double per;
    public Student()
    {
        this(101, "Mustafa", "CSE", 9.05);
        System.out.println("No arg constructor");
    }
    public Student(int id,String name,String department,double per){
          
        System.out.println("Parameterized constructor called");
          this.id=id;
          this.name=name;
          this.department=department;
          this.per=per;
    }
    public void listenToClass()
    {
        System.out.println("student is listening the class");
    }
    public void takeNotes()
    {
        System.out.println("student is taking notes from the lecture");
    }
    public void doAssignments()
    {
        System.out.println(name+" is doing assignments by understanding concepts");
    }
    public void displayDetails()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(department);
        System.out.println(per);
    }
    public static void main(String[] args) {
        Student s1=new Student();
      }
}