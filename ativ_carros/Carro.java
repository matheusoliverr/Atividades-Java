import javax.swing.JOptionPane;

public class Carro{
    private String modelo;
    private String fabricante;  

    private int confirmarCompra;


    public void anunciaCarro(){
        System.out.printf("Carro de modelo %s fabricado por %s", getModelo(), getFabricante());
        System.out.println();
    }

    public String compraCarro(){
        confirmarCompra = JOptionPane.showConfirmDialog(null, modelo, "Deseja comprar esse carro?", 0, 0);

        if(confirmarCompra == 0){
            return "Parabéns, o carro é seu!!";
        } else {
            return "Agradecemos pela preferência.";
        }
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
}