package br.com.dio.desafio.locadoraDeVeiculos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Locadora {

    private String nome;
    private String descricao;
    private int quantidadeDias = 1;
    private LocalDate dataAlocacao = LocalDate.now();
    private LocalDate dataEntrega = dataAlocacao.plusDays(quantidadeDias);

    private Set<Cliente> clientes = new HashSet<>();
    private Set<Veiculo> veiculos = new LinkedHashSet();

    public void alugarVeiculos(Set<Veiculo> veiculo) {
        for(Veiculo v: veiculo) {
            veiculos.remove(v);
        }
    }

    public void setVeiculos(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public long totalDias() {
        return ChronoUnit.DAYS.between(dataAlocacao, dataEntrega);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataAlocacao() {
        return dataAlocacao;
    }

    public void setDataAlocacao(LocalDate dataAlocacao) {
        this.dataAlocacao = dataAlocacao;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locadora locadora = (Locadora) o;
        return Objects.equals(nome, locadora.nome) && Objects.equals(descricao, locadora.descricao) && Objects.equals(dataAlocacao, locadora.dataAlocacao) && Objects.equals(dataEntrega, locadora.dataEntrega) && Objects.equals(clientes, locadora.clientes) && Objects.equals(veiculos, locadora.veiculos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataAlocacao, dataEntrega, clientes, veiculos);
    }
}
