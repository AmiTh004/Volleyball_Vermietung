package controller;

public class PlatzController {

    MainController mc;

    public PlatzController(MainController mc) {
        setMc(mc);
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
    
}
