public class GameCharacter {
  private String name;
  private int hp;
  private int strength;
  private int brain;
  private int stealth;
  private String weapon;
  protected String type = "character";   // meant to be changed by subclass

  protected GameCharacter(String name, int strength, int brain, int stealth, int hp, String weapon) {
    this.name = name;
    this.strength = strength;
    this.brain = brain;
    this.stealth = stealth;
    this.hp = hp;
    this.weapon = weapon;
  }

  public String toString() {
    return "You have created "+ name + " who is " + inDefArtWord(type.toLowerCase()) + " with " + hp + " health.  Their weapon of choice is a " + weapon + ".  They have the following characteristics:\nStrength: " + strength +"\nBrain: " + brain + "\nStealth: " + stealth;
  }
  
  // this is just to tack on the right indefinite article (a or an) to the word given
  private String inDefArtWord(String word) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (char i : vowels) {
      if (word.charAt(0) == i) {
        return "an " + word;
      }
    }
    return "a " + word;
  }

  //add howMuchHealth method here.
  public String howMuchHealth() {
    String status;
    if (hp == 100) {
      status = "full";
    } else if (hp >= 50) {
      status = "high";
    } else {
      status = "low";
    }
    return name + "'s health is " + status;
  }
}