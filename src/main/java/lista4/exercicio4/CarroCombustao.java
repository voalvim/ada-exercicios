package lista4.exercicio4;

public class CarroCombustao extends Carro {
    private int capacidadeTanque;
    private String tipoCombustivel;

    public CarroCombustao(String marca, String modelo, int ano, String cor, Motor motor) {
        super(marca, modelo, ano, cor, motor);
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Capacidade do Tanque: " + capacidadeTanque + " litros");
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
    }
}