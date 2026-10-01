public class MethodOverLoading {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        MethodOverLoading mo=new MethodOverLoading();
        double res=mo.add(10.0, 20.0);
        System.out.println(res);
    }
}
