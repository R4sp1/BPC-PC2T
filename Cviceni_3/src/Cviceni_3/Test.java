package Cviceni_3;

import java.util.Scanner;

public class Test {

    private static double getNum(Scanner input) {                                                                       //Osetreni vstupu
        try {
            input.hasNextDouble();
            double x = input.nextDouble();
            input.nextLine();
            return x;

        } catch (Exception e) {
            System.out.println("Prosim zadavejte jen cisla!");
            input.nextLine();
            return getNum(input);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                                                         //Inicializace scaneru
        BPC1 a = new BPC1();
        BPC2 b = new BPC2();
        BPIS c = new BPIS();

        System.out.println(a.getName() + " | Zadejte bodove hodnoceni cviceni (max.20):");                              //Predmet BPC1
        for (int i = 1; i < 5; i++) {                                                                                   //Smycka pro zadavani bodu pro jednotlive hodiny
            System.out.print("Zadejte bodove hodnoceni " + i + " hodiny (max.5): ");
            do {
                double point = getNum(input);
                if (point > 5) {                                                                                        //Pokud je bodu vice nez 5 tak se neulozi a vyzve k novemu zadani
                    System.out.println("Maximalni hodnoceni aktivity na hodinach je 5 bodu. Zadejte novy pocet bodu!");
                    i--;                                                                                                //Odecitame i protoze jsme ve smycce a jsme porad u te jedne hodiny
                } else {
                    a.setCreditPoints(point);                                                                           //Pokud je bodu <= 5 tak se ulozi
                }
            } while (a.problem);
        }

        System.out.print(a.getName() + " | Zadejte bodove hodnoceni zaverecne zkousky (max.80): ");
        do {
            a.setFinalExamPoints(getNum(input));
        } while (a.problem);

        System.out.print(b.getName() + " | Zadejte bodove hodnoceni projektu (max.30): ");                              //Predmet BPC2
        do {
            b.setProjectPoints(getNum(input));
        } while (b.problem);

        System.out.print(b.getName() + " | Zadejte bodove hodnoceni pulsemetralniho testu (max.20): ");
        do {
            b.setHalfExamPoints(getNum(input));
        } while (b.problem);

        System.out.print(b.getName() + " | Zadejte bodove hodnoceni zaverecne zkousky (max.50): ");
        do {
            b.setFinalExamPoints(getNum(input));
        } while (b.problem);

        System.out.print(c.getName() + " | Zadejte bodove hodnoceni predmetu (max.100): ");                             //Predmet BPIS
        do {
            c.setPoints(getNum(input));
        } while (c.problem);

        a.getEval();                                                                                                    //Volani funkce Eval
        b.getEval();
        c.getEval();

        input.close();
    }
}
