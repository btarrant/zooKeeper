/* Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300. */
public class GiantBat extends Mammal {
	
	public GiantBat() {
        super(300);
    }

    public void fly() {
        System.out.println("Whoosh");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Current Energy Level: " + energyLevel + " *Eats Human🍴* (+ 25)");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Crackles & Explosions!!");
        energyLevel -= 100;
    }
}