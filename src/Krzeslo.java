public class Krzeslo extends Meble{
    protected int udzwig;
    protected double obnizka;
    private boolean czyJest;

    public Krzeslo(){
        super();
        this.udzwig = 0;
        this.obnizka = 0;
        this.czyJest = false;
    }

    public Krzeslo(int udzwig,double obnizka,  boolean czyJest){
        this.udzwig = udzwig;
        this.obnizka = obnizka;
        this.czyJest = czyJest;
    }
    public Krzeslo(double wysokosc, double szerokosc, double cena, int udzwig,double obnizka, boolean czyJest){
        super(wysokosc, szerokosc, cena);
        this.udzwig = udzwig;
        this.obnizka = obnizka;
        this.czyJest = czyJest;
    }

    @Override
    protected double wyliczCene() {
        return super.wyliczCene() - obnizka;
    }


    @Override
    public String toString() {
        return "Krzeslo{" + super.toString() +
                ", udzwig=" + udzwig +
                ", obnizka=" + obnizka +
                ", czyJest=" + czyJest +
                '}';
    }

    public int getUdzwig() {
        return udzwig;
    }

    public void setUdzwig(int udzwig) {
        this.udzwig = udzwig;
    }

    public double getObnizka() {
        return obnizka;
    }

    public void setObnizka(double obnizka) {
        this.obnizka = obnizka;
    }

    public boolean isCzyJest() {
        return czyJest;
    }

    public void setCzyJest(boolean czyJest) {
        this.czyJest = czyJest;
    }
}
