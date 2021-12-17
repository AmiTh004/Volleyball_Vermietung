package model;

public class Gruppe {
    int _anzahl;
    Gruppenleiter _gruppenleiter;

    public Gruppe(int anzahl, Gruppenleiter gruppenleiter){
        setAnzahl(anzahl);
        setGruppenleiter(gruppenleiter);
    }

    public void setAnzahl(int anzahl) {
        this._anzahl = anzahl;
    }
    public int getAnzahl() {
        return _anzahl;
    }
    public void setGruppenleiter(Gruppenleiter gruppenleiter) {
        this._gruppenleiter = gruppenleiter;
    }
    public Gruppenleiter getGruppenleiter() {
        return _gruppenleiter;
    }
}
