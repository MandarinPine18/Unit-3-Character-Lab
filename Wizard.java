class Wizard extends GameCharacter {
  public Wizard(String name, int strength, int brain, int stealth) {
    super(name, strength, brain, stealth, 100, "Staff");
    super.type = "Wizard";
  }

  // implemented separately due to direction specifics
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
    return name + "'s health is " + hp + ", which is " + status + ".";
  }
}