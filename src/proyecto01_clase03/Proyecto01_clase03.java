/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto01_clase03;
import java.util.Scanner;
public class Proyecto01_clase03 {
    public static void main(String[] args) {
    double num1, num2, suma, promedio;
    Scanner lectura = new Scanner(System.in);
    System.out.print("Ingresar numero 1: ");
    num1 = lectura.nextDouble();
    System.out.print("Ingresar numero 2: ");
    num2 =lectura.nextDouble();
    System.out.println("Resultados de la aplicacion: ");
    suma = num1 + num2;
    promedio = suma / 2;
    System.out.println("La suma es: "+suma);
    System.out.println("El promedio es: "+promedio);
    }
    
}
