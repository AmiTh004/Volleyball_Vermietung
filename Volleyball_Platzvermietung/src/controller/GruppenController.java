package controller;

import java.util.ArrayList;

import model.Gruppe;
import model.Gruppenleiter;

public class GruppenController {
    
    MainController mc;
    ArrayList<Gruppe> gruppen;

    public GruppenController(MainController mc) {
        setMc(mc);
        gruppen = new ArrayList<Gruppe>();
    }

    public void createDemoGruppe() {
        

        getGruppen().add(new Gruppe(5, getMc().getGlc().getGruppenleiters().get(0)));
        getGruppen().add(new Gruppe(7, getMc().getGlc().getGruppenleiters().get(1)));
        getGruppen().add(new Gruppe(4, getMc().getGlc().getGruppenleiters().get(0)));
        getGruppen().add(new Gruppe(3, getMc().getGlc().getGruppenleiters().get(2)));
    }

    public void printGruppen() {
        for (Gruppe gruppe : gruppen) {
            getMc().getOp().printData(gruppe.getGruppenleiter().getNachname() + " "+gruppe.getGruppenleiter().getVorname());
        }
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
    public ArrayList<Gruppe> getGruppen() {
        return gruppen;
    }
}
