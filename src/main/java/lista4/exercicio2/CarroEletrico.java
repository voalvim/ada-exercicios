package lista4.exercicio2;

public class CarroEletrico extends Carro {
    private int autonomiaBateria;
    private int tempoRecarga;

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getTempoRecarga() {
        return tempoRecarga;
    }

    public void setTempoRecarga(int tempoRecarga) {
        this.tempoRecarga = tempoRecarga;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Autonomia da Bateria: " + autonomiaBateria + " km");
        System.out.println("Tempo de Recarga: " + tempoRecarga + " horas");
    }
}