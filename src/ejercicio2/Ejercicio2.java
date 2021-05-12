/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author javier Bustamante
 * @version 1.0
 * caso: Se tiene un campo de texto que solo acepta caracteres alfabéticos. La
 * longitud del valor ingresado debe estar entre 6 y 10 caracteres.
 */
public class Ejercicio2 {

    private String campoTexto;

    public String getCampoTexto() {
        return campoTexto;
    }

    public void setCampoTexto(String campoTexto) {
        this.campoTexto = campoTexto;
    }
    
    /**
     * este método parece no usarse
     * /
    /*private int longuitudTexto() {
        return campoTexto.length();
    }*/
    
    private Boolean isLonguitudCorrecta(String miCadena){
        int miCadenaLonguitud = miCadena.length();
        if ((miCadenaLonguitud >= 6) && (miCadenaLonguitud<=10)) {
            return true;
        }
        return false;
    }
    private Boolean isAlfabetica (String miCadena) {
        for (int x = 0; x < miCadena.length(); x++) {
            char c = miCadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
    
    public String IntroducirCadena (String miCadena) {
        // Comprobamos si la cadena es válida según el enunciado del problema.
        
        if (isAlfabetica(miCadena) && isLonguitudCorrecta(miCadena) ){
            this.campoTexto = miCadena;
            return "Cadena correcta. La aplicación permite el ingreso.";
        } else if (!isAlfabetica(miCadena)) {
            return "Cadena incorrecta. No es alfabética.";
        } else if (miCadena.length() < 6) {
            return "Cadena incorrecta. La longuitud de la cadena es < 6";  
        } else if (miCadena.length() > 10) {
            return "Cadena incorrecta. La longuitud de la cadena es > 10";  
        }
        return "Error desconocido";
    }
            
    
}
