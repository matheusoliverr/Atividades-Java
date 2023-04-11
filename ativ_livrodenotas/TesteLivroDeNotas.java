public class TesteLivroDeNotas {
    public static void main(String[] args){
        //instancia um livro de notas para a disciplina Programação com 10 alunos
        LivroDeNotas livro = new LivroDeNotas("Programação",10);

        //gera notas aleatórias
        livro.gerarNotas();

        //calcula as médias
        livro.calcularMedias();

        //exibe as médias
        livro.mostrarMedias();
    }
    
}