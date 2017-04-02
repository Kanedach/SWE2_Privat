package Login;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class View {
	final private Model model;
	final private Stage stage;
	MenuItem closed;
	protected Button bclosed;
	
	public View(Stage stage, Model model){
		this.model = model;
		this.stage = stage;
	
	BorderPane root = new BorderPane();
	
	MenuBar menubar = new MenuBar();
	Menu file = new Menu("File");
	Menu setting = new Menu("Setting");
	menubar.getMenus().addAll(file, setting);
	MenuItem closed = new MenuItem("Closed");
	MenuItem de = new MenuItem("Deutsch");
	MenuItem en = new MenuItem("English");
	MenuItem view = new MenuItem("FullScreen");
	file.getItems().add(closed);
	Menu language = new Menu("Language");
	language.getItems().addAll(de, en);
	setting.getItems().addAll(language, view);
	
	bclosed = new Button();
	bclosed.setText("Test");

	

	stage.setTitle("Test App");
	root.setTop(menubar);
	root.setCenter(bclosed);
	
	Scene scene = new Scene(root);
	stage.setFullScreen(false);
	stage.setScene(scene);getClass();
	
	
	
	}
	
	public void start(){
		stage.show();
	}
	
	public void stop(){
		stage.hide();
	}
	
	public Stage getStage(){
		return stage;
	}
	
}
