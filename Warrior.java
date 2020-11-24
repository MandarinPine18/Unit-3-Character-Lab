class Warrior extends GameCharacter {
  public Warrior(String name, int strength, int brain, int stealth) {
    super(name, strength, brain, stealth, 100, "Sword");
    super.type = "Warrior";
  }

  @Override
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