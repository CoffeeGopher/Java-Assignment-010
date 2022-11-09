public enum Size {
    LARGE(18, 1),
    MEDIUM(14, 3),
    SMALL(10, 5),
    ANT_SIZED(6, 8),
    ;

    private final int startingHealth;
    private final int baseSpeed;

    Size(int startingHealth, int baseSpeed) {
        this.startingHealth = startingHealth;
        this.baseSpeed = baseSpeed;
    }

    public int getStartingHealth() {
        return startingHealth;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }
}
