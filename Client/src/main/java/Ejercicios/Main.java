package Ejercicios;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
    int numero =     JOptionPane.showOptionDialog(null,"Calcular area","Calcular area",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Calcular area rectangulo", "Calcular area triangulo rectangulo"},"Calcular area rectangulo");
        System.out.println("selecciono  "+numero);
        CalcularArea a = new CalcularArea();
    if(numero == 0){
        JOptionPane.showMessageDialog(null, "Calcular area de un rectangulo");
        int b = Integer.valueOf( JOptionPane.showInputDialog(null, "Ingrese la base del rectangulo"));
        int h = Integer.valueOf( JOptionPane.showInputDialog(null, "Ingrese la altura del rectangulo"));
        JOptionPane.showMessageDialog(null, "El area del rectangulo con base "+b+" y altura "+h+ " es = " + a.AreaRectangulo(b, h));  
    }else if(numero == 1){
        JOptionPane.showMessageDialog(null, "Calcular area de un triangulo rectangulo");
        int b = Integer.valueOf( JOptionPane.showInputDialog(null, "Ingrese la base del rectangulo"));
        int h = Integer.valueOf( JOptionPane.showInputDialog(null, "Ingrese la altura del rectangulo"));
        JOptionPane.showMessageDialog(null, "El area del rectangulo con base "+b+" y altura "+h+ " es = " + a.AreaTrianguloRectangulo(b, h));  
    }
   
    }
}
