public class Recursion {
    public void display(int n)
    {
        System.out.print(n+" ");
          if(n==0){
                return;
            }
           
        display(n/2);  
        display(n/2);  
        display(n/2);
    }
    public static void main(String[] args) {
        Recursion re=new Recursion();
        re.display(5);
    }
}
