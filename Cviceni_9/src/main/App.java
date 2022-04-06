/*
 * @Jiri Jilek 2022
 *
 * Hlavní rozdílem mezi rozhraním a abstraktní třídou je ten že rozhraní nemůže mít konkrétní metody a proměnné musejí být konstantní
 * (Musejí být definovány s přesnou hodnotou)
 * Ani pro abstraktní třídy ani pro rozhraní nelze vytvářet instance...
 *
 * Dalším rozdílem je to že do pole lze přidávat objekty co vycházejí z třídy co vychází z abstraktní třídy ---> List<AbstractClass>
 * do pole se pak dají přidávat objekty založené na abstraktní třídě viz. AbstractAnimal, cat, dog.... Toto s interfacem nejde...
 *
 *
 *
 * Výčtové typy mají dané hodnoty které mají povahu konstant... objekt výčtového typu má přesně definované hodnoty...
 * U stringu by se dala hodnota měnit během programu... (pokud by se nepoužilo při deklaraci slovo static)
 * i v tomto případě by byla použita jen jedna hodnota... Pro více hodnot je lepší použít výčtový typ kde jsou hodnoty pevně danné...
 * + mají identifikátor (to string nemá)
 */

package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import firm.*;
import animals.impl.AbstractAnimal.*;
import animals.impl.Animal.*;
import animals.Animal;
import animals.AbstractAnimal;



public class App {

    public static void main(String[] args) {
        List<Employee> listOfEmployees = empoleeys();
        Collections.sort(listOfEmployees);

        Secretarian s = new Secretarian("Grimes", "grimes@x.space", "/H4^'D)*gv[DHUj/".toCharArray(), EmployeeType.ACTIVE, 23);
        Manager<Secretarian> m = new Manager<>();
        m.setListOfEmployees(listOfEmployees);
        m.addRelationship(s);
        m.printAll();

        System.out.println("\n\n");

        System.out.println("Zvuk zvirat (abstraktni metoda)");
        List<AbstractAnimal> abstractAnimals = Animals();
        abstractAnimals.forEach(System.out::println);

        System.out.println("\n\n");

        System.out.println("Zvuk zvirat (Interface)");
        List<Animal> interAnimals = AnimalsInterface();
        interAnimals.forEach(System.out::println);
    }

    public static List<Employee> empoleeys() {
        Employee e1 = new Employee("X Æ A-12 Musk", "x@x.space", "yg8Z2'2Nk$N3FCJ'".toCharArray(), EmployeeType.ACTIVE);
        Employee e2 = new Employee("Nevada Alexander Musk", "nevada@x.space", "Gp4SL*(Z6t:S(gHL".toCharArray(), EmployeeType.ACTIVE);
        Employee e3 = new Employee("Xavier Musk", "xavier@x.space", "JeffSucks123".toCharArray(), EmployeeType.ACTIVE);
        Employee e4 = new Employee("Damian Musk", "damian@x.space", "'yZg9jc3eZ]gt-q]".toCharArray(), EmployeeType.ACTIVE);
        Employee e5 = new Employee("Griffin Musk", "griffin@x.space", "tcE;Ch4NC3B+jncd".toCharArray(), EmployeeType.ACTIVE);
        Employee e6 = new Employee("Kai Musk", "kai@x.space", "$-hU5yfgN_S5PzKC".toCharArray(), EmployeeType.ACTIVE);
        Employee e7 = new Employee("Exa Dark Sideræl Musk", "exa@x.space", "uJBWme)Jh\"a&e}fmFVwt2RT/']4\"+r\"g".toCharArray(), EmployeeType.ACTIVE);
        Employee e8 = new Employee("Saxon Musk", "saxon@x.space", "9455p7/uA*K4,$#H".toCharArray(), EmployeeType.ACTIVE);
        Employee e9 = new Employee("Jeff Bezos", "jeff@x.space", "TotalyNotSpyingHere".toCharArray(), EmployeeType.DELETED);
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static List<AbstractAnimal> Animals() {
        AbstractAnimal cat = new Cat();
        AbstractAnimal cow = new Cow();
        AbstractAnimal dog = new Dog();
        AbstractAnimal goat = new Goat();
        AbstractAnimal pig = new Pig();
        AbstractAnimal chewbacca = new Chewbacca();
        return Arrays.asList(cat, cow, dog, goat, pig, chewbacca);
    }

    public static List<Animal> AnimalsInterface() {
        Animal cat = new CatImpl((byte) 25);
        Animal cow = new CowImpl((byte) 20);
        Animal dog = new DogImpl((byte) 10);
        Animal goat = new GoatImpl((byte) 20);
        Animal pig = new PigImpl((byte) 50);
        Animal chewbacca = new ChewbaccaImpl((byte) 100);
        return Arrays.asList(cat, cow, dog, goat, pig, chewbacca);
    }

}
