package cviceni;

import java.util.Scanner;

public class Pole {

    private Scanner sc;
    private static Hranol[] mojeHranoly;                                //6. Hranol musi byt static


    // Konstruktor s velikosti pole
    Pole(int velikost)
    {
        mojeHranoly=new Hranol[velikost];
        sc=new Scanner(System.in);
    }


    // vlozeni hranolu do pole na prvni volnou pozici
    void zadejHranol(){
        boolean drevena=false;
        float delka=0;
        float vyska=0;
        System.out.println("Zadejte delku podstavy hranolu");
        while(!sc.hasNextFloat())
        {
            sc.next();
        }
        delka=sc.nextFloat();
        System.out.println("Zadejte vysku hranolu");
        while(!sc.hasNextFloat())
        {
            sc.next();
        }
        vyska=sc.nextFloat();
        System.out.println("Je drevena?");
        while(!sc.hasNextBoolean())                             //7. Zmenena typu na Boolean
        {
            sc.next();
        }
        drevena=sc.nextBoolean();


        if (Hranol.getPocetHranolu()>mojeHranoly.length)
        {
            System.out.println("Pole uz je zaplneno");
            return;
        }


        mojeHranoly[Hranol.getPocetHranolu()] = new Hranol(delka, vyska, drevena);
        /*mojeHranoly[Hranol.getPocetHranolu()].setHrana(vyska);
        mojeHranoly[Hranol.getPocetHranolu()].setDreveny(drevena);

         */




    }

    // vypis objemu vsech hranolu
    void vypoctiObjem()
    {
        for (int i=0;i<Hranol.getPocetHranolu();i++)
            System.out.println("Objem "+ i + ". hranolu je " + mojeHranoly[i].vypoctiObjem());      //9. vypoctiObsah zameneno za vypoctiObjem + zmena textu aby se vypisovalo cislo hranolu
    }

    // vypis obsahu podstavy vsech hranolu
    void vypoctiObsahPodstavy()
    {
        for (int i=0;i<Hranol.getPocetHranolu();i++)
            System.out.println("Objem "+ i + ". hranolu je " + mojeHranoly[i].vypoctiObsah());       //10 vypoctiObjem za vypoctiObsah + zmena textu
    }

    // nalezeni indexu nejmensiho hranolu
    int najdiNejmensiObjem()
    {
        float min;
        int idx=0;
        min = mojeHranoly[0].vypoctiObjem();                        // Naplneni konstanty min objemem prvniho hranolu
        for (int i=1;i<Hranol.getPocetHranolu();i++)
        {
            if (mojeHranoly[i].vypoctiObjem()<min){
                min=mojeHranoly[i].vypoctiObjem();
                idx=i;
            }
        }
        return idx;
    }

    // zjisteni celkoveho poctu drevenych kostek
    int zjistiPocetDrevenych(){
        int pocetDrevenych=0;
        for (int i=0;i<Hranol.getPocetHranolu(); i++)                 //11. Zmena znamenka za i je mensi nez + zacina se od 0 + chybi i++
        {
            if (mojeHranoly[i].jeDreveny() == true)             //12. Relacni operator je == + zmena za jeDreveny
                pocetDrevenych++;
        }
        return pocetDrevenych;
    }

    public static void main(String[] args) {                            //5. Vytvoreni metody main

        Pole p = new Pole(3);
        p.zadejHranol();
        p.zadejHranol();
        p.vypoctiObjem();
        p.vypoctiObsahPodstavy();
        System.out.println("Nejmensi objem je na indexu: " + p.najdiNejmensiObjem());
        System.out.println("Pocet drevenych hranolu: " + p.zjistiPocetDrevenych());



    }
}
