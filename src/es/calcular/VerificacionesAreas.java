package es.calcular;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class VerificacionesAreas {
	ControllerCalculator con;

	public void respAreas(Label radioBt, TextField txtBase, TextField txtAltura, TextArea txtArea) {
		// VERIFICACION CAMPOS VACIOS
		if (txtBase.getText().isEmpty() || txtAltura.getText().isEmpty() || txtBase.getText().equals("")
				|| txtAltura.getText().equals("") || txtBase.getText().equals(null)
				|| txtAltura.getText().equals(null)) {
			txtArea.setText("No se encontraron numeros al CALCULAR");
		} else {
			// CALCULOS DE AREAS Y VERIFICACION INT

			if (radioBt.getText().equals("CalcularAreaTrianguloInt")) {
				try {
					int b = Integer.parseInt(txtBase.getText());
					int a = Integer.parseInt(txtAltura.getText());
					CalcularAreas cal = new CalcularAreas(b, a);
					txtArea.setText("El area del triangulo es: " + cal.calcularAreaTInt());
				} catch (Exception e) {
					// FORMAS DE GENERAR ALERTAS CON JAVAFX
					Alert alert = new Alert(AlertType.ERROR);
					alert.setHeaderText(null);
					alert.setTitle("ERROR");
					alert.setContentText(
							"No ingreso numeros INTEGER o ingreso caracteres no validos\n (Ejemplo n° INTEGER : 10)");
					alert.showAndWait();
				}
			} else if (radioBt.getText().equals("CalcularAreaTrianguloRectanguloInt")) {
				try {
					int b = Integer.parseInt(txtBase.getText());
					int a = Integer.parseInt(txtAltura.getText());
					CalcularAreas cal = new CalcularAreas(b, a);
					txtArea.setText("El area del triangulo rectangulo es: " + cal.calcularAreaTandRInt());
				} catch (Exception e) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setHeaderText(null);
					alert.setTitle("ERROR");
					alert.setContentText(
							"No ingreso numeros INTEGER o ingreso caracteres no validos\n (Ejemplo n° INTEGER : 10)");
					alert.showAndWait();
				}

			}

			// CALCULOS DE AREAS Y VERIFICACION FLOAT
			if (radioBt.getText().equals("CalcularAreaTrianguloFloat")) {
				try {
					Float bf = Float.parseFloat(txtBase.getText());
					Float af = Float.parseFloat(txtAltura.getText());
					CalcularAreas cal = new CalcularAreas(bf, af);
					if (cal.calcularAreaTFloat() > 124.5) {
						txtArea.setText("La superficie ha superado el valor permitido. Que es 124,5");
					} else {
						txtArea.setText("El area del triangulo rectangulo es: " + cal.calcularAreaTFloat());
					}
				} catch (Exception e) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setHeaderText(null);
					alert.setTitle("ERROR");
					alert.setContentText(
							"No ingreso numeros FLOAT o ingreso caracteres no validos\n (Ejemplo n° FLOAT : 10.5)");
					alert.showAndWait();
				}
			} else if (radioBt.getText().equals("CalcularAreaTrianguloRectanguloFloat")) {
				try {
					Float bf = Float.parseFloat(txtBase.getText());
					Float af = Float.parseFloat(txtAltura.getText());
					CalcularAreas cal = new CalcularAreas(bf, af);
					if (cal.calcularAreaTandRFloat() > 124.5) {
						txtArea.setText("La superficie ha superado el valor permitido. Que es 124,5");
					} else {
						txtArea.setText("El area del triangulo rectangulo es: " + cal.calcularAreaTandRFloat());
					}
				} catch (Exception e) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setHeaderText(null);
					alert.setTitle("ERROR");
					alert.setContentText(
							"No ingreso numeros FLOAT o ingreso caracteres no validos\n (Ejemplo n° FLOAT : 10.5)");
					alert.showAndWait();
				}
			}

			// CALCULOS DE AREAS Y VERIFICACION DOUBLE

			if (radioBt.getText().equals("CalcularAreaTrianguloDouble")) {
				try {
					double bf = Double.parseDouble(txtBase.getText());
					double af = Double.parseDouble(txtAltura.getText());
					CalcularAreas cal = new CalcularAreas(bf, af);
					if (cal.calcularAreaTDouble() > 367.5) {
						txtArea.setText("La superficie ha superado el valor permitido. Que es 367,5 ");
					} else {
						txtArea.setText("El area del triangulo rectangulo es: " + cal.calcularAreaTDouble());
					}
				} catch (Exception e) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setHeaderText(null);
					alert.setTitle("ERROR");
					alert.setContentText(
							"No ingreso numeros DOUBLE o ingreso caracteres no validos\n (Ejemplo n° DOUBLE : 10.5)");
					alert.showAndWait();

				}

			} else if (radioBt.getText().equals("CalcularAreaTrianguloRectanguloDouble")) {
				try {
					double bf = Double.parseDouble(txtBase.getText());
					double af = Double.parseDouble(txtAltura.getText());
					CalcularAreas cal = new CalcularAreas(bf, af);
					if (cal.calcularAreaTandRDouble() > 367.5) {
						txtArea.setText("La superficie ha superado el valor permitido. Que es 367,5 ");
					} else {
						txtArea.setText("El area del triangulo rectangulo es: " + cal.calcularAreaTandRDouble());
					}
				} catch (Exception e) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setHeaderText(null);
					alert.setTitle("ERROR");
					alert.setContentText(
							"No ingreso numeros DOUBLE o ingreso caracteres no validos\n (Ejemplo n° DOUBLE : 10.5)");
					alert.showAndWait();
				}
			} // fx:controller="es.calcular.Controller"

		}

	}
}
