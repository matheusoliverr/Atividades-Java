import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

    Aluguel [] vetor = new Aluguel[10];
    System.out.print("Quantos quartos serão alugados? ");
    int n = sc.nextInt();

    for( int i =1; i<=n; i++){
    System.out.println("Rent "+i);
    System.out.print("Nome: ");  
    sc.nextLine();
    String nome = sc.nextLine();
    System.out.print("Email: ");  
    String email = sc.nextLine();
    System.out.print("Quarto: " );  
    int quarto = sc.nextInt();
    vetor[quarto] = new Aluguel(nome,email);
    }
    System.out.println("Quartos ocupados: ");  

    for( int i =1; i<10; i++){
    if (vetor[i]!=null){
      System.out.println(i + " : " + vetor[i]);
    }
    }

    sc.close();
  }
}