public class Student {
    private Osoba osoba;
    private WydzialEnum.wydzial wydzial;

    public Student(Osoba osoba, WydzialEnum.wydzial wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public WydzialEnum.wydzial getWydzial() {
        return wydzial;
    }

    public void setWydzial(WydzialEnum.wydzial wydzial) {
        this.wydzial = wydzial;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
    public String toString(){
        return "Ten student to: " + osoba.getImie() + " " + osoba.getNazwisko() + ", studiuje on na wydziale: " + wydzial + "\n";
    }
}
