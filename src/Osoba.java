public class Osoba {
    private String imie;
    private String nazwisko;
    private int indeks;

    public Osoba(){}

    public Osoba(String imie, String nazwisko, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String toString(){

        return " Imie: " + imie + "\n Nazwisko: " + nazwisko + "\n indeks: " + indeks;
    }
}
