public abstract class Damageable {
    protected int currentHealth;
    protected int maxHealth;

    public Damageable(int currentHealth, int maxHealth) {
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void changeHealth(int changeValue) {
        currentHealth += changeValue;
        if (currentHealth < 0) {
            currentHealth = 0;
            return;
        }
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
    }
}
