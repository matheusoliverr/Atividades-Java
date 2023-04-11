import java.util.Random;

import javax.swing.JOptionPane;

public class LivroDeNotas{
    public String nomeDisciplina;
    public double notas1[];
    public double notas2[];
    public double medias[];    
    public int qtdeAlunos;


    public LivroDeNotas(String nomeDisciplina, int qtdeAlunos){
        this.nomeDisciplina = nomeDisciplina;
        this.notas1 = new double[qtdeAlunos];
        this.notas2 = new double[qtdeAlunos];
        this.medias = new double[qtdeAlunos];
        this.qtdeAlunos = qtdeAlunos;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void gerarNotas(){
        Random gerador = new Random ();
        for (int i = 0; i < this.qtdeAlunos; i++) {
            this.notas1[i] = gerador.nextDouble() * 10;
            this.notas2[i] = gerador.nextDouble() * 10;
        }
    }

    public void calcularMedias () {
        for (int i = 0; i < this.notas1.length; i++) {
            double media = (this.notas1[1] + this.notas2[i])/2;
            this.medias[i] = media;
        }
    }

    public void mostrarMedias(){
        String todasAsMedias = "";
        for(int i = 0; i < qtdeAlunos; i++){
            todasAsMedias += String.format("Aluno %d: %.2f\n", i + 1, medias[i]);
        }
        JOptionPane.showMessageDialog(null, todasAsMedias);
    }

}