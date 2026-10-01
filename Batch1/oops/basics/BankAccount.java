public class BankAccount {
    private int balance=100000;
    public int getBalance(){
         return balance;
    }
    public void setBalance(int balance){
        if(balance>0){
         this.balance=this.balance+balance;
        }
        else{
            System.out.println("invalid Amound");
        }
    }
}
