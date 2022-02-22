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
        if (points >= pointsToCredit){
            System.out.println(getName() + " | Mate udelen zapocet.\t\t\t\t\t\tCelkovy pocet bodu: " + getPoints() + "\t Vase znamka: " + getMark());
        } else {
            System.out.println(getName() + " | Nemate dostatek bodu k udeleni zapoctu.");
        }
    }


    public void setPoints(int points) {
        if (points <= 100){
            this.points = points;
            problem = false;
        } else {
            System.out.println("Maximalni pocet bodu v predmetu je 100 bodu. Zadejte novy pocet bodu!");
            problem = true;
        }
    }
}
