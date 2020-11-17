class Warrior extends GameCharacter {
  public Warrior(String name, int strength, int brain, int stealth) {
    super(name, strength, brain, stealth, 100, "Sword");
    super.type = "Warrior";
  }
}