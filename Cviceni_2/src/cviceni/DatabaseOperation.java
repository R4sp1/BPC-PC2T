package cviceni;

import java.util.Scanner;

public class DatabaseOperation {

    public static void main(String[] args) {
        int PersonNumber = 3;

        Database[] PersonDatabase = new Database[PersonNumber];

        Scanner sc;

        for (int i = 0; i < PersonNumber; i++) {
            System.out.print("Zadejte jmeno osoby c." + (i + 1) + ":");
            sc = new Scanner(System.in);
            String Name = sc.next();
            while (true) {
                System.out.print("rok narozeni:");
                sc = new Scanner(System.in);
                if (sc.hasNextInt())
                    break;
            }
            int Year = sc.nextInt();
            PersonDatabase[i] = new Database(Name, Year);
        }

        while (true) {
            System.out.print("Zadejte maximalni vysi uvazku: ");
            sc = new Scanner(System.in);
            if (sc.hasNextFloat()) {
                Database.setMaxObligation(sc.nextFloat());
                break;
            }
        }

        while (true) {
            System.out.print("Zadejte cislo osoby a vysi uvazku: ");
            sc = new Scanner(System.in);
            if (!sc.hasNextInt()) {
                System.out.println("Nezadali jste spravne cislo osoby!!!");
                continue;
            }
            int Num = sc.nextInt() - 1;
            if (Num < 0 || Num > PersonNumber) {
                System.out.println("Cislo osoby mimo rozsah databze");
                continue;
            }
            if (!sc.hasNextFloat()) {
                System.out.println("Nezadali jste spravne vysi uvazku!!!");
                continue;
            }
            float Obligation = sc.nextFloat();
            System.out.print(PersonDatabase[PersonNumber].getName() + " " + PersonDatabase[PersonNumber].getYear());
            if (PersonDatabase[PersonNumber].AddObligation(Obligation))
                System.out.println(" uvazek zvysen na " + PersonDatabase[PersonNumber].getObligation());
            else
                System.out.println(" uvazek nelze zvysit");
        }
    }
}