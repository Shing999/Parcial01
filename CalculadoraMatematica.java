/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorap1;

/**
 *
 * @author BOBNETWORKS-SOPORTE
 */

// Clase para realizar las operaciones
public class CalculadoraMatematica {
    private double numero1;
    private double numero2;
    
    // este es el construcctor 
    public CalculadoraMatematica(double numero1, double numero2){
    this.numero1 = numero1;
    this.numero2 = numero2; 
    
    }
    
    // setnumero para agregarle valor a las variable
    public void setnumero1 (double numero1){
        this.numero1 = numero1;    
    }
    public void setnumero2 (double numero2){
        this.numero2 = numero2; 
    }
    
    //metodo para sumar
    public double suma (double numero1, double numero2){
    return (numero1 + numero2);
    }
    //metodo para restar
    public double resta (double numero1, double numero2){
    return (numero1 - numero2);
    }
    //metodos para multiplicar
    public double multiplicacion (double numero1, double numero2){
    return (numero1 * numero2);
    }
    //metodo para dividir 
    public double division (double numero1, double numero2){
       if (numero2 ==0){
        System.out.println("No se puede dividor por 0");
        return 0;
        }
       else{
    return (numero1 / numero2);
       }
    }
}
