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

	// VARIABLES QUE TOMAN POR ETIQUETAS LOS RADIOBUTON DEL JAVAFX

	@FXML
	private ToggleGroup tg;

	@FXML
	public RadioButton rdTriangulo1;

	@FXML
	public RadioButton rdTriangulo2;

	@FXML
	private RadioButton rdTrianguloDouble1;

	@FXML
	private RadioButton rdTrianguloDouble2;

	@FXML
	private RadioButton rdTrianguloFloat1;

	@FXML
	private RadioButton rdTrianguloFloat2;

	@FXML
	private Button btnCalcular;

	// ACCION DEL EVENTO DE BOTON CLICK QUE TOMA LOS RADIO BUTTONS DEL PANEL
	@FXML
	void click(ActionEvent event) {
		FXMLLoader f = new FXMLLoader(getClass().getResource("\\vistas\\Calculos.fxml"));
		Parent root;
		try {
			root = f.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();

			// LLAMO AL CONTROLADOR DOS DE LA VENTANA PARA PASARLE LOS DATOS DE LOS
			// RADIOBUTTON QUE MARQUE
			ControllerCalculator cs = (ControllerCalculator) f.getController();
			// VERIFICACION BUTTONS INT
			if (rdTriangulo1.isSelected() == true)
				cs.getRadion("CalcularAreaTrianguloInt");
			else if (rdTriangulo2.isSelected() == true)
				cs.getRadion("CalcularAreaTrianguloRectanguloInt");
			// VERIFICACION BUTTONS FLOAT
			else if (rdTrianguloFloat1.isSelected() == true)
				cs.getRadion("CalcularAreaTrianguloFloat");
			else if (rdTrianguloFloat2.isSelected() == true)
				cs.getRadion("CalcularAreaTrianguloRectanguloFloat");
			// VERIFICACION BUTTONS DOUBLE
			else if (rdTrianguloDouble1.isSelected() == true)
				cs.getRadion("CalcularAreaTrianguloDouble");
			else if (rdTrianguloDouble2.isSelected() == true)
				cs.getRadion("CalcularAreaTrianguloRectanguloDouble");

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}