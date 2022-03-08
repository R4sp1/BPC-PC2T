package Zbozi;

public class Naradi extends Zbozi{
    private int warranty;

    public Naradi(String name, double price, int warranty){
        super(name, price);
        this.warranty = warranty;
    }

    public int getWarranty(){
        return warranty;
    }

    public void setWarranty(int warranty){
        this.warranty = warranty;
    }

    @Override
    public String getJednotka(){
        String s = "mesic";
        return s;
    }
}
