//Name: Ethan Parab
//Class Period: 5

//Instructions: Read the README.text file and complete the exercise.

import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    //create scanner object
    Scanner input = new Scanner(System.in);
    //ask for the users name
    System.out.print("Please enter your name: ");
    String username = input.nextLine();
    System.out.println("\nHello, " + username + ". Welcome to the character creator. Here, you can create any character you want! Let's go!");
    //ask which character they would like to create
    System.out.print("\nWhat character would you like to create? Options are:\n1. Elf\n2. Wizard\n3. Warrior\n(Enter 1, 2, or 3): ");
    
    int characterChoice;

    // a try loop was the simplest way I could think of to deal with bad input here
    // the basic idea here is to get a value in the set {1, 2, 3}
    // if the user does not do this, they will get as many tries as it takes for them to get it right
    while (true) {
      try {
        characterChoice = Integer.valueOf(input.nextLine());
        
        // Integer.valueOf() does not account for the fact [1,3] is the only interval I can take, so I raise this exception to do that
        if (characterChoice < 1 || characterChoice > 3) {
          throw new IllegalArgumentException();
        }

        break;
      } catch (RuntimeException e) {
        System.out.print("You didn't enter a valid input. It's okay, just try again and make sure you type in 1, 2, or 3: ");
        continue;
      }
    }

    // the GameCharacter class contains a template for all behaviors and attributes for a character. Elf, Warrior, and Wizard are all subclasses of it
    GameCharacter character;

    //check to see what character they selected
    character = new Warrior("Ethan", 50, 75, 80);
    System.out.println(character);

    //ask user for the name of the character and their attributes
    //make sure to call the correct constructor and apply the variables
    // in the proper order.



    



    
  }
}