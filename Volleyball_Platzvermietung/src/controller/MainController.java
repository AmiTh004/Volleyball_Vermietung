package controller;

import view.Output;

public class MainController {

    BuchungController bc;
    GruppenController gc;
    PlatzController vpc;
    GruppenleiterController glc;
    Output op;

    public MainController(){
        setBc(new BuchungController(this));
        setGc(new GruppenController(this));
        setVpc(new PlatzController(this));
        setOp(new Output()) ;
        setGlc(new GruppenleiterController(this));
        
        demodata();
        printDemodata();

        
    }
    
    public void demodata() {
        //Reihenfolge beachten, sonst gibt es eine Nullpointerexeption, da sich in Buchung auf Elemente bezogen wird, die noch nicht erstelt sind.
       getGc().createDemoGruppe();
       getVpc().createDemoPlaetze();
       getBc().createDemoBuchung();
    }

    public void printDemodata() {
        getGc().printGruppen();
    }

    /**
     * 
     * SETTER UND GETTER
     */

     public void setBc(BuchungController bc) {
         this.bc = bc;
     }
     public BuchungController getBc() {
         return bc;
     }
     public void setGc(GruppenController gc) {
         this.gc = gc;
     }
     public GruppenController getGc() {
         return gc;
     }
     public void setVpc(PlatzController vpc) {
         this.vpc = vpc;
     }
     public PlatzController getVpc() {
         return vpc;
     }
     public void setOp(Output op) {
         this.op = op;
     }
     public Output getOp() {
         return op;
     }
     public void setGlc(GruppenleiterController glc) {
         this.glc = glc;
     }
     public GruppenleiterController getGlc() {
         return glc;
     }
}

