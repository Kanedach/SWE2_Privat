package Test;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TestController {
	protected TestModel model;
	protected TestView view;
	
	public TestController(TestModel model, TestView view) {
		this.model = model;
		this.view = view;
		
		view.b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				model.count();
				String newText = Integer.toString(model.getValue());
				view.l1.setText(newText);
			}
		});
		


		
	}
	

}
