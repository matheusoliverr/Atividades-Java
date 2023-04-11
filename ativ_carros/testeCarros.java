import javax.swing.JOptionPane;

public class testeCarros {
    public static void main(String[] args) {
        Carro carro = new Carro();

        String nomeModelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
        carro.setModelo(nomeModelo);

        String nomeFabricante = JOptionPane.showInputDialog("Digite o fabricante do carro: ");
        carro.setFabricante(nomeFabricante);

        carro.anunciaCarro();
        JOptionPane.showMessageDialog(null, nomeModelo, carro.compraCarro(), 0);

    }
}
