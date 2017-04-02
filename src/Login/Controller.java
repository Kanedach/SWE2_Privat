package Login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

public class Controller  {
	final private Model model;
	final private View view;
	
	protected Controller (Model model, View view){
		this.model = model;
		this.view = view;
	
	view.getStage().setOnCloseRequest(new EventHandler<WindowEvent>() {
		
		@Override
		public void handle(WindowEvent event) {
			view.stop();
			Platform.exit();
			
		}
	});
		
	}		
	
}
