public class AccountHolder {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        System.out.println(ba.getBalance());
        ba.setBalance(-500);
        System.out.println(ba.getBalance());
    
    }
}
