import model.Bibliothek;
import model.DVD;
import model.Kunde;
import model.Medium;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bibliothek bibliothek = new Bibliothek("Bibliothek Berlin");

        Kunde k1 = new Kunde("122212", "Max Müller");
        DVD dvd1 = new DVD(12, "Sport");


        bibliothek.add(k1);
        bibliothek.add(dvd1);
        bibliothek.starteAusleihe(k1, dvd1);



    }
}