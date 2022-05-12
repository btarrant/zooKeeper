public class Gorilla extends Mammal {

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public void throwSomething() {
        System.out.println("Gorilla throws");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla eats banana");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("Gorilla climbs");
        energyLevel -= 10;
    }
}
