package factory;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a pet");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Exit");
        System.out.print("Enter number: ");
        Integer choice = input.nextInt();

        PetRecord petRecord = new PetRecord();
        Pet pet;

        switch (choice) {
            case 1:
                pet = new Dog();
                petRecord.setPetName("Bantay");
                petRecord.setPetId("P001");
                petRecord.setPet(pet);
                ((Dog) pet).setBreed("German shepherd");
                break;

            case 2:
                pet = new Cat();
                petRecord.setPetName("Muning");
                petRecord.setPetId("P002");
                petRecord.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                break;
            case 3:
                System.exit(0);

        }

        System.out.println("Pet id is " + petRecord.getPetId());
        System.out.println("Pet name is " + petRecord.getPetName());
        System.out.println("Pet kind: " + petRecord.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: " + petRecord.getPet().makeSound());
        System.out.println("Play mode: " + petRecord.getPet().play());


    }

}
