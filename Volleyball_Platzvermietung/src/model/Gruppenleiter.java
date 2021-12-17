package model;

public class Gruppenleiter {
    String _vorname;
    String _nachname;

    public Gruppenleiter(String vorname, String nachname){
        setNachname(nachname);
        setVorname(vorname);
    }

    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    public String getNachname() {
        return _nachname;
    }
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public String getVorname() {
        return _vorname;
    }
}
