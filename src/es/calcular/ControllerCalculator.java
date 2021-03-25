package es.calcular;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerCalculator {

	public Controller itsController;

	public void initialize() {

	}

	//VARIABLES PERTENECIENTE A LOS TEXT AREA DE LA SEGUNDA VISTA DONDE SE CALCULA LAS AREAS
	@FXML
	private TextArea txtArea;

	@FXML
	private TextField txtBase;

	@FXML
	private TextField txtAltura;

	@FXML
	private Label radioBt;

	@FXML
	private Button btnCalcularArea;

	//METODO CLICK PARA CALCULAR EL AREA DE CUALQUIER RADIO BUTTON ELABORADO
	@FXML
	public void click(ActionEvent event) {
		VerificacionesAreas veri = new VerificacionesAreas();
		//LLAMO AL METODO CREADO EN LA CLASE VERIFICACION DE AREAS PARA CALCULAR LAS AREAS Y VERIFICAR
		veri.respAreas(radioBt, txtBase, txtAltura, txtArea);
		System.out.println("holi");

	}

	public void getRadion(String datoArea) {
		radioBt.setText(datoArea);
	}
}
