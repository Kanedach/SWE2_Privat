package Login;

import java.util.Locale;

import javafx.application.Application;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Login extends Application {
	
	static Locale de = Locale.GERMAN;
	static Locale en = Locale.ENGLISH;
	
	private Model model;
	private Controller controller;
	private View view;
	private ServiceLocator service = new ServiceLocator();

	public static void main(String[] args) {
		ServiceLocator.init();
		new Login();
		launch();
		
	}
	
	public Login(){
		service.init();
		service.setSelectedLocale(de);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		model = new Model();
		view = new View(primaryStage, model);
		controller = new Controller(model, view);
		
			
		view.start();
	}

}
