public class Driver {
    public static void main(String[] args) {
        Customer c1 = new Customer(101,"vikky","123456789","vikky@gmail.com");
        PlatinumCustomer c2=new PlatinumCustomer(102,"Brownie","35667688","brownie@gmail.com",65.5);
        c1.displayDetails();
        c2.displayDetails(); 

    }
}
