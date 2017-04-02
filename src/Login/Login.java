package Login;

import java.util.Locale;
import javafx.application.Application;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Login extends Application {
	
	private Locale de = Locale.GERMAN;
	private Locale en = Locale.ENGLISH;
	
	private Model model;
	private Controller controller;
	private View view;

	public static void main(String[] args) {
		ServiceLocator.init();
		new Login();
		launch();
		
	}
	
	public Login(){
		ServiceLocator.setSelectedLocale(de);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		model = new Model();
		controller = new Controller(model, view);
		view = new View(primaryStage, model);
			
		view.start();
	}

}
