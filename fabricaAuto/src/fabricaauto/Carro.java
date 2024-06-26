package fabricaauto;
public class Carro extends Automovel {
    public static final int TETO_SOLAR_FECHADO = 0;
    public static final int TETO_SOLAR_ABERTO = 1;
    private int tetoSolar;
    private int aberto;
    public Carro(String cor, String placa, String modelo) {
        super(cor, placa, modelo);
        this.tetoSolar = TETO_SOLAR_FECHADO;
        this.aberto = TETO_SOLAR_FECHADO;
    }
    public void abrirFechar() {
        if (aberto == TETO_SOLAR_FECHADO) {
            aberto = TETO_SOLAR_ABERTO;
            System.out.println("Carro esta aberto.");
        } else {
            aberto = TETO_SOLAR_FECHADO;
            System.out.println("Carro esta fechado.");
        }
    }
    public int getTetoSolar() {
        return tetoSolar;
    }    
    public void setTetoSolar(int tetoSolar) {
        this.tetoSolar = tetoSolar;
    }    
    public int getAberto() {
        return aberto;
    }   
    public void setAberto(int aberto) {
        this.aberto = aberto;
    }
   public boolean isLigado() {
        return ligado;
    }
 }


