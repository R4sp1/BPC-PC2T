package Cviceni_3;

import static Cviceni_3.BPC2.getString;

public class BPC1 implements Predmet {

    private double pointsExercises;
    private double pointsFinalExam;
    private double pointsTotal;
    public boolean problem;

    @Override
    public String getName() {
        return "BPC1";
    }

    @Override
    public double getPoints() {
        return pointsExercises + pointsFinalExam;
    }

    @Override
    public String getMark() {
        pointsTotal = getPoints();
        return getString(pointsTotal);
    }

    @Override
    public void getEval() {
        if (pointsExercises >= pointsToCredit) {
            System.out.println(getName() + " | Mate udelen zapocet s poctem bodu: " + pointsExercises + "\tCelkovy pocet bodu: " + getPoints() + "\t Vase znamka: " + getMark());
            problem = false;
        } else {
            System.out.println(getName() + " | Nemate dostatek bodu k udeleni zapoctu.\tBodu za cviceni: " + pointsExercises);
            problem = true;
        }
    }

    public void setCreditPoints(double points) {
        if (pointsExercises + points <= 20) {
            pointsExercises += points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni aktivity na hodinach je 5 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }

    public void setFinalExamPoints(double points) {
        if (points <= 80) {
            pointsFinalExam = points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni zaverecne zkousky je 80 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }


}
