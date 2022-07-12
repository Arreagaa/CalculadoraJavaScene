package org.christianrivas.bean;
import javax.swing.JOptionPane;

/**
 * @author Christian Javier Rivas Arreaga IN5BM
 * @date 8/04/2021
 * @time 15:12:02
 */

public class Suma {
    //ATRIBUTOS
    private double numero1;
    private double numero2;
    private double resulSuma;
    
    //CONSTRUCTOR
    public Suma(){
}
    public Suma(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //METODOS SET
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public double getResulSuma() {
        return resulSuma;
    }
    public void setResulSuma(double resulSuma) {
        this.resulSuma = resulSuma;
    }
    
    //INGRESO DE DATOS
    public void capturarNumero1(){
        this.numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO:"));
    }
    public void capturarNumero2(){
        this.numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO:"));
    }
    public void calcSuma(){
        this.resulSuma = (this.numero1 + this.numero2);
    }
    public void retornoResul(){
        JOptionPane.showMessageDialog(null, "EL RESULTADO ES DE: " + this.resulSuma);
    }
}
 