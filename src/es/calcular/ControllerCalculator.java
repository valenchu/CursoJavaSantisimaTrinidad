package es.calcular;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerCalculator {

	public void initialize() {

	}

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

	@FXML
	void click(ActionEvent event) {
		int b = Integer.parseInt(txtBase.getText());
		int a = Integer.parseInt(txtAltura.getText());
		System.out.println(a + "   " + b);
		if (radioBt.getText().equals("CalcularAreaTrianguloInt")) {
			CalcularAreas cal = new CalcularAreas(b, a);
			txtArea.setText("El area del triangulo es: " + cal.calcularAreaTInt());
		} else if (radioBt.getText().equals("CalcularAreaTrianguloRectanguloInt")) {
			CalcularAreas cal = new CalcularAreas(b, a);
			txtArea.setText("El area del triangulo rectangulo es: " + cal.calcularAreaTandRInt());
		}

	}

	public void getRadion(String datoArea) {
		radioBt.setText(datoArea);
	}
}
