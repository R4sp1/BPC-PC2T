import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Databaze {

	private Map<String, Student> prvkyDatabaze;

	Databaze() {
		prvkyDatabaze = new HashMap<String, Student>();
	}

	public boolean setStudent(String jmeno, int rok) {
		if (prvkyDatabaze.put(jmeno, new Student(jmeno, rok)) == null) {
			return true;
		} else {
			return false;
		}
	}

	public Student getStudent(String jmeno) {
		return prvkyDatabaze.get(jmeno);
	}

	public boolean setPrumer(String jmeno, float prumer) {
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
}