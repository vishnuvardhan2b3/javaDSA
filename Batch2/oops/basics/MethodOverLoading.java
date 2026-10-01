public class MethodOverLoading {
    
    int add(int a,int b,int c){
        System.out.println("three int parameters");
        return a+b+c;
    }
    int add(int a,int b){
        System.out.println("two int parameters");
        return a+b;
    }
    
    void add(int a,float b){
        System.out.println("1st int 2nd string");
        
    }
    void add(float a,int b){
        System.out.println("1st String 2nd int");

    }

    public static void main(String[] args) {
        MethodOverLoading mo=new MethodOverLoading();
        mo.add(10,20);
        //System.out.println(res);
    }
}
