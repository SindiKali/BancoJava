//Imports:
import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    //Leitor de tecla:
    Scanner teclado = new Scanner(System.in);

    //Inicialização:
    System.out.println("||| BEM-VINDO AO BANCO JAVA |||");
    System.out.println("Vamos criar sua nova conta corporativa.");
    System.out.println("Digite o nome do titular:");
    String titular = teclado.nextLine();

    //Depósito:
    System.out.println("Qual será o seu primeiro depósito?(Ex: 12000):");
    double saldo = teclado.nextDouble();

    //Salva se o sistema está ativo:
    boolean Sistema = true;

    //Menú principal:
    while(Sistema){
      System.out.println("\n||| MENÚ PRINCIPAL |||");
      System.out.println("1- Ver Saldo");
      System.out.println("2- Depositar Dinheiro");
      System.out.println("3- Desligar Software");
      System.out.println("Escolha uma opção(Ex: 2)");

      int escolha = teclado.nextInt();

      //Escolhas:
      if(escolha == 1){
        System.out.println("-> Titular: " + titular);
        System.out.println("-> Saldo: " + saldo + " reais");
      } else if(escolha == 2){
        System.out.println("Digite o valor para depósito(Ex: 12000):");
        double deposito = teclado.nextDouble();
        saldo = saldo + deposito;
        System.out.println("Saldo depositado, seu saldo é: " + saldo + "reais");
      } else if(escolha == 3){
        System.out.println("Desligando o software...");
        Sistema = false;
      } else{
        System.out.println("Opção inválida.");
      }
    }

    teclado.close();
  }
}