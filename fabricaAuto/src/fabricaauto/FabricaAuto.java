package fabricaauto;

public class FabricaAuto {    
   
    public static void main(String[] args) {        
        Carro carro = new Carro("Branco", "SGR-7785", "Perua");
        
        System.out.println("Carro: BMW X1");
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Teto Solar: " + (carro.getTetoSolar() == Carro.TETO_SOLAR_ABERTO ? "Aberto" : "Fechado"));

  
        Moto moto = new Moto("Azul", "GHE-2567", "MT-07");
        System.out.println("Moto: MT-07");
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("ABS: " + (moto.getAbs() == Moto.ABS_ATIVADO ? "Ativado" : "Desativado"));
        System.out.println("Moto Ligada: " + (moto.isLigado() ? "Sim" : "Nao"));
    }
}