package barnyard;

import java.util.Arrays;
import java.util.Scanner;

public class Pet {
    public String speak;
    public String name;
public String type;
    public Pet(){}

    public String setName(){
        Scanner setPetName = new Scanner(System.in);
        System.out.print("What is this pets name? ");
       return name = setPetName.nextLine();
    }
    public void getName(){
        System.out.println(name);
    }

    public void petSpeak(){
        //System.out.println(speak);
        }
        public void whatPetsMakeThemSpeak(){
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            //Scanner scanner4 = new Scanner(System.in);
            System.out.print("How many pets do you have? ");
            int numberOfPets = scanner1.nextInt();

            //System.out.println(numberOfPets);


            System.out.print("What kind of pets are they? " );
            String[] typesOfPets = scanner2.nextLine().split(" ");
            // System.out.println(Arrays.toString(typesOfPets));


            System.out.print("What are your pets names? ");
            String[] namesOfPets = scanner3.nextLine().split(" ");

            //typesOfPets = Arrays.toString(typesOfPets);

           for (int x = 0;x < typesOfPets.length; x++) {
               if (typesOfPets[x].contentEquals("Dog")) {
                   Pet doggy = new Dog();
                   doggy.petSpeak();
               }
               else if (typesOfPets[x].contentEquals("Cat")){
                   Pet catty = new Cat();
                   catty.petSpeak();
               }
               else if (typesOfPets[x].contentEquals("Pig")){
                   Pet piggy = new Pig();
                   piggy.petSpeak();
               }
           }
           for (int x = 0; x < namesOfPets.length; x++){
               System.out.println("hello " + namesOfPets[x]);
           }

        }


    class Dog extends Pet {
        String speak = "Bark Bark ";
        String type = "Dog";

        @Override
        public void petSpeak() {
           super.petSpeak();
            System.out.println(speak);
        }
    }

    class Cat extends Pet {
        String speak = "Meow Meow";
        String type = "Cat";
        @Override
        public void petSpeak() {
            super.petSpeak();
            System.out.println(speak);
        }
    }

    class Pig extends Pet {
        String speak = "Oink Oink";
        String type = "Pig";

        @Override
        public void petSpeak() {
            super.petSpeak();
            System.out.println(speak);
        }
    }
}
