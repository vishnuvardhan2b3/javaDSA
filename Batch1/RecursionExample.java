public class RecursionExample {
    public int fact(int n){
        if(n==0){
            return 1; 
        }
        return n*fact(n-1);
    }
    public int sum(int n){
        if(n==0){
            return 1;
        }
        return n*sum(n-1);
    }
    public int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        int r=n%10;
        return r*r+sumOfDigits(n/10);
    }
    public void display(int n)
    {
        System.out.print(n+" ");
        if(n==0){
            return;
        }
        display(n/2);
        display(n/3);
    }
    public int rev(int n,int sum)
    {
        if(n==0){
            return sum;
        }
        sum=sum*10+(n%10);
        return rev(n/10,sum);
    }
    public static void main(String[] args) {
        RecursionExample re=new RecursionExample();
        int res=re.rev(1234,0);
        System.out.println(res);
    }
}
