package org.christianrivas.bean;
import javax.swing.JOptionPane;

/**
 * @author Christian Javier Rivas Arreaga IN5BM
 * @date 8/04/2021
 * @time 15:40:01
 */

public class Resta {
    //ATRIBUTOS
    private double numero1;
    private double numero2;
    private double resulResta;
    
    //CONSTRUCTOR
    public Resta(){
}
    public Resta(double numero1, double numero2) {
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

    public double getResulResta() {
        return resulResta;
    }

    public void setResulResta(double resulResta) {
        this.resulResta = resulResta;
    }
    
    //INGRESO DE DATOS
    public void capturarNumero1(){
        this.numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO:"));
    }
    public void capturarNumero2(){
        this.numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO:"));
    }
    public void calcResta(){
        this.resulResta = (this.numero1 - this.numero2);
    }
    public void retornoResul(){
        JOptionPane.showMessageDialog(null, "EL RESULTADO ES DE: " + this.resulResta);
    }
}
