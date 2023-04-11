package menor_classe;

public class Valores {
    float menor, x;

    public void compara(){
        if (x < menor || menor==0){
            menor = x;  
        }
    }
}
