
/**
 * Клас для зберігання інформації про автомобілі
 * @author я
 */

public class Automobile {
    // інформація про виробника,
    // модель, рік випуску, колір, ціну автомобіля
    // і чи має автомобіль відкідний дах.

    // поля класу (class fields) - описують стан об'єкта  цього класу.
    private String vyrobnyk;
    private String model;
    private int rikVypusku;
    private String kolir;
    private double tsina;
    private boolean vidkydnyiDakh;
    private int litrivNa100Km;
    private int rozmirBenzobaku;
    private int vaga;

    public void Beep(){
        System.out.println(getVyrobnyk() + " " + getModel() + " бібікнув");
    }

    public String getFullInfo() {
        return getVyrobnyk() + " " + getModel() + getRikVypusku() +
                "(" + getKolir() + ")\n" + "  $" + getTsina() + "\n"
                + " " + getLitrivNa100Km() + " літрів на 100 кмб бак: "
                + getRozmirBenzobaku() + "л\n";
    }

    double tsinaZaPovnyiBak(double tsinaZaLitr) {
        return tsinaZaLitr* getRozmirBenzobaku();
    }

    double getNaSkilkyVystachytBenzynu (double kilkistBenzynuVBatsi) {
        return (int) (100* (double)kilkistBenzynuVBatsi/(double) getLitrivNa100Km());
    }

    int getMaxDistance(){
        return (int) (100*(double) getRozmirBenzobaku() /(double) getLitrivNa100Km());
    }

    public String getVyrobnyk() {
        return vyrobnyk;
    }

    public void setVyrobnyk(String newVyrobnyk) {
        if (newVyrobnyk.length()>50)
        {
            this.vyrobnyk = newVyrobnyk.substring(0, 50);
        }
        else
        {
            this.vyrobnyk = newVyrobnyk;
        }
        this.vyrobnyk = vyrobnyk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRikVypusku() {
        if (rikVypusku>2021){
            this.rikVypusku = 2021;
        }
        else{
            this.rikVypusku = rikVypusku;
        }
        return rikVypusku;
    }

    public void setRikVypusku(int rikVypusku) {
        this.rikVypusku = rikVypusku;
    }

    public String getKolir() {
        return kolir;
    }

    public void setKolir(String kolir) {
        this.kolir = kolir;
    }

    public double getTsina() {
        return tsina;
    }

    public void setTsina(double tsina) {
        this.tsina = tsina;
    }

    public boolean isVidkydnyiDakh() {
        return vidkydnyiDakh;
    }

    public void setVidkydnyiDakh(boolean vidkydnyiDakh) {
        this.vidkydnyiDakh = vidkydnyiDakh;
    }

    public int getLitrivNa100Km() {
        return litrivNa100Km;
    }

    public void setLitrivNa100Km(int litrivNa100Km) {
        this.litrivNa100Km = litrivNa100Km;
    }

    public int getRozmirBenzobaku() {
        return rozmirBenzobaku;
    }

    public void setRozmirBenzobaku(int rozmirBenzobaku) {
        this.rozmirBenzobaku = rozmirBenzobaku;
    }

    public int getVaga() {
        return vaga;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }
}
