class GorillaTest {
    public static void main(String[] args) {
        
        // Mammal mam = new Mammal();
        Gorilla gorilla = new Gorilla(100);

        // System.out.println(gorilla);

        gorilla.displayEnergy();

        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        gorilla.displayEnergy();

        gorilla.eatBananas();
        gorilla.eatBananas();

        gorilla.displayEnergy();

        gorilla.climb();
        gorilla.climb();

        gorilla.displayEnergy();
    }
}
