/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parentesis;

import java.util.Stack;

/**
 *
 * @author User
 */
public class Parentesis {

    /**
     * @param args the command line arguments
     */
   public static void main(String arg[]) {

            String cadena = "(()(()))";
            System.out.println("Verificación equilibrado en paréntesis para cadena: " + cadena);
            if (verificaParentesis(cadena) == true){
            System.out.println("los paréntesis  estan correctos");
            }else{
                System.out.println("los paréntesis estan incorrectos");
            }

    }

 

    public static boolean verificaParentesis(String cadena)  {

        Stack<String> pila = new Stack<String>();       int i = 0;

            while (i<cadena.length()) {  // Recorremos la expresión carácter a carácter

                if(cadena.charAt(i)=='(') {pila.push("(");} // Si el paréntesis es de apertura apilamos siempre                               

                else if  (cadena.charAt(i)==')') {  // Si el paréntesis es de cierre actuamos según el caso

                            if (!pila.empty()){ pila.pop(); } // Si la pila no está vacía desapilamos

                            else { pila.push(")"); break; } // La pila no puede empezar con un cierre, apilamos y salimos

                }

                i++;

            }

            if(pila.empty()){ return true; } else { return false; }

    }
    
}
