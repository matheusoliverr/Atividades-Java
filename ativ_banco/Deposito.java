import java.util.Scanner;

public class Deposito {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite o número da conta: ");
        conta.setNumero(sc.nextInt());

        sc.nextLine();

        System.out.println("Digite o nome do titular da conta: ");
        conta.setNome(sc.nextLine());

        System.out.println("Deseja fazer deposito inicial(s/n)?");
        char depInicial = sc.next().charAt(0);

        if(depInicial == 's'){
            System.out.println("Digite o valor do depósito inicial:");
            conta.deposito(sc.nextFloat());
        }

        System.out.println("Digite o valor do depósito:");
        conta.deposito(sc.nextFloat());

        System.out.println("Digite o valor da retirada:");
        conta.retirada(sc.nextFloat());
        
        sc.close();
        
    }
}