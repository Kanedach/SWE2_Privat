package Login;

import java.util.Locale;

public class ServiceLocator {
	private static ServiceLocator service;
	private Locale selectLocal;
	
	public static void init() {
		if (service == null) {
			service = new ServiceLocator();
		}
	}
	
	public static void setSelectedLocale(Locale selectlocale){
		service.selectLocal = selectlocale;
	}

	public static Locale getSelectedlocale() {
		return service.selectLocal;
	}
}
