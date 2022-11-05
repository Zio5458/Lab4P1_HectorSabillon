/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_hectorsabillon;
import java.util.Scanner;
public class Lab4P1_HectorSabillon {
    public static void calculobinario(String pal1, String pal2){
       char lleva = '0';
       String suma = "";
        for(int i = 0 ; i < pal1.length(); i++){
            char c1 = pal1.charAt(i);
            char c2 = pal2.charAt(i);
            
            if (lleva == '1') {
                if ((c1 == '1' && c2 == '0') || (c1 == '0' && c2 == '1')){
                suma = '0' + suma;
                lleva = '1';
        } else if (c1 == '0' && c2 == '0'){
            suma = '1' + suma;
            lleva = '0';
        } else if ((c1 == '1' && c2 == '1')){
            suma = '1' + suma;
            lleva = '1';
        } 
            } else {
                if ((c1 == '1' && c2 == '0') || (c1 == '0' && c2 == '1')){
                suma = '1' + suma;
                lleva = '0';
        } else if (c1 == '0' && c2 == '0'){
            suma = '0' + suma;
            lleva = '0';
        } else if ((c1 == '1' && c2 == '1')){
            suma = '0' + suma;
            lleva = '1';
            }
            
            
        }
           
    }
        if (lleva == '1'){
            suma = '1' + suma;
        }
      System.out.print(suma);
    }
    
    public static void contains(String contenedor, String contenida){
        int acum2 = 0, cont2 = 0;
        for (int i = 0; i < contenida.length(); i++){
            char ct1 = contenida.charAt(i);
            for (int j = cont2; j < contenedor.length(); j++){
                char ct2 = contenedor.charAt(j);
                cont2++;
                if (ct1 == ct2){
                    acum2++;
                    break;
                }
            }
            if (acum2 == contenida.length()){
                break;
            }
        }
        if (acum2 == contenida.length()){
        System.out.println(contenida + " esta contenida en " + contenedor);
        } else {
            System.out.println(contenida + " no esta contenida en " + contenedor);
        }
    }
    
    public static void alpha(String palabra){
        palabra = palabra.toLowerCase();
        int acum3 = 0;
        for (int i = 0; i < palabra.length(); i++){
            char caracter = palabra.charAt(i);
            int ascii = (int) caracter;
            if (ascii >= 97 && ascii <= 122){
              acum3++;  
            }
        }
        if (acum3 == palabra.length()){
                System.out.println("La cadena ingresada contiene solo caracteres");
            } else {
                System.out.println("La cadena ingresada no contiene solo caracteres");
            }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("1 <- Caluclo sumas de binario");
        System.out.println("2 <- Contains");
        System.out.println("3 <- Alpha");
        System.out.println("Ingrese el ejercicio a visualizar: ");
        int ejercicio = leer.nextInt();
        switch (ejercicio){
                case 1:
                    int cont1 = 0, cont2 = 0;
                    System.out.println("Ingrese un numero binario: ");
                    String pal1 = leer.next();
                    System.out.println("Ingrese otro numero binario: ");
                    String pal2 = leer.next();
                    do{
                    for (int i = 0; i < pal1.length(); i++){
                        cont1++;
                    }
                    for (int j = 0; j < pal2.length(); j++){
                        cont2++;
                    }
                    if (cont1 != cont2){
                        System.out.println("Las dos cadenas deben tener el mismo numero de bits");
                    }
                    } while (cont1 != cont2);

                    calculobinario(pal1, pal2);
                    break;
                case 2:
                    System.out.println("Ingrese la cadena contenedor: ");
                    String contenedor = leer.next();
                    System.out.println("Ingrese la cadena contenida: ");
                    String contenida = leer.next();
                    
                    contains(contenedor, contenida);
                    break;
                case 3:
                    System.out.println("Ingrese una cadena: ");
                    String palabra = leer.next();
                    
                    alpha(palabra);
                    break;
        }
    }
    
}
