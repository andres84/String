
package string;


public class prueba_String {

    
    public static void main(String... fragozo) {
        
        String texto = "Fragozo";
        String texto2 = "fragozo";
        //charArt sustrae un caracter en cualquier posicion
        //char prueba = texto.charAt(0);//posicion 0 captura primera letra de variable texto
        
        //compara dos variables de tipo cadena y compara si son iguales
        int comp = texto.compareTo(texto2);
        int comp2 = texto.compareToIgnoreCase(texto2);
        //indexOf muestra la posicion que se encuentra un caracter en una variable
        int posicion = texto2.indexOf("a");
        System.out.println(posicion);
        System.out.println(comp);
        System.out.println(comp2);
        //System.out.println(prueba);
        
    }
    
}
