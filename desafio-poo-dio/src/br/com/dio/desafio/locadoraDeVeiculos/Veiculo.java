package br.com.dio.desafio.locadoraDeVeiculos;

public abstract class Veiculo {

    protected static final double VALOR_INICIAL = 30d;
    private String modelo;
    private String placa;
    private int ano;
    private int capacidade;

    public abstract double calcularValorAlocacao();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
