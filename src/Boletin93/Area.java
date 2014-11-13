package Boletin93;
// @author dpazolopez */

import javax.swing.JOptionPane;

public class Area {

    double base, altura;

    public double validarDato() {
        double valor;
        do {
            String dato = JOptionPane.showInputDialog("introduce dato");
            valor = Double.parseDouble(dato);
           if(valor<=0){
               JOptionPane.showMessageDialog(null, "Dato no válido,introduce dato positivo");
           }
        } while (valor<=0);
        return valor;
        
    }
    public void calcularArea(){
        base=validarDato();
        altura=validarDato();
        JOptionPane.showMessageDialog(null,"A area do rectangulo e= "+(base*altura));
    }
}
