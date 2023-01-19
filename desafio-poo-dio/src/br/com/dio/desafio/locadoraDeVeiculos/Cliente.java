package br.com.dio.desafio.locadoraDeVeiculos;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Cliente {

     private String nome;

     private int diasAluguel;
     private Set<Veiculo> veiculosAlugado = new LinkedHashSet<>();
     private Set<Veiculo> veiculosEntregues = new LinkedHashSet<>();

     public void alugarVeiculo(Locadora locadora, Veiculo veiculo){
          this.veiculosAlugado.add(veiculo);
          locadora.alugarVeiculos(veiculosAlugado);
     }

     public void entregarVeiculo(Locadora locadora){
          Optional<Veiculo> veiculo = this.veiculosAlugado.stream().findFirst();

          if(veiculo.isPresent()) {
               locadora.setVeiculos(veiculo.get());
               this.veiculosAlugado.remove(veiculo.get());
          }
     }

     public double calculaTotalAlugueis(){
          double valorTotal = veiculosAlugado.stream().mapToDouble(Veiculo::calcularValorAlocacao).sum();
          return valorTotal * getDiasAluguel();
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public int getDiasAluguel() {
          return diasAluguel;
     }

     public void setDiasAluguel(int diasAluguel) {
          this.diasAluguel = diasAluguel;
     }

     public Set<Veiculo> getVeiculosAlugado() {
          return veiculosAlugado;
     }

     public void setVeiculosAlugado(Set<Veiculo> veiculosAlugado) {
          this.veiculosAlugado = veiculosAlugado;
     }

     public Set<Veiculo> getVeiculosEntregues() {
          return veiculosEntregues;
     }

     public void setVeiculosEntregues(Set<Veiculo> veiculosEntregues) {
          this.veiculosEntregues = veiculosEntregues;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Cliente cliente = (Cliente) o;
          return Objects.equals(nome, cliente.nome) && Objects.equals(veiculosAlugado, cliente.veiculosAlugado) && Objects.equals(veiculosEntregues, cliente.veiculosEntregues);
     }

     @Override
     public int hashCode() {
          return Objects.hash(nome, veiculosAlugado, veiculosEntregues);
     }
}
