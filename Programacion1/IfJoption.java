package Programacion1.EjerciciosUCES.Condicionales;
/*

== Igual
!= Diferente
< Menor
> Mayor

 */


import javax.swing.JOptionPane;

public class IfJoption {

public static void main (String[] args) {

int numero, dato = 5;

numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

if(numero == dato){

JOptionPane.showMessageDialog(null,"El numero es 5");

}
else {

    JOptionPane.showMessageDialog(null,"El numero es diferente de 5");
}
}
}