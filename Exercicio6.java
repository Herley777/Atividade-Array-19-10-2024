/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
         int[]numeros = new int[100];

        System.out.println("Digite 100 numeros: ");
         for(int i =0;i < numeros.length; i++){
            System.out.println("Numero "+ (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }
         
         System.out.println("\nIndices dos numeros Pares");
         for(int i = 0; i < numeros.length;i++ ){
             if (numeros[i]%2 != 0){
                 System.out.println("Numero: " +numeros[i] + " Esta no indice: " +i);
             }
         }
    scanner.close();
    }
}
