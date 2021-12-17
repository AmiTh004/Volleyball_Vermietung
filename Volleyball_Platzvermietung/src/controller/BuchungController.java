package controller;

import java.security.PKCS12Attribute;
import java.util.ArrayList;

import model.Buchung;

public class BuchungController {

    MainController mc;

    public BuchungController(MainController mc){
        setMc(mc);
        ArrayList<Buchung> buchungen = new ArrayList<Buchung>();
    }

    public void demodata(){
        //Demodaten für Buchungen
        //Buchung b1 = new Buchung(getMc().demodata(), getMc().demodata(), 2021/03/30);
    }
    
    

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
}
