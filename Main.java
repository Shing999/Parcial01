/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorap1;
import java.util.Scanner;
/**
 *
 * @author BOBNETWORKS-SOPORTE
 */
public class Main {
    public static void main(String[] args) {
        int opcion;
        double numero1 = 0 ;
        double numero2 = 0;
        boolean salida = false;
        
        CalculadoraMatematica calculo = new CalculadoraMatematica(numero1, numero2);
        
        Scanner scanner = new Scanner(System.in);
        
        // el do while es para  la salida, ponerle una condicion para apagar la calculadora 
        do{ 
            //este es el menu principal 
            System.out.println("====Calculadora Matematica====");
                System.out.println("1. Ingrese un numero:" );
                System.out.println("2. Suma:");
                System.out.println("3. Resta:");
                System.out.println("4. Multiplicacion:");
                System.out.println("5. Division");
                System.out.println("0. Salida:");
                System.out.println("=============================");
                System.out.println("Seleccione una opccion:");
                opcion = scanner.nextInt(); //aqui se guarda la opcion que escoges 
                
                //switch para cada operacion tenemos que crear un caso 
            switch (opcion){
                // Para seleccionar los numeros a sumar 
            case 1:
             System.out.println("Ingrese el Numero:");
             numero1 = scanner.nextDouble(); //aqui guarda el primer numeros a operar 
             System.out.println("Ingrese el Numero:");
             numero2 = scanner.nextDouble();//aqui guarda el segundo numeros a operar 
             break;

                // caso para sumar 
            case 2:
                System.out.println(numero1 + "+" + numero2 + "=" + (calculo.suma(numero1, numero2)));
                
                break;

                // caso para restar 
            case 3:
                System.out.println(numero1 + "-" + numero2 + "=" + (calculo.resta(numero1, numero2)));
                break;   
                
                //caso para multiplicar 
            case 4:
                System.out.println(numero1 + "*" + numero2 + "=" + (calculo.multiplicacion(numero1, numero2)));
                break;   
                
                //caso para dividir 
            case 5: 
                System.out.println(numero1 + "/" + numero2 + "=" + (calculo.division(numero1, numero2)));
                break; 
                
                //caso para apagar la calculadora 
            case 0:
                System.out.println("Apagaste la Calculadora");
                salida = true;
                break;
                    
            }
        }while(salida !=true);// la condicion para apagar la calculadora 0
        scanner.close();
        
    }
}
