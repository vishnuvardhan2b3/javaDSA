public class Polymorphism {
    public void useAnimalSound(Animal a){
        a.sound();
    }
    public static void main(String[] args) {
        Polymorphism p=new Polymorphism();
        p.useAnimalSound(new Cat());
    }
}
