package menor_classe;

import java.util.Scanner;

public class menor_tres {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Valores valor = new Valores();

        for(int i=0; i<3;i++){
            System.out.println("Digite um número: ");
            valor.x = sc.nextFloat();

            valor.compara();
        }

        System.out.println("Menor: " + valor.menor);

        sc.close();
    }
}