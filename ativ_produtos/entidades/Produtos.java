package ativ_produtos.entidades;

public class Produtos{

  public String nome;
  public double preco;
  public int quantidade;

public double TotalValorEstoque(){
  return preco * quantidade;
}
public void adicProduto(int quantidade){
  this.quantidade +=quantidade;
}
public void remProduto(int quantidade){
  this.quantidade -=quantidade;
}  
public String toString(){
  return nome
    + ", R$ "
    + String.format("%.2f", preco)
    + ", "
    + quantidade
    + " unidades, Total R$ "
    + String.format("%.2f",TotalValorEstoque());
}
}