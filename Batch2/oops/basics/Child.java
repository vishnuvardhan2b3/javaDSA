public class Child extends Parent{
    @Override
    void wake(){
        System.out.println("Wake up at 10AM");
    }
    public static void main(String[] args) {
        Child c=new Child();
        c.wake();
    }
}
