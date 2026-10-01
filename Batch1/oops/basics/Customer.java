public class Customer {
    int id;
    String name;
    String mobNo;
    String email;

    public Customer(int id, String name, String mobNo, String email)
    {
        this.id = id;
        this.name = name;
        this.mobNo = mobNo;
        this.email = email;
    }
    public void displayDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(mobNo);
        System.out.println(email);
    }

}

