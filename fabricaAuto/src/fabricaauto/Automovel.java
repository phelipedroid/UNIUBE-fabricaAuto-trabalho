package fabricaauto;
public class Automovel {
    private String cor;
    private String placa;
    private String modelo;
    boolean ligado;
    private boolean movimento;
    public Automovel(String cor, String placa, String modelo) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.ligado = false;
        this.movimento = false;
    }
    public void ligar() {
        if (ligado) {
            ligado = true;
            System.out.println("O automovel foi ligado.");
        } else {
            System.out.println("O automovel ja esta ligado.");
        }
    }
    public void mover() {
        if (ligado) {
            if (movimento) {
                movimento = true;
                System.out.println("O automovel esta em movimento.");
            } else {
                System.out.println("O automovel ja esta em movimento.");
            }
        } else {
            System.out.println("Nao e possivel movimentar o automovel, ele esta desligado.");
        }
    }
    public void parar() {
        if (movimento) {
            movimento = false;
            System.out.println("O automovel foi parado.");
        } else {
            System.out.println("O automovel ja esta parado.");
        }
    }
    public String getCor() {
        return cor;
    }
    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public boolean isMovimento() {
        return movimento;
    }
    public boolean isLigado() {
        return ligado;
    }
}