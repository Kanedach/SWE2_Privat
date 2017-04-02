package Test;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestView {
	
	protected Stage stage;
	protected TestModel model;
	
	protected Button b1;
	protected Label l1;
	
	public TestView(Stage stage, TestModel model) {
		this.stage = stage;
		this.model = model;
		stage.setTitle("Test App");
		
		GridPane root = new GridPane();
		Button b1 = new Button();
		
		b1.setText("Test");
		
		l1 = new Label();
		l1.setText(Integer.toString(model.getValue()));
		
		root.add(l1, 0, 0);
		root.add(b1, 0, 1);
		
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		
	}
	
	
	public void start(){
		stage.show();
	}
	
	public void stop() {
		stage.hide();
	}
	
	public Stage getStage(){
		return stage;
	}
	

}

