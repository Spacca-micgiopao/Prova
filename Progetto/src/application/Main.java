package application;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class Main extends Application {
	 
	 @Override
	 public void start(Stage stage) {
	  try {
	   
	   Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
	   //è una "sorgente" per la scena
	   
	   Scene scene = new Scene(root);
	   //Da una "sorgente alla scena"
	   
	   stage.setScene(scene);
	   //mette dentro lo stage la scena
	   
	   stage.setResizable(false);
	   //Gestisce la dimenzione della finestra
	   
	   stage.setTitle("SPACCA!");
	   //Imposta il titolo
	   
	   stage.show();
	   //Mostra Lo stage
	   
	  } catch(Exception e) {
	   e.printStackTrace();
	  }
	 } 

	 public static void main(String[] args) {
	  launch(args);
	 }
	}






//------Comandi vari per gestire lo stage,il layer più esterno,la cornice--------
	 
  //Image icon = new Image("Icon.jpeg");
  //stage.getIcons().add(icon);
  //aggiunge l'icona
  //stage.setWidth(420);
  //stage.setHeight(420);
  //stage.setX(50);
  //stage.setY(50);
  //stage.setFullScreen(true);
  //stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
  //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));