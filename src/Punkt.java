/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */
    private int pX;
    private int pY;
    private int pZ;
    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    public void punkt(){
        this.pX = 0;
        this.pY = 0;
        this.pZ = 0;
    }
    public void punkt(int pX){
        this.pX = pX;
    }
    public void punkt(int pX, int pY, int pZ){
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }

    public void setPx(int k){
        this.pX = k;
    }
    public void setPy(int k){
        this.pY = k;
    }
    public void setPz(int k){
        this.pZ = k;
    }
    public int getX(){
        return pX;
    }
    public int getY(){
        return pY;
    }
    public int getZ(){
        return pZ * 10;
    }


    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
    public int suma(){
        return pZ + pY + pX;
    }
    public int roznica(){ return pX - pY - pZ;}
    public int roznica(int x, int y, int z){
        return pX*x - pY*y - pZ*z;
    }
    @Override
    public String toString() {
        return "Punkt{" +
                "pX=" + pX +
                ", pY=" + pY +
                ", pZ=" + pZ +'}';
    }
}

