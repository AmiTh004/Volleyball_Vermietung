package controller;

import java.security.PKCS12Attribute;
import java.util.ArrayList;

import model.Buchung;

public class BuchungController {

    MainController mc;
    ArrayList<Buchung> buchungen;


    public BuchungController(MainController mc){
        setMc(mc);
        setBuchungen(new ArrayList<Buchung>());
    }

    public void createDemoBuchung(){
        //Demodaten für Buchungen
        //Auf alle Elemente wird mit Punktnotation verwiesen
        getBuchungen().add(new Buchung(getMc().getVpc().getPlaetze().get(0), getMc().getGc().getGruppen().get(0), "13:30", (2020,03,20)));
        
    }
    
    

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
    public ArrayList<Buchung> getBuchungen() {
        return buchungen;
    }
    public void setBuchungen(ArrayList<Buchung> buchungen) {
        this.buchungen = buchungen;
    }
}
