import java.util.Scanner;

public class Test {

	public static int pouzeCelaCisla(Scanner sc) {
		int cislo = 0;
		try {
			cislo = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nastala vyjimka typu " + e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}

	public static float pouzeCisla(Scanner sc) {
		float cislo = 0;
		try {
			cislo = sc.nextFloat();
		} catch (Exception e) {
			System.out.println("Nastala vyjimka typu " + e.toString());
			System.out.println("zadejte prosim realne cislo ");
			sc.nextLine();
			cislo = pouzeCisla(sc);
		}
		return cislo;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Databaze mojeDatabaze = new Databaze(1);
		int idx;
		float prumer;
		int volba;
		boolean run = true;
		while (run) {
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. ukonceni aplikace");
			volba = pouzeCelaCisla(sc);
			switch (volba) {
				case 1:
					System.out.println("Zadejte pocet studentu");
					mojeDatabaze = new Databaze(pouzeCelaCisla(sc));
					break;
				case 2:
					try {
						mojeDatabaze.setStudent();
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Nebylo mozno vytvorit novou polozku, databaze je plna");
					}
					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					idx = pouzeCelaCisla(sc);
					prumer = pouzeCisla(sc);
					try {
						mojeDatabaze.setPrumer(idx, prumer);
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Vybrany studnet je mimo rozsah databaze (Indexovani studentu je od 0)");
					} catch (NullPointerException e) {
						System.out.println("Vybrany studnet jeste neni vytvoren");
					} catch (prumerException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 4:
					System.out.println("Zadejte index studenta (Indexovani je od 0)");
					idx = pouzeCelaCisla(sc);
					Student info = null;
					try {
						info = mojeDatabaze.getStudent(idx);
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik()
								+ " prumer: " + info.getStudijniPrumer());
					} catch (prumerException e) {
						System.out.println(
								"Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer nezadan");
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Vybrany studnet je mimo rozsah databaze (Indexovani studentu je od 0)");
					} catch (NullPointerException e) {
						System.out.println("Vybrany studnet jeste neni vytvoren");
					}

				case 5:
					run = false;
					break;
			}

		}
	}

}
