public class Meble {
    protected double wysokosc;
    protected double szerokosc;
    protected double cena;

    public Meble(){
        this.wysokosc = 0.0;
        this.szerokosc= 0.0;
        this.cena = 0.0;
    }
    public Meble(double wysokosc, double szerokosc, double cena){
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.cena = cena;
    }
    protected double wyliczCene(){
        return cena;
    }

    @Override
    public String toString() {
        return "Meble{" +
                "wysokosc=" + wysokosc +
                ", szerokosc=" + szerokosc +
                ", cena=" + cena +
                '}';
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
