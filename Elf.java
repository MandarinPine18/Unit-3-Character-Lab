class Elf extends GameCharacter {
  public Elf(String name, int strength, int brain, int stealth)  {
    super(name, strength, brain, stealth, 100, "Bow");
    super.type = "Elf";
  }
}