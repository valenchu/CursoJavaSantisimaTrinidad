package es.calcular;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller {

	public void initialize() {

	}

	@FXML
	public RadioButton rdTriangulo1;

	@FXML
	private ToggleGroup tg;

	@FXML
	public RadioButton rdTriangulo2;

	@FXML
	private Button btnCalcular;

	@FXML
	void click(ActionEvent event) {
		FXMLLoader f = new FXMLLoader(getClass().getResource("Calculos.fxml"));
		Parent root;
		try {
			root = f.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			ControllerCalculator cs = (ControllerCalculator) f.getController();
			if (rdTriangulo1.isSelected() == true)
				cs.getRadion("CalcularAreaTrianguloInt");
			else if (rdTriangulo2.isSelected() == true)
				cs.getRadion("CalcularAreaTrianguloRectanguloInt");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}