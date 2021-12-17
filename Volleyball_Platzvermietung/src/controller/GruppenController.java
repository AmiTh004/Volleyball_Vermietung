package controller;

public class GruppenController {
    
    MainController mc;

    public GruppenController(MainController mc) {
        setMc(mc);
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
}
