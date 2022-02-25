package Zbozi;

public abstract class Zbozi {
    private String name;
    private double price;
    private static double DPH = 0.21;

    Zbozi(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String GetName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }
    
    public double GetPrice(){
        return price*(1+DPH);
    }

    public void SetPrice(double price){
        this.price = price;
    }

    public double GetDPH(){
        return DPH;
    }

    public static void setDPH(double DPH){
        Zbozi.DPH = DPH;
    }

    public abstract getJednotka();
}
