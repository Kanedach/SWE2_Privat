package Login;

public class Controller  {
	final private Model model;
	final private View view;
	
	protected Controller (Model model, View view){
		this.model = model;
		this.view = view;
		
		
		view.closed.setOnAction(Event -> {
			view.stop();
		});
		
		view.view.setOnAction(Event -> {
			view.switchScreenSize();
		});
	
	
		
	}		
	
}
