package model;

public class Platz {
    int _nummer;
    String _zustand;
    int _max_personen;

    public Platz(int nummer, String zustand, int max_personen){
        setMaxPersonen(max_personen);
        setZustand(zustand);
        setNummer(nummer);
    }

    /**
     * 
     * SETTER UND GETTER
     */

     public void setMaxPersonen(int max_personen) {
         this._max_personen = max_personen;
     }
     public int getMaxPersonen() {
         return _max_personen;
     }
     public void setNummer(int nummer) {
         this._nummer = nummer;
     }
     public int getNummer() {
         return _nummer;
     }
     public void setZustand(String zustand) {
         this._zustand = zustand;
     }
     public String getZustand() {
         return _zustand;
     }
}
