package br.com.dio.desafio.locadoraDeVeiculos;

import java.time.LocalDate;

public class Carro extends Veiculo{

    private static final double VALOR_SEGURO_CARRO = 25d;

    private int portas;

    public Carro() {}

    @Override
    public double calcularValorAlocacao() {

        double valorPorQuantidadeDePortas = 0d;

        switch (this.portas){
            case 2:
                valorPorQuantidadeDePortas = 15d;
                break;

            case 4:
                valorPorQuantidadeDePortas = 30d;
                break;
        }

        return (VALOR_INICIAL + VALOR_SEGURO_CARRO) + valorPorQuantidadeDePortas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return " Carro --- " +
                " Modelo= " + getModelo() +
                " Placa= " + getPlaca() +
                " Ano= " + getAno() +
                " Portas= " + portas +
                " Capacidade de pessoas= " + getCapacidade() + "\n";
    }
}
