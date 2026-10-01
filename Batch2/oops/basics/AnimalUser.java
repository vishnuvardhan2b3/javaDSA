public class AnimalUser {
    void useAnimalSound(Animal a){
       a.sound();
    }
    public static void main(String[] args) {
        AnimalUser au=new AnimalUser();
       au.useAnimalSound(new Animal());

    }
}
