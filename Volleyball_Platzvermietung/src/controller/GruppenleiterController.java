package controller;

import java.util.ArrayList;

import model.Gruppenleiter;

public class GruppenleiterController {

    MainController mc;
    ArrayList<Gruppenleiter> gruppenleiters;

    public GruppenleiterController(MainController mc) {
        setMc(mc);
        setGruppenleiters(new ArrayList<Gruppenleiter>());
    }

    public void createDemoGruppenleiter() {
        getGruppenleiters().add(new Gruppenleiter("Sven", "Seemann"));
        getGruppenleiters().add(new Gruppenleiter("Charlotte", "Brasse"));
        getGruppenleiters().add(new Gruppenleiter("Leonie", "Essink"));
        getGruppenleiters().add(new Gruppenleiter("Haley", "Selle"));
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
    public void setGruppenleiters(ArrayList<Gruppenleiter> gruppenleiters) {
        this.gruppenleiters = gruppenleiters;
    }
    public ArrayList<Gruppenleiter> getGruppenleiters() {
        return gruppenleiters;
    }
    
}
