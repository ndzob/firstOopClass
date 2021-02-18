public class FirstOopClass {
    public static void main(String[] arg) {
        /*
        // створити новий об'єкт класу/типу "Box"
        Box myBox = new Box();
        myBox.width = 2; // "dot operator" (крапка)
        myBox.height = 3;
        myBox.length = 4;

        // double obyem = myBox.height * myBox.length * myBox.width;
        double obyem = myBox.Obyem();
        System.out.println(obyem);

        Box myBox2 = new Box();
        myBox2.height = 1;
        myBox2.width = 2;
        myBox2.length = 3;
        System.out.println(myBox2.Obyem());
    */
        Automobile a1 = new Automobile();
        a1.setVyrobnyk("Mercedes");
        a1.setModel("CSL");
        a1.setTsina(45000);
        a1.setLitrivNa100Km(10);
        a1.setRikVypusku(2021);
        a1.setRozmirBenzobaku(40);
        a1.setKolir("червоний");
        System.out.println(a1.getFullInfo());
        System.out.println("Вартість за повний бак "+ a1.tsinaZaPovnyiBak(10));
        System.out.println( a1.getNaSkilkyVystachytBenzynu(5));
        System.out.println(a1.getMaxDistance());
        a1.Beep();

        Automobile a2 = new Automobile();
        a2.setVyrobnyk("Ford");
        a2.setModel("Mustang");
        a2.Beep();

        System.out.println(a1.getVyrobnyk());
        System.out.println(a2.getVyrobnyk());
    }
}
