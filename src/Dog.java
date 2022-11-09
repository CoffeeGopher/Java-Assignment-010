import java.awt.Color;

public class Dog extends Damageable {
    private String name;
    private Breed breed;
    private Size size;
    private Color[] colors;
    private int age;
    private int speed;

    public Dog(String name, Breed breed, Size size, Color[] colors, int age) {
        super(size.getStartingHealth(), size.getStartingHealth());
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.colors = colors;
        this.age = age;
        speed = size.getBaseSpeed();
    }

    public Dog(String name, Breed breed, Size size, Color color, int age) {
        super(size.getStartingHealth(), size.getStartingHealth());
        this.name = name;
        this.breed = breed;
        this.size = size;
        colors = new Color[] {color};
        this.age = age;
    }

    public void eat(Food food) {
        if (food.getCharges() == 0) {
            System.out.printf("%s can't eat the %s, it's out of charges%n", name, food.getName());
            currentHealth += food.getNutritionalValue();
            if (currentHealth > maxHealth) currentHealth = maxHealth;
            food.decrementCharges();
        }
    }

    public void run() {

    }

    public void sleep() throws InterruptedException {
        System.out.println("You fool! That's the dog of time! If it sleeps, the entire thread will-");
        Thread.sleep(100000);
    }

    public void name() {

    }

    public Breed getBreed() {
        return breed;
    }

    public int getSpeed() {
        return speed;
    }
}
