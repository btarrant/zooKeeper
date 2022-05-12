public class BatTest{
    public static void main(String[] args){

        Mammal mammal = new Mammal(100);
        GiantBat giantbat = new GiantBat();

        giantbat.attackTown();
        giantbat.attackTown();
        giantbat.attackTown();

        giantbat.eatHumans();
        giantbat.eatHumans();

        giantbat.fly();
        giantbat.fly();
    }
}
