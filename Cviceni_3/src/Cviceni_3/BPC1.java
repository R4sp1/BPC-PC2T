package Cviceni_3;

public class BPC1 implements Predmet {

    private int pointsTutorials;
    private int pointsFinalExam;
    private int pointsTotal;
    public boolean problem;

    @Override
    public String getName() {
        return "BPC1";
    }

    @Override
    public int getPoints() {
        return pointsTutorials + pointsFinalExam;
    }

    @Override
    public String getMark() {
        pointsTotal = getPoints();
        if(pointsTotal >= 90){
            return "A";
        }else if(pointsTotal >= 80 && pointsTotal <=90){
            return "B";
        }else if(pointsTotal >= 70 && pointsTotal <=80){
            return "C";
        }else if(pointsTotal >= 60 && pointsTotal <=80){
            return "D";
        }else if(pointsTotal >= 50 && pointsTotal <=60){
            return "E";
        }else {
            return "F";
        }
    }

    @Override
    public void getEval() {
        if (pointsTutorials > BODYKZAPOCTU - 1){
            System.out.println(getName() + " | Gratulujeme, mate udelen zapocet s poctem bodu: " + pointsTutorials + "\tCelkovy pocet bodu: " + getPoints() + "\t Vase znamka: " + getMark() + ".");
            problem = false;
        } else {
            System.out.println(getName() + " | Bohuzel, ale ziskali jste " + pointsTutorials + " bodu, to neni dostatek k udeleni zapoctu.");
            problem = true;
        }
    }

    public void setTutorialPoints(int points){
        if (pointsTutorials + points < 21){
            pointsTutorials += points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni aktivity na hodinach je 20 bodu.");
            problem = true;
        }
    }

    public void setFinalExamPoints(int points){
        if (points < 81){
            pointsFinalExam = points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni zaverecne zkousky je 80 bodu.");
            problem = true;
        }
    }





}
