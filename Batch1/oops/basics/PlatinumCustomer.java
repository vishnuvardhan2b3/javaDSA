public class PlatinumCustomer extends Customer {
    double credits;
    public PlatinumCustomer(int id,String name,String mobNo,String email,double credits){
        super(id, name, mobNo, email);
        this.credits=credits;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println(credits);
    }
}
