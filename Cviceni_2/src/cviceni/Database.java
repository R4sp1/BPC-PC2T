package cviceni;

public class Database {
    private String Name;                                                //Definice promennych
    private int Year;
    private double Obligation = 0;
    private static double MaxObligation = 1;

    public String getName() {                                           //Gettery pro jednotlive promenne
        return Name;
    }

    public int getYear() {
        return Year;
    }

    public double getObligation() {
        return Obligation;
    }

    public static void setMaxObligation(double car) {         //Nastavuje vysi maximalniho uvazku (v zakladu 1)
        MaxObligation = car;
    }

    public boolean AddObligation(double Obligation) {                   //Metoda ktera kontroluje hodnotu maximalniho uvazku
        if (this.Obligation + Obligation > MaxObligation) {             // - v pripade volneho uvazku prida novy uvazek a vrati true
            return false;                                               // - V pripade maximalniho uvazku vrati false
        } else {
            this.Obligation += Obligation;
            return true;
        }
    }

    public Database(String name, int year) {                            //Konstruktor tridy - nastavujeme jmeno a rok
        this.Name = name;
        this.Year = year;
    }
}
