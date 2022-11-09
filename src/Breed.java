

public enum Breed {
    BULLDOG(Attack.SWIPE, Attack.BARK),
    BEAGLE(Attack.ROLL_OVER, Attack.BARK),
    GERMAN_SHEPHERD(Attack.POUNCE, Attack.BITE, Attack.BARK),
    ;

    private final Attack[] attacks;

    Breed(Attack... attacks) {
        this.attacks = attacks;
    }

    public Attack[] getAttacks() {
        return attacks;
    }
}
