public class Main {
    public static void main(String[] args) {
        Cykel cykel = new Cykel();

        cykel.navn = "Merckx";
        cykel.farve = "graa";
        cykel.hastighed = 10;
        cykel.hjul = 2;
        cykel.motor = "fodrevet";
        cykel.bremsetype = "fodbremse";

        cykel.dyt();

        Bus movia = new Bus();
        movia.maxpassagerer = 30;
        movia.navn = "A-bus";
        movia.farve = "gul";
        movia.hastighed = 40;
        movia.hjul = 4;
        movia.vinduer = 10;

        movia.dyt();

        Bil bil = new Bil();

        bil.navn = "ferrari";
        bil.farve = "sort";
        bil.hastighed = 80;
        bil.hjul = 4;
        bil.motor = "Motor";
        bil.vinduer = 4;

        bil.dyt();

    }
}
