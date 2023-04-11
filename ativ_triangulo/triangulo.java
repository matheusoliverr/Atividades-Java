import java.util.Scanner;

class Main {
  public static void triangulo(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double xA, xB, xC, yA, yB, yC;

    System.out.println("Digite as medidas do triangulo X: ");
    xA = entrada.nextDouble();
    xB = entrada.nextDouble();
    xC = entrada.nextDouble();

    System.out.println("Digite as medidas do triangulo Y: ");
    yA = entrada.nextDouble();
    yB = entrada.nextDouble();
    yC = entrada.nextDouble();

    double p = (xA+xB+xC)/2.0;
    double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

    p = (yA+yB+yC)/2.0;
    double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

    System.out.printf("A area do triangulo X: %.2f\n",areaX);
    System.out.printf("A area do triangulo Y: %.2f\n",areaY);

    if (areaX > areaY){
      System.out.println("O maior triangulo é X");
    }else{
      System.out.println("O maior triangulo é Y");
    }        
    entrada.close();
  }
}
