package Zbozi;

public class Potravina extends Zbozi{
    private int expiryDate;

    public Potravina(String name, double price, int expiryDate){
        super(name, price);
        this.expiryDate = expiryDate;
    }

    public int getExpiryDate(){
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate){
        this.expiryDate = expiryDate;
    }

    @Override
    public String getJednotka(){
        String s = "dnu";
        return s;
    }
}
