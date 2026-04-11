package Oficina;

public class Moto extends Veiculo{
    private int qntCilindradas;
    public Moto(String marca, String modelo, String cor, String id, String tipo, String placa, String ano, int qntCilindradas) {
        super(marca, modelo, cor, id, tipo, placa, ano);
        this.qntCilindradas = qntCilindradas;
    }

    @Override
    public void descricao() {
        System.out.println("Marca: "+getMarca()+"Modelo: "+ getModelo() + "Cor: " +getCor() +"Ano: "+getAno());
    }

    @Override
    public void ligar() {
        System.out.println("Ligando moto "+getModelo()+"!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando moto "+getModelo()+"!");
    }

    public void acionarPeDescanso(){
        System.out.println("Pé de descanso acionado!");
    }
}
