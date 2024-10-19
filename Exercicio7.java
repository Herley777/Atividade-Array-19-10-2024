/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author DaniB
 */
class Time {
    String nome;
    int pontos;
    int jogos;
    int vitorias;
    int empates;
    int derrotas;
    int golsPro;
    int golsContra;
    int saldoGols;
    double aproveitamento;

    public Time(String nome, int pontos, int jogos, int vitorias, int empates, int derrotas, int golsPro, int golsContra, int saldoGols, double aproveitamento) {
        this.nome = nome;
        this.pontos = pontos;
        this.jogos = jogos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
        this.saldoGols = saldoGols;
        this.aproveitamento = aproveitamento;
    }
}


public class Exercicio7 {
    public static void main(String[] args) {
        
        Time[] tabela = {
            new Time("Botafogo", 61, 30, 18, 7, 5, 48, 26, 22, 67),
            new Time("Palmeiras", 57, 29, 17, 6 , 6 ,46,20,26, 65),
            new Time("Fortaleza", 56,30,16,8,6,39,30,9,62),
            new Time("Flamengo", 51,29,15,6,8,45,34,11,58),
            new Time("Sao Paulo", 50,30,15,5,10,41,32,9,55),
            new Time("Bahia", 46,30,1,7,10,40,34,6,51),
            new Time("Internacional", 46,28,12,10,6,37,26,11,54),       
            new Time("Cruzeiro",   44,30,12,8,10,36,30,6,48),     
            new Time("Atletico-MG", 41,29,10,11,8,41,42,-1,47),       
            new Time("Vasco",    37,29,10,7,12,32,41,-9,42),    
            new Time("Criciuma",  36,30,9,9,12,37,43,-6,40),      
            new Time("Gremio",   35,29,10,5,14,33,37,-4,40),     
            new Time("Bragantino",   34,29,8,10,11,34,38,-4,39),     
            new Time("Juventude",   34,29,8,10,11,33,39,-6,39),     
            new Time("Fluminense",  33,29,9,6,14,24,30,-6,37),      
            new Time("Corinthians", 32,30,7,11,12,34,40,-6,35),       
            new Time("Athletico-PR", 31,28,8,7,13,29,36,-7,36),       
            new Time("Vitoria", 29,29,8,5,16,32,44,-12,33),       
            new Time("Cuiaba",  27,29,6,9,14,25,39,-14,31),      
            new Time("Atletico-GO",  22,30,5,7,18,22,47,-25,24),      
            // Adicione mais times conforme necessário
        };

        // Exibir a tabela
        for (Time time : tabela) {
            System.out.println(time.nome + " - Pontos: " + time.pontos + ", Jogos: " + time.jogos + 
                ", Vitorias: " + time.vitorias + ", Empates: " + time.empates + ", Derrotas: " + time.derrotas + 
                ", Gols Pro: " + time.golsPro + ", Gols Contra: " + time.golsContra + 
                ", Saldo de Gols: " + time.saldoGols + ", Aproveitamento: " + time.aproveitamento + "%");
            
            System.out.println("____________________________________________________________________________________________________________________________________________________________________");
        }
    }
}
        




