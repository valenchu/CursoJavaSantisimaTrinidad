package es.calcular;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	public void start(Stage view) throws Exception {
		//LAS VISTAS ESTAN ELABORADAS EN JAVAFX
		FXMLLoader f = new FXMLLoader(getClass().getResource("\\vistas\\hola.fxml"));
		Parent root = (Parent) f.load();
		Scene scene = new Scene(root);
		view.setTitle("TESTEANDO");
		view.setScene(scene);
		view.show();
	}

	public static void main(String[] args) {
		launch(args);
		Controller a = new Controller();
	}



}
