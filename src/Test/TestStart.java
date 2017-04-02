package Test;

import javafx.application.Application;
import javafx.stage.Stage;

public class TestStart extends Application {
	
	TestModel model;
	TestView view;
	TestController controller;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		model = new TestModel();
		view = new TestView(primaryStage, model);
		controller = new TestController(model, view);
		view.start();
		
	}
	
	public void stop(){
		if(view != null) {
			view.stop();
		}
	}

}
