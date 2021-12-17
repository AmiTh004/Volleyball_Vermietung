package controller;

import model.Buchung;
import model.Gruppe;
import model.Gruppenleiter;
import model.Platz;
import view.Output;

public class MainController {

    public MainController(){
        BuchungController bc = new BuchungController(this);
        Output op = new Output();
        //Erzeugen der Volleyballplätze
        
    }
    
    public void demodata() {
        Platz p1 = new Platz(1, "gut", 6);
        Platz p2 = new Platz(2, "nicht gut", 4);

        Gruppenleiter gl1 = new Gruppenleiter("Sven", "Seemann");
        Gruppenleiter gl2 = new Gruppenleiter("Charlotte", "Brasse");
        Gruppenleiter gl3 = new Gruppenleiter("Leonie", "Essink");
        Gruppenleiter gl4 = new Gruppenleiter("Haley", "Selle");

        Gruppe g1 = new Gruppe(5, gl1);
        Gruppe g2 = new Gruppe(7, gl2);
        Gruppe g3 = new Gruppe(4, gl3);
        Gruppe g4 = new Gruppe(3, gl4);
        
        

    }
}
