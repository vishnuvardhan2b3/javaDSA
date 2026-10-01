public class Customer {
    int id;
    String name;
    String mobno;
    String email;

public Customer(){
    
}
public Customer(int id,String name,String mobno,String email){
this.id=id;
this.name=name;
this.email=email;
this.mobno=mobno;
}
public void display(){
   System.out.println(id);
   System.out.println(name);
   System.out.println(email);
   System.out.println(mobno);
}
}