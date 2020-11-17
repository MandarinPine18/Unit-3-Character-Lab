class Wizard extends GameCharacter {
  public Wizard(String name, int strength, int brain, int stealth) {
    super(name, strength, brain, stealth, 100, "Staff");
    super.type = "Wizard";
  }
}