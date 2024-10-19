/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
        
        
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio1 {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    
    String []nomes = new String[10];
    
        System.out.println("Digite 10 nomes: ");
        for(int i=0; i<nomes.length;i++){
            System.out.println("Nome " + (i+1) + ":");
            nomes[i] = scanner.nextLine();
            
        }
        System.out.println("\nNomes na Ordem Crescente: ");
        for(int i=0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        
        scanner.close();
        
            }

}
