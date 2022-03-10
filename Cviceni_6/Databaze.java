import java.util.Set;
import java.util.Map;
import java.util.HashMap;


public class Databaze {

	public String jmeno;
	public int rocnik;

	public Databaze() {
		prvkyDatabaze = new HashMap<String, Student>();
	}

	public boolean setStudent() {
		if (prvkyDatabaze.put(jmeno, new Student(jmeno, rocnik)) == null) {
			return true;
		} else {
			return false;
		}
	}

	public Student getStudent(String jmeno) {
		return prvkyDatabaze.get(jmeno);
	}

	public boolean setPrumer(String jmeno, double prumer) {
		if (prvkyDatabaze.get(jmeno) == null) {
			return false;
		}
		return prvkyDatabaze.get(jmeno).setStudijniPrumer(prumer);
	}

	public boolean vymazStudenta(String jmeno) {
		if (prvkyDatabaze.remove(jmeno) != null) {
			return true;
		}
		return false;
	}

	public void vypisDatabaze() {
		Set<String> seznamJmen = prvkyDatabaze.keySet();

		for (String jmeno : seznamJmen) {
			System.out.println(jmeno);
		}
	}

	private Map<String, Student> prvkyDatabaze;
}