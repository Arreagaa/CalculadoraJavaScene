package org.christianrivas.bean;
import javax.swing.JOptionPane;
import org.christianrivas.bean.*;

/**
 * @author Christian Javier Rivas Arreaga IN5BM
 * @date 8/04/2021
 * @time 16:03:09
 */

public class Menu {
    //ATRIBUTOS
    private int op;
    //METODO
    public void opciones(){
        JOptionPane.showInputDialog("MENU\n"+ "--------------------------------------------\n" + "REALIZADO POR JAVIER RIVAS\n" 
        + "--------------------------------------------\n" + "1 SUMA\n" + "2 RESTA\n"+ "3 MULTIPLICACION\n" 
        + "4 DIVISION\n" + "5 SALIR\n" + " \n" + "PRESIONE ENTER PARA CONTINUAR\n"+ " \n");
    this.op=Integer.parseInt(JOptionPane.showInputDialog("ELIJA UNA OPCION"));
    switch(op){
        case 1:
        Suma suma = new Suma();
        suma.capturarNumero1();
        suma.capturarNumero2();
        suma.calcSuma();
        suma.retornoResul();
        JOptionPane.showMessageDialog(null,"HECHO POR JAVIER RIVAS");
        JOptionPane.showMessageDialog(null,"GRACIAS!");
        break;
        case 2:
        Resta resta = new Resta();
        resta.capturarNumero1();
        resta.capturarNumero2();
        resta.calcResta();
        resta.retornoResul();
        JOptionPane.showMessageDialog(null,"HECHO POR JAVIER RIVAS");
        JOptionPane.showMessageDialog(null,"GRACIAS!");
        break;
        case 3:
        Multiplicacion multi = new Multiplicacion();
        multi.capturarNumero1();
        multi.capturarNumero2();
        multi.calcMul();
        multi.retornoResul();  
        JOptionPane.showMessageDialog(null,"HECHO POR JAVIER RIVAS");
        JOptionPane.showMessageDialog(null,"GRACIAS!");
        break;
        case 4:
        Division div = new Division();
        div.capturarNumero1();
        div.capturarNumero2();
        div.calcDiv();
        div.retornoResul();
        JOptionPane.showMessageDialog(null,"HECHO POR JAVIER RIVAS");
        JOptionPane.showMessageDialog(null,"GRACIAS!");
        break;
        case 5:
        Salida sl =  new Salida();
        sl.salidaP();
        break;
        default: JOptionPane.showMessageDialog(null,"ESTA OPCION NO ES VALIDA");
        JOptionPane.showMessageDialog(null,"VUELVE A INTENTAR");
    }
    }
    
    
}
