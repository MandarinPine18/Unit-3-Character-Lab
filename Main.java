//Name: Ethan Parab
//Class Period: 5

//Instructions: Read the README.text file and complete the exercise.

import java.util.Scanner;

class Main {
  //create scanner object
  private static final Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    //ask for the users name
    String username = input("Please enter your name: ");
    System.out.println("\nHello, " + username + ". Welcome to the character creator. Here, you can create any character you want! Let's go!");
    //ask which character they would like to create
    System.out.print("\nWhat character would you like to create? Options are:\n1. Elf\n2. Wizard\n3. Warrior\n(Enter 1, 2, or 3): ");

    int characterChoice;

    // a try loop was the simplest way I could think of to deal with bad input here
    // the basic idea here is to get a value in the set {1, 2, 3}
    // if the user does not do this, they will get as many tries as it takes for them to get it right
    while (true) {
      try {
        characterChoice = Integer.parseInt(input.nextLine());

        // Integer.valueOf() does not account for the fact [1,3] is the only interval I can take, so I raise this exception to do that
        if (characterChoice < 1 || characterChoice > 3) {
          throw new IllegalArgumentException();
        }

        break;
      } catch (RuntimeException e) {
        System.out.print("You didn't enter a valid input. It's okay, just try again and make sure you type in 1, 2, or 3: ");
      }
    }

    // the GameCharacter class contains a template for all behaviors and attributes for a character. Elf, Warrior, and Wizard are all subclasses of it
    GameCharacter character;

    //ask user for the name of the character and their attributes
    //make sure to call the correct constructor and apply the variables
    // in the proper order.
    String name = input("Name: ");
    int strength;
    int brain;
    int stealth;
    while (true) {
      try {
        strength = Integer.parseInt(input("Strength: "));
        brain = Integer.parseInt(input("Brain: "));
        stealth = Integer.parseInt(input("Stealth: "));
        break;
      } catch (IllegalArgumentException e) {
        System.out.print("You didn't enter a valid input. It's okay, just try again and make sure you type in an integer: ");
      }
    }
    if (characterChoice == 1) {
      character = new Elf(name, strength, brain, stealth);
    } else if (characterChoice == 2) {
      character = new Wizard(name, strength, brain, stealth);
    } else if (characterChoice == 3) {
      character = new Warrior(name, strength, brain, stealth);
    } else {
      System.exit(1);
    }

  }

  // this makes it easier for me to accept input
  // if I want to dig into the specifics of input (i.e. character choice loop) will just do use the input object instead
  private static String input(String prompt) {
    System.out.print(prompt);
    return input.nextLine();
  }
}