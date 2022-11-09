public enum Attack {
    SWIPE(2,3,.8f,3),
    POUNCE(1,4, .85f, 2),
    BARK(1,1,1f,10),
    ROLL_OVER(0, 0, 0f, 2),
    BITE(4,6,.5f,3)
    ;

    private final int minDamage;
    private final int maxDamage;
    private final float hitChance;
    private final int speed;

    Attack(int minDamage, int maxDamage, float hitChance, int speed) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hitChance = hitChance;
        this.speed = speed;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public float getHitChance() {
        return hitChance;
    }

    public int getSpeed() {
        return speed;
    }
}
