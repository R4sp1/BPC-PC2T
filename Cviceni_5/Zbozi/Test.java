package Zbozi;

class Test{
    public static void main(String[] args) {
        
        Zbozi[] field = new Zbozi[4];
        field[0] = new Potravina("Rohlik", 1.5, 1);
        field[1] = new Naradi("Kleste", 278, 24);
        field[2] = new Potravina("Chleba", 20.8, 6);
        field[3] = new Potravina("Jablko", 51, 20);

        for(int i = 0; i < field.length; i++){

            if(field[i] instanceof Potravina){

            System.out.println(field[i].getName() + " cena: " + field[i].getPrice() + " trvanlivost: " + ((Potravina)field[i]).getExpiryDate() + " " + field[i].getJednotka());
        
            }else{
            System.out.println(field[i].getName() + " cena: " + field[i].getPrice());
            }
        }
    }
}