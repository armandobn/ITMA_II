package expresion_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresion_Regular {

    public static void main(String[] args) {
        Expresion_Regular n = new Expresion_Regular();
        
        System.out.println(direccion("Reforma 22, Centro , Cuactemoc , Ciudad "));
      
    }

    public static boolean codigo_postal(String postal) {

        return postal.matches("^[0-9]{6}$");
    }

    public static boolean telefono_fijo(String telefono) {

        return telefono.matches("^([55]{2})([0-9]{8})$");
    }

    public static boolean telefono_celular(String telefono) {
        return telefono.matches("^([55]|[56]{2})([0-9]{8})$");
    }
    //Calle ·, Colonia, Municipio, estado
    public static boolean direccion(String direccion) {
        //Reforma 23, centro, Cuactrmoc, Ciudad de mexico
        String regexp = 
        "^([A-Z]{1}[a-z]+[ ]+[0-9]{2},[ ]+[A-Z]{1}[a-z]+[ ],[ ]+[A-Z]{1}[a-z]+[ ],[ ]+[A-Z]{1}[a-z]+[ ]?)$";
        return Pattern.matches(regexp, direccion);
    }

    public static boolean nombre(String nombre) {
        //^[(A-Z){1}][a-z]$
        //^([A-Z]{1}[a-z]+[ ]?){1,2}$
        String regexp = "^([A-Z]{1}[a-z]+[ ]?){1,2}$";
        return Pattern.matches(regexp, nombre);
        //return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
    }

    public static boolean correo_institucional(String correo) {
       //@milpaalta2.tecnm.mx
       //[^@]+@[^@]+\\.[a-zA-Z]{2,}
       //^([a-z0-9_\\.\\+-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$
        String regexp = "^([a-z0-9_\\.\\+-]+)@milpaalta2.tecnm.mx$";
        return Pattern.matches(regexp, correo);
    }

    public static boolean correo_externo(String correo) {
       //@milpaalta2.tecnm.mx
       //[^@]+@[^@]+\\.[a-zA-Z]{2,}
       //^([a-z0-9_\\.\\+-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$
        String regexp = "^([a-z0-9_\\\\.\\\\+-]+)@([\\\\da-z\\\\.-]+)\\\\.([a-z\\\\.]{2,6})$";
        return Pattern.matches(regexp, correo);
    }  
    //YYYY-MM-DD
    public static boolean fecha(String fecha) {
       String regexp = "^([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[02]))";
       return Pattern.matches(regexp, fecha);
    }
    //171190031
    public static boolean numero_control(String matricula) {
       String regexp = "^1711[0-9]{5}";
       return Pattern.matches(regexp, matricula);
    }
    
    public static boolean edad(String edad) {
       String regexp = "^[0-9]{2}";
       return Pattern.matches(regexp, edad);
    }
    
}
























