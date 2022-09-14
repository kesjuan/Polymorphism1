package barnyard;

public class main2 {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        Pet pig1 = pet1.new Pig();
        Pet dog1 = pet1.new Dog();

       // pig1.petSpeak();
       // dog1.petSpeak();
       // pig1.setName();
      //  pig1.getName();
        pet1.whatPetsMakeThemSpeak();

    }
}
