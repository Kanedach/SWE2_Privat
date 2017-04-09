package Login;

public class Controller  {
	final private Model model;
	final private View view;
	private ServiceLocator service;

	
	protected Controller (Model model, View view){
		this.model = model;
		this.view = view;
		service.init();

		
		view.closed.setOnAction(Event -> {
			view.stop();
		});
		
		view.view.setOnAction(Event -> {
			view.switchScreenSize();
		});
		
		view.bclosed.setOnAction(Event -> {
				if(service.getSelectedlocale() == Login.de) {
					service.setSelectedLocale(Login.en);
				} else {
					service.setSelectedLocale(Login.de);
				}
			System.out.println(service.getSelectedlocale());
		});
	
	
		
	}		
	
}
