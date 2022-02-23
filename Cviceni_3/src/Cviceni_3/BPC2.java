package Cviceni_3;

public class BPC2 implements Predmet {

    private double pointsProject;
    private double pointsHalfExam;
    private double pointsFinalExam;
    public boolean problem;

    @Override
    public String getName() {
        return "BPC2";
    }

    @Override
    public double getPoints() {
        return pointsProject + pointsHalfExam + pointsFinalExam;
    }

    @Override
    public String getMark() {
        var pointsTotal = getPoints();
        return getString(pointsTotal);
    }

    public static String getString(double pointsTotal) {
        if (pointsTotal >= 90) {
            return "A";
        } else if (pointsTotal >= 80) {
            return "B";
        } else if (pointsTotal >= 70) {
            return "C";
        } else if (pointsTotal >= 60) {
            return "D";
        } else if (pointsTotal >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    @Override
    public void getEval() {
        if (pointsProject + pointsHalfExam >= pointsToCredit) {
            System.out.println(getName() + " | Mate udelen zapocet s poctem bodu: " + pointsProject + "\tCelkovy pocet bodu: " + getPoints() + "\t Vase znamka: " + getMark());
            problem = false;
        } else {
            double point = pointsProject + pointsHalfExam;
            System.out.println(getName() + " | Nemate dostatek bodu k udeleni zapoctu.\tBodu z projektu a testu: " + point);
            problem = true;
        }
    }

    public void setProjectPoints(double points) {
        if (points <= 30) {
            pointsProject = points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni projektu je 30 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }

    public void setHalfExamPoints(double points) {
        if (points <= 20) {
            pointsHalfExam = points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni pulsemestralniho testu je 20 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }

    public void setFinalExamPoints(double points) {
        if (points <= 50) {
            pointsFinalExam = points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni zaverecne zkousky je 50 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }
}
