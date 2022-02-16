package cviceni;

import java.util.Scanner;                                                           //Import knihovny

public class DatabaseOperation {

    public static void main(String[] args) {
        int PersonNumber = 1;                                                       //Velikost databaze

        Database[] PersonDatabase = new Database[PersonNumber];                     //Pole objektu - databaze

        Scanner sc;

        for (int i = 0; i < PersonNumber; i++) {                                    //Naplneni databaze
            System.out.print("Zadejte jmeno osoby c." + (i + 1) + ": ");
            sc = new Scanner(System.in);
            String Name = sc.next();                                                //Jmenem
            while (true) {
                System.out.print("rok narozeni: ");                                 //Rokem narozeni
                sc = new Scanner(System.in);
                if (sc.hasNextInt())
                    break;
            }
            int Year = sc.nextInt();
            PersonDatabase[i] = new Database(Name, Year);                           //Ulozeni do databaze
        }

        while (true) {                                                              //Zvyseni vyse uvazku (zaklad 1)
            System.out.print("Zadejte maximalni vysi uvazku: ");
            sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                Database.setMaxObligation(sc.nextDouble());
                break;
            }
        }

        while (true) {
            System.out.print("Zadejte cislo osoby a vysi uvazku: ");                //Zadavani dat do databaze

            sc = new Scanner(System.in);

            if (!sc.hasNextInt()) {                                                 //Pokud jsme nezadali cislo typu int hodi chybu
                System.out.println("Nezadali jste spravne cislo osoby!!!");
                break;
            }

            int Number = sc.nextInt() - 1;                                          //Indexovani databaze je od 0 ale my ji zobrazjujeme od 1

            if (Number < 0 || Number > PersonNumber) {                              //Kontrola zda je osoba v databazi
                System.out.println("Cislo osoby mimo rozsah databaze");
                continue;
            }

            if (!sc.hasNextDouble()) {                                               //Kontrola hodnoty double
                System.out.println("Nezadali jste spravne vysi uvazku!");
                continue;
            }


            double Obligation = sc.nextDouble();

            System.out.print("Osobe: " + PersonDatabase[Number].getName() + ", narozene: " + PersonDatabase[Number].getYear());

            if (PersonDatabase[Number].AddObligation(Obligation)) {                 //Kontrola vyse uvazku
                System.out.println(" byl uvazek zvysen na " + PersonDatabase[Number].getObligation());
            } else {
                System.out.println(" nelze dale uvazek zvysit. Maximalni hodnota uvazku: " + Database.MaxObligation + ", aktualni hodnota uvazku je: " + PersonDatabase[Number].getObligation());
            }

        }
    }
}