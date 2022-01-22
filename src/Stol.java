public class Stol extends Meble{
    protected String firma;
    protected double promocja;
    private boolean czyJest;

    public Stol() {
        super();
        this.firma = "";
        this.promocja = 0;
        this.czyJest = false;
    }
    public Stol(String firma, double promocja, boolean czyJest){
        this.firma = firma;
        this.promocja = promocja;
        this.czyJest = czyJest;
    }
    public Stol(double wysokosc, double szerokosc, double cena, String firma, double promocja, boolean czyJest){
        super(wysokosc, szerokosc, cena);
        this.firma = firma;
        this.promocja = promocja;
        this.czyJest = czyJest;
    }
    protected double wyliczCene(){
        return super.wyliczCene() * promocja;
    }

    @Override
    public String toString() {
        return "Stol{" + super.toString() +
                ", firma='" + firma + '\'' +
                ", promocja=" + promocja +
                ", czyJest=" + czyJest +
                '}';
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public double getPromocja() {
        return promocja;
    }

    public void setPromocja(double promocja) {
        this.promocja = promocja;
    }

    public boolean isCzyJest() {
        return czyJest;
    }

    public void setCzyJest(boolean czyJest) {
        this.czyJest = czyJest;
    }
}
