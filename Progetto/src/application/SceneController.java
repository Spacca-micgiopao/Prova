package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class SceneController {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	//Cambia alla Schermata 1----------------------------------------------------
	public void switchto1(ActionEvent event) {
	try {
		Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	//Cambia alla Schermata 2----------------------------------------------------
	public void switchto2(ActionEvent event) {
	try {
		Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	} catch (IOException e) {
		e.printStackTrace();
	}	  
	}

}
