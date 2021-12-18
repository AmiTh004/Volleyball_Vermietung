package controller;

import java.util.ArrayList;

import model.Platz;

public class PlatzController {

    MainController mc;
    ArrayList<Platz> plaetze;

    public PlatzController(MainController mc) {
        setMc(mc);
        setPlaetze(new ArrayList<Platz>());
    }

    public void createDemoPlaetze() {
        getPlaetze().add(new Platz(1, "gut", 6));
        getPlaetze().add(new Platz(2, "befriedigend", 4));
        getPlaetze().add(new Platz(3, "mieserabel", 6));
        
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
    public void setPlaetze(ArrayList<Platz> plaetze) {
        this.plaetze = plaetze;
    }
    public ArrayList<Platz> getPlaetze() {
        return plaetze;
    }
    
}
