public class Food {
    private String name;
    private int nutritionalValue;
    private int charges;

    public Food(String name, int nutritionalValue, int charges) {
        if (charges < 0) {
            throw new IllegalArgumentException("Charges must be at least 0");
        }
        if (nutritionalValue < 0) {
            throw new IllegalArgumentException("Nutritional value must be at least 0");
        }

        this.name = name;
        this.nutritionalValue = nutritionalValue;
        this.charges = charges;
    }

    public String getName() {
        return name;
    }

    public int getNutritionalValue() {
        return nutritionalValue;
    }

    public int getCharges() {
        return charges;
    }

    public void decrementCharges() {
        if (charges > 0) charges--;
    }
}
