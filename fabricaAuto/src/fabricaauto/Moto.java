package fabricaauto;

public class Moto extends Automovel {
    public static final int ABS_DESATIVADO = 0;
    public static final int ABS_ATIVADO = 1;
    
    private int abs;
    private int bau;

    public Moto(String cor, String placa, String modelo) {
        super(cor, placa, modelo);
        this.abs = ABS_DESATIVADO;
        this.bau = 0;
    }

    public void alarme() {
        System.out.println("O alarme esta ativado.");
    }

    public int getAbs() {
        return abs;
    }

    public void setAbs(int abs) {
        this.abs = abs;
    }

    public int getBau() {
        return bau;
    }

    public void setBau(int bau) {
        this.bau = bau;
    }
}