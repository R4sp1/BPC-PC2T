package Cviceni_3;

import static Cviceni_3.BPC2.getString;

public class BPIS implements Predmet {

    private double points;
    public boolean problem;

    @Override                                                                                                           //Prepisuje nadrazenou classu
    public String getName() {
        return "BPIS";
    }

    @Override
    public double getPoints() {
        return points;
    }

    @Override
    public String getMark() {                                                                                           //Na zaklade bodu priradi znamku
        var pointsTotal = getPoints();
        return getString(pointsTotal);
    }

    @Override
    public void getEval() {
        if (points >= pointsToCredit) {                                                                                 //Udeleni zapoctu
            System.out.println(getName() + " | Mate udelen zapocet.\t\t\t\t\t\tCelkovy pocet bodu: " + getPoints() + "\t Vase znamka: " + getMark());
        } else {
            System.out.println(getName() + " | Nemate dostatek bodu k udeleni zapoctu.");
        }
    }


    public void setPoints(double points) {
        if (points <= 100) {
            this.points = points;
            problem = false;
        } else {
            System.out.println("Maximalni pocet bodu v predmetu je 100 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }
}
