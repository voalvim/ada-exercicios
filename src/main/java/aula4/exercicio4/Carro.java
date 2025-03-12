package aula4.exercicio4;

public abstract class Carro {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String cor;
    protected Motor motor;

    public Carro(String marca, String modelo, int ano, String cor, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoMotor() {
        return this.motor.getTipo();
    }

    public double getPotenciaMotor() {
        return this.motor.getPotencia();
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public abstract void exibirDetalhes();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carro carro = (Carro) obj;
        return ano == carro.ano &&
                marca.equals(carro.marca) &&
                modelo.equals(carro.modelo) &&
                cor.equals(carro.cor);
    }
}