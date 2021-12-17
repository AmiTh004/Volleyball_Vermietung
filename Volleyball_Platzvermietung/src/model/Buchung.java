package model;

import java.time.LocalDate;

public class Buchung {
    Platz platz;
    Gruppe gruppe;
    String zeit;
    LocalDate datum;

    public Buchung(Platz platz, Gruppe gruppe, String zeit, LocalDate datum) {
        setGruppe(gruppe);
        setPlatz(platz);
        setZeit(zeit);
        setDatum(datum);
    }

    public void setGruppe(Gruppe gruppe) {
        this.gruppe = gruppe;
    }
    public Gruppe getGruppe() {
        return gruppe;
    }
    public void setPlatz(Platz platz) {
        this.platz = platz;
    }
    public Platz getPlatz() {
        return platz;
    }
    public void setZeit(String zeit) {
        this.zeit = zeit;
    }
    public String getZeit() {
        return zeit;
    }
    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
    public LocalDate getDatum() {
        return datum;
    }
}
