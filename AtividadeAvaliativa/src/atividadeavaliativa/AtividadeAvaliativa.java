public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        int[][] sala = new int[6][8];
        int opcao;

        do {
            System.out.println("\n===== CINEMA =====");
            System.out.println("1 - Reservar assento");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Exibir mapa da sala");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            //RESERVAR
            if (opcao == 1) {

                System.out.print("Fileira: ");
                int fileira = sc.nextInt();

                System.out.print("Assento: ");
                int assento = sc.nextInt();

                if (sala[fileira - 1][assento - 1] == 0) {
                    sala[fileira - 1][assento - 1] = 1;
                    System.out.println("Assento reservado");
                } else {
                    System.out.println("Assento esta ocupado");
                }
            }

            //CANCELAR
            else if (opcao == 2) {

                System.out.print("Fileira: ");
                int fileira = sc.nextInt();

                System.out.print("Assento: ");
                int assento = sc.nextInt();

                if (sala[fileira - 1][assento - 1] == 1) {
                    sala[fileira - 1][assento - 1] = 0;
                    System.out.println("reserva cancelada");
                } else {
                    System.out.println("Assento já estava livre");
                }
            }

            //MAPA SALA
            else if (opcao == 3) {

                System.out.println("\nMapa da sala:");

                for (int i = 0; i < 6; i++) {
                    System.out.print("Fileira " + (i + 1) + ": ");

                    for (int j = 0; j < 8; j++) {
                        System.out.print(sala[i][j] + " ");
                    }

                    System.out.println();
                }
            }

        } while (opcao != 4);

        System.out.println("Programa encerrado.");
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeavaliativa;
import java.util.Scanner;


/**
 *
 * @author 32611529
 */
public class AtividadeAvaliativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int lugares[][] = new int [6][8];
        int lugaresOcupados[][] = new int [6][8];
        int i, j;
        String opcoes;
        int quantidadeLivres = 0;
        int quantidadeOcupados = 0;
        int totalLivres = 0;
        int totalOcupados = 0;
        double percentualOcupacao;
        
          System.out.println("Escolha uma opção: ");
                System.out.println("  Reservar assento ");
                System.out.println("  Cancelar reserva ");
                System.out.println("  Exibir mapa da sala");
                System.out.println("  Exibir quantidade de assentos livres e ocupados ");
                System.out.println("  Encerrar ");
                opcoes = entrada.nextLine();
                
     
        
        for ( i = 0; i < lugares.length - 1; i++) {
            for ( j = 0; j < lugares.length - 1; i++) {
            
      
             
                if(opcoes.equalsIgnoreCase("Reservar assento")){
                    
                    System.out.println("Digite a fileira ");
                    lugares[i][j]= entrada.nextInt();
                    
                    System.out.println("Digite o número do assento ");
                     lugares[i][j]= entrada.nextInt();
                     
                     if(lugares[i][j] == lugares[i][j]){
                        quantidadeLivres ++;
                         System.out.println("Lugar Ocupado");
                         
                     }
                     else{
                         if(lugares[i][j] != lugares[i][j]){
                             System.out.println("Lugar Livre");
                             quantidadeOcupados ++;
                         }
                     }
                            
                }
                
                if(opcoes.equalsIgnoreCase("Exibir mapa da sala")){
                    System.out.println("Fileira " + i + lugares[i][j] + " ");
                }
                if(opcoes.equalsIgnoreCase("Cancelar Reserva ")){
                    
                    System.out.println("Digite a fileira ");
                    lugares[i][j]= entrada.nextInt();
                     
              
                     System.out.println("Digite o número do assento ");
                     lugares[i][j]= entrada.nextInt();
                     
                     if(lugares[i][j] == lugares[i][j]){
                         System.out.println("Reserva cancelada");
                         quantidadeLivres++;
                         
                         lugares[i][j] = 0;
                     }
                     
                     else{
                         if(lugares[i][j] != lugares[i][j]){
                             System.out.println("Lugar já livre ");
                         }
                   
                }
                  
                
            }
                if(opcoes.equalsIgnoreCase("Exibir quantidade de assentos livres e ocupados")){
                totalLivres += quantidadeLivres;
                totalOcupados += quantidadeOcupados;
                
                System.out.println("Total de lugares livres " + totalLivres);
                 System.out.println("Total de lugares livres " + totalOcupados);
                }
                 if(opcoes.equalsIgnoreCase("Encerrar")){
                         System.out.println("Programa encerrado");
                     }
        }
        }
    }
}



