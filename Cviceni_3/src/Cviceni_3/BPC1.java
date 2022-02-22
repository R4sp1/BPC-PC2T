package Cviceni_3;

public class BPC1 implements Predmet {

    private int pointsExercises;
    private int pointsFinalExam;
    private int pointsTotal;
    public boolean problem;

    @Override
    public String getName() {
        return "BPC1";
    }

    @Override
    public int getPoints() {
        return pointsExercises + pointsFinalExam;
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
        if (pointsExercises >= pointsToCredit){
            System.out.println(getName() + " | Mate udelen zapocet s poctem bodu: " + pointsExercises + "\tCelkovy pocet bodu: " + getPoints() + "\t Vase znamka: " + getMark());
            problem = false;
        } else {
            System.out.println(getName() + " | Nemate dostatek bodu k udeleni zapoctu.");
            problem = true;
        }
    }

    public void setTutorialPoints(int points){
        if (pointsExercises + points < 21){
            pointsExercises += points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni aktivity na hodinach je 20 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }

    public void setFinalExamPoints(int points){
        if (points < 81){
            pointsFinalExam = points;
            problem = false;
        } else {
            System.out.println("Maximalni hodnoceni zaverecne zkousky je 80 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }





}
