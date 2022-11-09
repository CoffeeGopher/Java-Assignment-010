import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Bones", Breed.BULLDOG, Size.LARGE, Color.LIGHT_GRAY, 5));
        dogs.add(new Dog("Sir Barksalot", Breed.BEAGLE, Size.LARGE, Color.ORANGE, 6));
        dogs.add(new Dog("Spitz", Breed.GERMAN_SHEPHERD, Size.LARGE, new Color[] {Color.WHITE, Color.ORANGE}, 6));

        List<EvilMonster> monstersThatAreEvil = new ArrayList<>();
        monstersThatAreEvil.add(new EvilMonster("Jerry", 10, 5));
        monstersThatAreEvil.add(new EvilMonster("John", 12, 4));
        monstersThatAreEvil.add(new EvilMonster("Some Dude", 18, 2));

        fight(dogs, monstersThatAreEvil);
    }

    private static void fight(List<Dog> dogs, List<EvilMonster> monsters) {
        Random r = new Random();
        List<Damageable> turnOrder = new ArrayList<>();
        Map<Damageable, Integer> speedMap = new HashMap<>();
        Map<Dog, Attack> chosenAttack = new HashMap<>();
        for (Dog dog : dogs) {
            turnOrder.add(dog);
            Attack[] attacks = dog.getBreed().getAttacks();
            Attack randomAttack = attacks[r.nextInt(attacks.length)];
            chosenAttack.put(dog, randomAttack);
            speedMap.put(dog, randomAttack.getSpeed() + dog.getSpeed() + r.nextInt(2));
        }

        for (EvilMonster monster : monsters) {
            turnOrder.add(monster);
            speedMap.put(monster, monster.getSpeed() + r.nextInt(3));
        }

        turnOrder.sort((d1, d2) -> speedMap.get(d2) - speedMap.get(d1));
    }
}
