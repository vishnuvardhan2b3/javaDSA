public class PlatinumCustomer extends Customer{
    double credits;
    public PlatinumCustomer(int id,String name,String mobno,String email,double credits){
        super(id, name, mobno, email);
        this.credits=credits;
    }    
    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(mobno);
        System.out.println(credits);
     }
     
}
