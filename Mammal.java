/* Create a Mammal class that has an energyLevel member variable and displayEnergy()
method. The displayEnergy() method should show the animal's energy level as well
as return it.*/

public class Mammal {
    
    protected int energyLevel = 100;
    
    public int displayEnergy() {
        System.out.println("Energy Level -> " + energyLevel);
        return energyLevel; 
    }

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}

