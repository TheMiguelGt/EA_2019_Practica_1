/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_2.data;

import Practica_2.Templates.Producto;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CAT
 */
public class ArchivoProducto {
   public void guardarProducto(ArrayList<Producto> productos){
        try {
            FileWriter fileWriter = new FileWriter("productos.txt", true);
            for (int i = 0; i < productos.size(); i++) {/*
                fileWriter.write(
                        "{{" + productos.get(i).getNombre() + "}}" +
                        "{{" + productos.get(i).getPrecio() + "}}" +
                        "{{" + productos.get(i).getPeso() + "}}" +
                        "{{" + productos.get(i).getVolumen() + "}}"
                );*/
                System.out.println(
                "{{" + productos.get(i).getNombre() + "}}" +
                "{{" + productos.get(i).getPrecio() + "}}" +
                "{{" + productos.get(i).getPeso() + "}}" +
                "{{" + productos.get(i).getVolumen() + "}}");
            }
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
