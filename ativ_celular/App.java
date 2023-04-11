public class App{
    public static void main(String[] args) throws Exception{

        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        System.out.printf("Celular: %s, Tamanho da tela: %.2f, Espaço de armazenamento: %dgb, Sistema operacional: %s", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
    }
}