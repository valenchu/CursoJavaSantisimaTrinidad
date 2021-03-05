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
		VerificacionesAreas veri = new VerificacionesAreas();
		
		veri.respAreas(radioBt, txtBase, txtAltura, txtArea);
		System.out.println("holi");
		
	}

	public void getRadion(String datoArea) {
		radioBt.setText(datoArea);
	}
}
