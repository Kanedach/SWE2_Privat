package Test;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TestController {
	
	final protected TestModel model;
	final protected TestView view;
	
	public TestController(TestModel model, TestView view) {
		this.model = model;
		this.view = view;
		
	view.b1.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			
		}
	});
	
		
	}
	
	

}
