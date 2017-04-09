package Login;

import java.util.Locale;

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
	private Scene scene;
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
	closed = new MenuItem("Closed");
	MenuItem de = new MenuItem("Deutsch");
	MenuItem en = new MenuItem("English");
	view = new MenuItem("Screen Size");
	menufile.getItems().add(closed);
	menuLanguage = new Menu("Language");
	menuLanguage.getItems().addAll(de, en);
	setting.getItems().addAll(menuLanguage, view);
	
	Label l1 = new Label();
	l1.setText(ServiceLocator.getSelectedlocale().getDisplayLanguage());
	
	bclosed = new Button();
	bclosed.setText(ServiceLocator.getSelectedlocale().getDisplayLanguage());

	

	stage.setTitle("Test App");
	root.setTop(menubar);
	root.setCenter(bclosed);
	root.setBottom(l1);
	
	Scene scene = new Scene(root);
	stage.setFullScreen(false);
	stage.setScene(scene);getClass();	
	

	
	}
	
	public void start(){
		stage.show();
	}
	
	public void reload(){
		stage.setScene(scene);getClass();
		stage.show();
	}
	
	public void stop(){
		stage.hide();
	}
	
	public Stage getStage(){
		return stage;
	}
	

	
	public void switchScreenSize(){
		if(stage.isFullScreen()) {
			stage.setFullScreen(false);
		} else {
			stage.setFullScreen(true);
		}
	}

	
}
