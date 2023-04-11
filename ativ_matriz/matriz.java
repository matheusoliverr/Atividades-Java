import java.util.Scanner;
  
  
  class Main {
    public static void matriz(String[] args) {
  
      Scanner entrada = new Scanner(System.in);
      
      int M, N;
      
      System.out.print("Qual a quantidade de linhas da matriz? ");
      M = entrada.nextInt();
      System.out.print("Qual a quantidade de colunas da matriz? ");
      N = entrada.nextInt();
  
      int [] [] A = new int[M] [N];
      for (int i=0; i<M; i++){
        for(int j=0; j<N; j++){
          System.out.print("Elemento["+i+","+j+"]: ");
          A [i][j] = entrada.nextInt();
        }
      }
  
      System.out.println("Valores Negativos");
      for (int i=0; i<M; i++){
        for(int j=0; j<N; j++){
          if (A[i][j] <0 ){
          System.out.println(A [i][j]);
          }
        }
      }    
      entrada.close();
    }
  }
