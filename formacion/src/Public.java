paquete pkgpublic;

import java.io.InputStream;
import javax.swing.JOptionPane;pkgpublic;

import javax.swing.JOptionPane;

public class Public {

   
    public static void main (String [] args) {
        
         Entrada del escáner;
         entrada = nuevo escáner (System.in);

        int arreglo [], y, aux;



        y = Integer.parseInt (JOptionPane.showInputDialog ("configuración el número del arreglo"));



        arreglo = new int [y]; 



        para (int i = 0; i <y; i ++) {

            System.out.print ((i + 1) + ".Introduzca un numero");

            arreglo [i] = entrada.nextInt ();

        }

        

        para (int i = 0; i <(y - 1); i ++) {

            para (int h = 0; h <(y - 1); h ++) {

                if (arreglo [h]> arreglo [h + 1]) {

                    aux = arreglo [h];

                    arreglo [h] = arreglo [h + 1];

                    arreglo [h + 1] = aux;

                }

            }

        }

       

        System.out.print ("\ nArreglo ordenado menor a mayor:");

        para (int i = 0; i <y; i ++) {

            System.out.print (arreglo [i] + "-");

        }

        System.out.print ("\ nArreglo ordenado de mayor a menor:");

        para (int i = (y - 1); i> = 0; i--) {

            System.out.print (arreglo [i] + "-");

        }

        System.out.println ("");

    }

    private static void escáner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}

