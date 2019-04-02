/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrearArchivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Archivo {

    public static void main(String[] args) {
        Scanner popo = new Scanner(System.in);
        String frase;
        int i,conta=0,conte=0,conti=0,conto=0,contu=0;
        char caracter;
        char [] Arraycadena;
        try {
            File archivo = new File("texto.txt");//creaar o abrir acceso a un archivo y en un constructor
            FileWriter escribir = new FileWriter(archivo, true);//escribir sobre un archivo 
            
            System.out.println("Escribe");
            frase = popo.next();
            for (i = 0; i < frase.length(); i++) {
                if(frase.charAt(i)=='a'){
                    conta++;
                }
                if(frase.charAt(i)=='e'){
                    conte++;
                }
                if(frase.charAt(i)=='i'){
                    conti++;
                }
                if(frase.charAt(i)=='o'){
                    conto++;
                }
                if(frase.charAt(i)=='u'){
                    contu++;
                }
            }
            System.out.println("A="+conta+"\nE="+conte+"\nI="+conti+"\nO="+conto+"\nU="+contu);
            escribir.write(frase);//Escribir en el archivo con el metodo write 
            escribir.close();//crear una conexion
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }
}
