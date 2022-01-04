package model;

import java.time.LocalDate;
import java.util.Date;
import java.text.*;

public class Buchung {
    Platz platz;
    Gruppe gruppe;
    String zeit;
    Date datum;

    public Buchung(Platz platz, Gruppe gruppe, String zeit, String datum) throws ParseException {
        setGruppe(gruppe);
        setPlatz(platz);
        setZeit(zeit);   
        setDatum(new SimpleDateFormat("dd.MM.yyyy").parse(datum));    
    }

    public String createDate() throws ParseException {
        
        Date date = new SimpleDateFormat("dd.MM.yyyy").parse("21.02.2020");
        System.out.println(date);
        
        return null;
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
    public void setDatum(Date datum) {
        this.datum = datum;
    }
    public Date getDatum() {
        return datum;
    }
}
