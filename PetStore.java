import java.util.Scanner;

class PetStore {
    public static void main(String[] args) {
        System.out.println("Petstore v1.0");

        Scanner myPet = new Scanner(System.in); // Create a Scanner object
        System.out.println("Select Pet (Dog, Cat, Fish, Bird): ");

        String myPetStr = myPet.nextLine(); // Read user input

        Scanner myBreed = new Scanner(System.in); // Create a Scanner object
        String myBreedStr = ""; // Initialize myBreedStr

        if (myPetStr.equalsIgnoreCase("Dog")) {
            System.out.println("Select Breed (Bulldog, Poodle, Golden Retriever, Labrador): ");
            myBreedStr = myBreed.nextLine(); // Read user input

            if (myBreedStr.equalsIgnoreCase("Bulldog") || myBreedStr.equalsIgnoreCase("Poodle") ||
                myBreedStr.equalsIgnoreCase("Golden Retriever") || myBreedStr.equalsIgnoreCase("Labrador")) {
                System.out.println("Item ID        Product ID       Description                      List Price");
                System.out.println("EST-22           K9-RT-02       Adult Male " + myBreedStr + "                $135.50");
                System.out.println("EST-23           K9-RT-02       Adult Female " + myBreedStr + "              $145.49");
            } else {
                System.out.println("The selected dog breed does not exist.");
            }
        } else if (myPetStr.equalsIgnoreCase("Cat")) {
            System.out.println("Select Breed (Manx, Persian): ");
            myBreedStr = myBreed.nextLine(); // Read user input

            if (myBreedStr.equalsIgnoreCase("Manx") || myBreedStr.equalsIgnoreCase("Persian")) {
                System.out.println("Item ID        Product ID       Description                      List Price");
                System.out.println("EST-14           FL-DSH-01       Tailless " + myBreedStr + "              $58.50");
                System.out.println("EST-15           FL-DSH-01       With tail " + myBreedStr + "               $23.50");
            } else {
                System.out.println("The selected cat breed does not exist.");
            }
        } else if (myPetStr.equalsIgnoreCase("Fish")) {
            System.out.println("Select Breed (Angel Fish, Tiger Shark, Koi, Goldfish): ");
            myBreedStr = myBreed.nextLine(); // Read user input

            if (myBreedStr.equalsIgnoreCase("Angel Fish") || myBreedStr.equalsIgnoreCase("Tiger Shark") ||
                myBreedStr.equalsIgnoreCase("Koi") || myBreedStr.equalsIgnoreCase("Goldfish")) {
                System.out.println("Item ID        Product ID       Description                 List Price");
                System.out.println("EST-4            FI-FW-01         Spotted " + myBreedStr + "           $18.50");
                System.out.println("EST-5            FI-FW-01         Spotless " + myBreedStr + "           $18.50");
            } else {
                System.out.println("The selected fish breed does not exist.");
            }
        } else if (myPetStr.equalsIgnoreCase("Bird")) {
            System.out.println("Select Breed (Amazon Parrot, Finch): ");
            myBreedStr = myBreed.nextLine(); // Read user input

            if (myBreedStr.equalsIgnoreCase("Amazon Parrot") || myBreedStr.equalsIgnoreCase("Finch")) {
                System.out.println("Item ID        Product ID       Description                 List Price");
                System.out.println("EST-18           AV-CB-01          Adult Male " + myBreedStr + "           $193.50");
            } else {
                System.out.println("The selected bird breed does not exist.");
            }
        } else {
            System.out.println("Not Existing Pet");
        }

    }
}
