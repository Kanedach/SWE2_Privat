package Login;

import java.util.Locale;

public class ServiceLocator {
	private static ServiceLocator singelton;
	private Locale selectLocal;
	
	public static void init() {
		if (singelton == null) {
			singelton = new ServiceLocator();
		}
	}
	
	public static void setSelectedLocale(Locale selectlocale){
		singelton.selectLocal = selectlocale;
	}

	public static Locale getSelectedlocale() {
		return singelton.selectLocal;
	}
}
