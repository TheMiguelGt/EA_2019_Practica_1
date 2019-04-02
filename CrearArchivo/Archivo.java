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

public class Archivo {

    public static void main(String[] args) {
        Scanner popo = new Scanner(System.in);
        String frase;
        int conta = 0,x;
        try {
            File archivo = new File("texto.txt");//creaar o abrir acceso a un archivo y en un constructor
            FileWriter escribir = new FileWriter(archivo, true);//escribir sobre un archivo 
            System.out.println("¿Que deseas escribir?"); //lo que desea escribir
            frase=popo.next();
            for(x=0;x<frase.length();x++){
                if(frase.charAt(x)=='a' || frase.charAt(x)=='e' || frase.charAt(x)=='i' || frase.charAt(x)=='o' || frase.charAt(x)=='u' || frase.charAt(x)=='A' || frase.charAt(x)=='E' || frase.charAt(x)=='I' || frase.charAt(x)=='O' || frase.charAt(x)=='U'){
                    conta++;
                }
            }
            System.out.println("Contiene\t"+conta+"\tvocales");
            escribir.write(frase);//Escribir en el archivo con el metodo write 
            escribir.close();//crear una conexion
        } 
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

}
