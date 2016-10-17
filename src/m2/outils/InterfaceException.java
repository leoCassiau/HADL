package m2.outils;

@SuppressWarnings("serial")
public class InterfaceException extends Exception {

	public InterfaceException(String nom, boolean fournis) {
		String txt = "";
		if(fournis) {
			txt = "fournie";
		}
		else {
			txt = "requise";
		}
		System.out.println("L'interface " + nom + " doit être " + txt + ".");
	}
}
