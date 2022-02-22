package Cviceni_3;

import java.util.Scanner;

public class Test {
    private static int getInt(Scanner input) {
        try
        {
            input.hasNextInt();
            int x = input.nextInt();
            input.nextLine();
            return x;

        }catch(Exception e)
        {
            System.out.println("Prosim zadavejte jen cisla:");
            input.nextLine();
            return getInt(input);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BPC1 a = new BPC1();
        BPC2 b = new BPC2();
        BPIS c = new BPIS();

        // PREDMET BPC1

        System.out.println(a.getName() + " | Zadejte bodove hodnoceni cviceni (max.20):");
        do{
            a.setTutorialPoints(getInt(input));
        } while (a.problem);

        System.out.println(a.getName() + " | Zadejte bodove hodnoceni zaverecne zkousky (max.80):");
        do{
            a.setFinalExamPoints(getInt(input));
        } while (a.problem);


        // PREDMET BPC2

        System.out.println(b.getName() + " | Zadejte bodove hodnoceni projektu (max.30):");
        do{
            b.setProjectPoints(getInt(input));
        } while (b.problem);

        System.out.println(b.getName() + " | Zadejte bodove hodnoceni pulsemetralniho testu (max.20):");
        do{
            b.setHalfExamPoints(getInt(input));
        } while (b.problem);

        System.out.println(b.getName() + " | Zadejte bodove hodnoceni zaverecne zkousky (max.50):");
        do{
            b.setFinalExamPoints(getInt(input));
        } while (b.problem);


        // PREDMET BPIS

        System.out.println(c.getName() + " | Zadejte bodove hodnoceni predmetu (max.100):");
        do{
            c.setPoints(getInt(input));
        } while (c.problem);

        a.getEval();
        b.getEval();
        c.getEval();


        input.close();
    }
}
