package Cviceni_3;

public class BPC2 implements Predmet{

    private int pointsProject;
    private int pointsHalfExam;
    private int pointsFinalExam;
    private int pointsTotal;
    public boolean problem;


    @Override
    public String getName() {
        return "BPC2";
    }

    @Override
    public int getPoints() {
        return pointsProject + pointsHalfExam + pointsFinalExam;
    }

    @Override
    public String getMark() {
        pointsTotal = getPoints();
        if(pointsTotal >= 90){
            return "A";
        }else if(pointsTotal >= 80){
            return "B";
        }else if(pointsTotal >= 70){
            return "C";
        }else if(pointsTotal >= 60){
            return "D";
        }else if(pointsTotal >= 50){
            return "E";
        }else {
            return "F";
        }
    }

    @Override
    public void getEval() {
        if (pointsProject >= pointsToCredit){
            System.out.println(getName() + " | Mate udelen zapocet s poctem bodu: " + pointsProject + "\tCelkovy pocet bodu: " + getPoints() + "\t Vase znamka: " + getMark());
            problem = false;
        } else {
            System.out.println(getName() + " | Nemate dostatek bodu k udeleni zapoctu.");
            problem = true;
        }
    }

    public void setProjectPoints(int points){
        if (points < 31){
            pointsProject = points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni projektu je 30 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }

    public void setHalfExamPoints(int points){
        if (points < 21){
            pointsHalfExam = points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni pulsemestralniho testu je 20 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }

    public void setFinalExamPoints(int points){
        if (points < 51){
            pointsFinalExam = points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni zaverecne zkousky je 50 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }
}
