package stay;

import Templates.Persona;
import Templates.Procesing;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
   public static void main(String args[]) throws IOException{
       ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Persona> outPersonas = new ArrayList<>();
       personas.add(new Persona("Jaime Sanchez",14,1.75,50));
       personas.add(new Persona("Juanito Sanchez",16,1.6,40));
       personas.add(new Persona("Pancho Sanchez",19,1.5,30));
       
       
       Procesing procesing=new Procesing();
       procesing.mostrarPersona(personas);
       procesing.guardarPersonasEnArchivo(personas, "nombre.txt");
    //   System.out.println(personas.get(0).getNombre()+""+personas.get(0).getEdad()+""
    //   +personas.get(0).getEstatura()+""+personas.get(0).getPeso()+"");
    //Procesing procesing=new Procesing();
    //procesing.mostrarPersona(personas);
   
        for (int i=0; i< outPersonas.size(); i++){
            System.out.println(
                    outPersonas.get(i).getNombre() + " | " +
                            outPersonas.get(i).getEdad() + " | " +
                            outPersonas.get(i).getEstatura() + " | " +
                            outPersonas.get(i).getPeso() + " | "
            );
        }
         File file = new File("nombre.txt");
        ReversedLinesFileReader object = new ReversedLinesFileReader(file);
        String line = object.readLine();
        System.out.println(line);
        String pattern = "\\(([^)]+)\\)\\(([^)]+)\\)\\(([^)]+)\\)\\(([^)]+)\\)";
        Matcher matcher = Pattern.compile(pattern).matcher(line);
        Persona personaUltima = null;
        if (matcher.find()) {
            personaUltima = new Persona(
                                matcher.group(1),
                                Integer.parseInt( matcher.group(2) ),
                                Double.parseDouble( matcher.group(3) ),
                                Integer.parseInt( matcher.group(4) )
                        );
        }
        System.out.println(personaUltima.toString());
        

    } 
 
}
