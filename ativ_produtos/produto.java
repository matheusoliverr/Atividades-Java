package ativ_produtos;
import java.util.Scanner;
import ativ_produtos.entidades.Produtos;

class Main {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    Produtos produto = new Produtos();

    System.out.println("Digite os dados do produto: ");
    System.out.print("Nome do produto: ");
    produto.nome = entrada.nextLine();

    System.out.print("Preço do produto: ");
    produto.preco = entrada.nextDouble();

    System.out.print("Quantidade produto: ");
    produto.quantidade = entrada.nextInt();

    System.out.println("Dados do produto: "+ produto);

    System.out.print("Digite o número de produtos para ser adicionado ao estoque: ");
    
    produto.adicProduto(entrada.nextInt());

    System.out.println("Dados do produto: "+ produto);

    System.out.print("Digite o número de produtos para ser removidos do estoque: ");
    
    produto.remProduto(entrada.nextInt());

    System.out.println("Dados do produto: "+ produto);
    
    entrada.close();
  }
}