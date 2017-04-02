package Login;

import java.util.Locale;

public class Login {
	
	private Locale de_ch;
	private Locale en_us;

	public static void main(String[] args) {
	
		ServiceLocator.init();
		
		new Login();
		
				
		
		
		

		
	

	}
	
	public Login(){
		de_ch = new Locale("de_ch");
		en_us = new Locale("en_us");
		
		ServiceLocator.setSelectedLocale(de_ch);
		
		System.out.println(ServiceLocator.getSelectedlocale().getCountry());

		
	}

}
