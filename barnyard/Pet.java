package barnyard;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Pet {
    public String speak;
    public String name;
public String type;
    public Pet(){}

    public String setName(String animal){
        Scanner setPetName = new Scanner(System.in);
        System.out.print("What is this " + animal + " name? ");
       return name = setPetName.nextLine();
    }
    public void getName(){
        System.out.println(name);
    }

    public void petSpeak(){
        //System.out.println(speak);
        }
        public void assignTypeToObjects(String[] caseType) {
        Pet[] pets;
        String [] petNames;
        String dogNames = "";
        String catNames = "";
        String pigNames = "";
            for (int x = 0; x < caseType.length; x++) {
                if (caseType[x].contentEquals("Dog")) {
                   // Pet doggy = new Dog();
                    pets = new Dog[x];
                    //setName("dog's");
                    dogNames = dogNames + " "+ setName("dogs")   ;
                    //System.out.println(dogNames);


                } else if (caseType[x].contentEquals("Cat")) {
                   // Pet catty = new Cat();
                    //catty.petSpeak();
                    pets = new Cat[x];
                    catNames = catNames + " " + setName("cats");
                } else if (caseType[x].contentEquals("Pig")) {
                   // Pet piggy = new Pig();
                    pigNames = pigNames + " " + setName("pigs");
                    pets = new Pig[x];
                   // System.out.println(pets);
                    //piggy.petSpeak();
                }
                //System.out.println(dogNames);
            }
            //Could include if statment to say hello to select animals
            System.out.println("Hello" + dogNames + catNames + pigNames );
        }

        public void whatPetsMakeThemSpeak() {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            Scanner scanner4 = new Scanner(System.in);
            Scanner scanner5 = new Scanner(System.in);
            Scanner scanner6 = new Scanner(System.in);
            Scanner scanner7 = new Scanner(System.in);
            Scanner scanner8 = new Scanner(System.in);


            //Scanner scanner4 = new Scanner(System.in);
            System.out.print("How many pets do you have? ");
            int numberOfPets = scanner1.nextInt();
            switch (numberOfPets) {
                case 1:
                    System.out.print("What kind of pet is it? ");
                    String case1TypeOfPets1 = scanner4.nextLine().strip();
                    String[] case1AllPets = {case1TypeOfPets1};
                    assignTypeToObjects(case1AllPets);
                    petsSpeakBack(case1AllPets);
                    break;
                case 2:
                    System.out.print("What kind of animal is the first one? ");
                    String case2TypeOfPets = scanner4.nextLine().strip();
                    System.out.print("What kind of animal is the second one? ");
                    String case2TypeOfPets2 = scanner5.nextLine().strip();
                    String[] case2AllPets = new String[2];
                    case2AllPets[0] = case2TypeOfPets;
                    case2AllPets[1] = case2TypeOfPets2;

                    System.out.println(Arrays.toString(case2AllPets));
                    assignTypeToObjects(case2AllPets);
                    petsSpeakBack(case2AllPets);
                    break;

                case 3:
                    System.out.print("What kind of animal is the first one? ");
                    String case3TypeOfPets = scanner4.nextLine().strip();
                    System.out.print("What kind of animal is the second one? ");
                    String case3TypeOfPets2 = scanner5.nextLine().strip();
                    System.out.print("What kind of animal is the third one? ");
                    String case3TypeOfPets3 = scanner6.nextLine().strip();
                    String[] case3AllPets = new String[3];
                    case3AllPets[0] = case3TypeOfPets;
                    case3AllPets[1] = case3TypeOfPets2;
                    case3AllPets[2] = case3TypeOfPets3;
                    assignTypeToObjects(case3AllPets);
                    petsSpeakBack(case3AllPets);
                    break;
                case 4:
                    System.out.print("What kind of animal is the first one? ");
                    String case4TypeOfPets = scanner4.nextLine().strip();
                    System.out.print("What kind of animal is the second one? ");
                    String case4TypeOfPets2 = scanner5.nextLine().strip();
                    System.out.print("What kind of animal is the third one? ");
                    String case4TypeOfPets3 = scanner6.nextLine().strip();
                    System.out.print("What kind of animal is the fourth one? ");
                    String case4TypeOfPets4 = scanner6.nextLine().strip();
                    String[] case4AllPets = new String[4];
                    case4AllPets[0] = case4TypeOfPets;
                    case4AllPets[1] = case4TypeOfPets2;
                    case4AllPets[2] = case4TypeOfPets3;
                    case4AllPets[3] = case4TypeOfPets4;
                    //System.out.println(case4AllPets);
                    assignTypeToObjects(case4AllPets);
                    petsSpeakBack(case4AllPets);
                    break;
            }


            //System.out.println(numberOfPets);


//            System.out.print("What kind of pets are they? " );
//            String[] typesOfPets = scanner2.nextLine().split(" ");

            // System.out.println(Arrays.toString(typesOfPets));


//            System.out.print("What are your pets names? ");
//            String[] namesOfPets = scanner3.nextLine().split(" ");

            //typesOfPets = Arrays.toString(typesOfPets);
        }
            public void petsSpeakBack(String[] caseType) {
                for(int x = 0; x < caseType.length; x++)
                if (caseType[x].contentEquals("Dog")) {
                    Pet doggy = new Dog();
                    doggy.petSpeak();
                } else if (caseType[x].contentEquals("Cat")) {
                    Pet catty = new Cat();
                    catty.petSpeak();
                } else if (caseType[x].contentEquals("Pig")) {
                    Pet piggy = new Pig();
                    piggy.petSpeak();
                }
            }
//
//           for (int x = 0; x < namesOfPets.length; x++){
//               System.out.println("hello " + namesOfPets[x]);
//           }

       // }


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
