public class Main {
    public static void main(String[] args) {

        Sabre sabre = new Sabre("Rouge");
        Jedi jedi = new Jedi("Sami", 10, 40, 32, 100, sabre);

        Blaster blaster = new Blaster();
        SoldatClone soldatClone = new SoldatClone("Mobidibou", 23, 43, blaster);

        jedi.parler();
        jedi.allumer();
        jedi.allumer();
        jedi.coupSabre(soldatClone);
        jedi.eteindre();
        jedi.coupSabre(soldatClone);

        soldatClone.parler();
        soldatClone.allumeBlaster();
        soldatClone.eteindreBlaster();
        soldatClone.tireBlaster(jedi);
    }

}