package es.calcular;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class VerificacionesAreas {

	public void respAreas(Label radioBt, TextField txtBase, TextField txtAltura, TextArea txtArea) {

		if (txtBase.getText().isEmpty() || txtAltura.getText().isEmpty() ||
				txtBase.getText().equals("") || txtAltura.getText().equals("") ||
				txtBase.getText().equals(null) || txtAltura.getText().equals(null)) {
			txtArea.setText("No se encontraron numeros al CALCULAR");
		} else {
			// CALCULOS DE AREAS
			if (radioBt.getText().equals("CalcularAreaTrianguloInt")) {
				int b = Integer.parseInt(txtBase.getText());
				int a = Integer.parseInt(txtAltura.getText());
				CalcularAreas cal = new CalcularAreas(b, a);
				txtArea.setText("El area del triangulo es: " + cal.calcularAreaTInt());
			} else if (radioBt.getText().equals("CalcularAreaTrianguloRectanguloInt")) {
				int b = Integer.parseInt(txtBase.getText());
				int a = Integer.parseInt(txtAltura.getText());
				CalcularAreas cal = new CalcularAreas(b, a);
				txtArea.setText("El area del triangulo rectangulo es: " + cal.calcularAreaTandRInt());
			} else if (radioBt.getText().equals("CalcularAreaTrianguloFloat")) {
				Float bf = Float.parseFloat(txtBase.getText());
				Float af = Float.parseFloat(txtAltura.getText());
				CalcularAreas cal = new CalcularAreas(bf, af);
				if(cal.calcularAreaTFloat() > 124.5 ) {
					txtArea.setText("La superficie ha superado el valor permitido. Que es 124,5");
				}else {
				txtArea.setText("El area del triangulo rectangulo es: " + cal.calcularAreaTFloat());
				}
			} else if (radioBt.getText().equals("CalcularAreaTrianguloRectanguloFloat")) {
				Float bf = Float.parseFloat(txtBase.getText());
				Float af = Float.parseFloat(txtAltura.getText());
				CalcularAreas cal = new CalcularAreas(bf, af);
				if(cal.calcularAreaTandRFloat() > 124.5 ) {
					txtArea.setText("La superficie ha superado el valor permitido. Que es 124,5");
				}else {
				txtArea.setText("El area del triangulo rectangulo es: " + cal.calcularAreaTandRFloat());
				}
			}
		}

	}
}
