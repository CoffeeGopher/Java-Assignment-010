public class EvilMonster extends Damageable {
    private String name;
    private int speed;

    public EvilMonster(String name, int health, int speed) {
        super(health, health);
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
