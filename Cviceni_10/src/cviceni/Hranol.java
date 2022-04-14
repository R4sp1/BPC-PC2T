package cviceni;

public class Hranol extends Ctverec{                                //1. Oprava typo chyby


    // konstruktor se zadanim delky hrany, vysky a materialu
    Hranol(float podstava,float vyska, boolean drevena){
        super(podstava);                                            //2. Vlozeni klicoveho slova super(); s prepsanim parametru "podstava"
        hrana=vyska;
        zeDreva=drevena;
        pocetHranolu++;                                             //3. odstraneni slova final z parametru
    }

    // vypocet objemu hranolu
    float vypoctiObjem() {
        return hrana*hrana*hrana;
    }                                                               //8. odstraneni slova this. pred hrana

    // nastaveni materialu
    void setDreveny(boolean dreveny){
        zeDreva=dreveny;
    }

    // zjisteni materialu
    boolean jeDreveny(){
        return zeDreva;
    }

    // zjisteni celkoveho poctu existujicich kostek
    static int getPocetHranolu(){
        return pocetHranolu;
    }                                                               //4. do staticke metody pridavana nestaticky parametr - pocetHranolu je ted static


    // zjisteni vysky hranolu
    float getHrana(){
        return hrana;
    }
    // nastaveni vysky hranolu
    void setHrana(float delka){
        hrana=delka;
    }

    private float hrana;
    boolean zeDreva;
    static int pocetHranolu=0;


}
