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
	Menu menufile;
	Menu setting;
	Menu menuLanguage;
	MenuItem closed;
	MenuItem view;
	
	protected Button bclosed;
	
	public View(Stage stage, Model model){
		this.model = model;
		this.stage = stage;
	
	BorderPane root = new BorderPane();
	
	MenuBar menubar = new MenuBar();
	menufile = new Menu("File");
	setting = new Menu("Setting");
	menubar.getMenus().addAll(menufile, setting);
	MenuItem closed = new MenuItem("Closed");
	MenuItem de = new MenuItem("Deutsch");
	MenuItem en = new MenuItem("English");
	view = new MenuItem("FullScreen");
	menufile.getItems().add(closed);
	menuLanguage = new Menu("Language");
	menuLanguage.getItems().addAll(de, en);
	setting.getItems().addAll(menuLanguage, view);
	
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
