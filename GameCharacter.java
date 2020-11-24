public class GameCharacter {
  protected String name;
  protected int hp;
  protected int strength;
  protected int brain;
  protected int stealth;
  protected String weapon;
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

  // based on the specific wording of the directions, I left it to the subclasses to implement this method
  public String howMuchHealth() {
    return "";
  };

  public void changeHealth(int change) {
    hp+=change;
    if (hp < 0) {
      hp = 0;
    } else if (hp > 100) {
      hp = 100;
    }
  }
}