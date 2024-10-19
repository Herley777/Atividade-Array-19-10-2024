/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
                int[]numeros = new int[50];
                
System.out.println("Digite 50 numeros: ");
        for(int i =0;i < numeros.length; i++){
            System.out.println("Numero "+ (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("\nNumeros na Ordem Decrescente: ");
        for(int i = numeros.length - 1 ; i>=0 ; i--){
            System.out.println(numeros[i]);
        }
        scanner.close();
    }
        
}
