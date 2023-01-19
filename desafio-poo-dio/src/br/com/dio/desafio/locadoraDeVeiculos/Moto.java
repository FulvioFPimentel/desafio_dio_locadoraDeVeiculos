package br.com.dio.desafio.locadoraDeVeiculos;

import java.time.LocalDate;

public class Moto extends Veiculo{

    private static final double VALOR_SEGURO_MOTO = 15d;
    private int cilindradas;

    public Moto (){}

    @Override
    public double calcularValorAlocacao() {
        double valorPorPotencia = 0d;

        if(this.cilindradas < 500) {
            valorPorPotencia = 10d;
        }else if(this.cilindradas >= 500 && this.cilindradas < 900){
            valorPorPotencia = 20;
        }else{
            valorPorPotencia = 35;
        }

        return (VALOR_INICIAL + VALOR_SEGURO_MOTO) + valorPorPotencia;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return " Moto --- " +
                " Modelo= " + getModelo() +
                " Placa= " + getPlaca() +
                " Ano= " + getAno() +
                " Cilindradas= " + cilindradas +
                " Capacidade de pessoas= " + getCapacidade()  + "\n";
    }
}
