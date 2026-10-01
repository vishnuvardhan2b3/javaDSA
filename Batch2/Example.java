import java.util.Scanner;

class Example{
    public static boolean isArm(int n)
    {
        int d=(int)Math.log10(n)+1;
        int sum=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            sum=sum+(int)Math.pow(r,d);
            n=n/10;
            //System.out.println("r="+r+" sum="+sum+" n="+n);
        }
        n=temp;
        if(sum == n){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
                sum=sum+i;
                //System.out.println("i="+i+" sum="+sum);
        }
        System.out.println(sum);
    }
}