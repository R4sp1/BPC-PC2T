package Cviceni_3;

public class BPIS implements Predmet{
    private int points;
    public boolean problem;
    private int pointsTotal;

    @Override
    public String getName() {
        return "BPIS";
    }

    @Override
    public int getPoints() {
        return points;
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
        if (points > BODYKZAPOCTU - 1){
            System.out.println(getName() + " | Gratulujeme, mate udelen zapocet.\t\t\t\t\tCelkovy pocet bodu: " + getPoints() + "\t Vase znamka: " + getMark() + ".");
        } else {
            System.out.println(getName() + " | Bohuzel, ale zapocet jste neziskali.");
        }
    }


    public void setPoints(int points) {
        if (points < 101){
            this.points = points;
            problem = false;
        } else {
            System.out.println("Maximalni pocet bodu v predmetu je 100 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }
}
