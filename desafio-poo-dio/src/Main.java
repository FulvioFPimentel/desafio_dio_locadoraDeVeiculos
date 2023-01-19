import br.com.dio.desafio.locadoraDeVeiculos.Carro;
import br.com.dio.desafio.locadoraDeVeiculos.Cliente;
import br.com.dio.desafio.locadoraDeVeiculos.Locadora;
import br.com.dio.desafio.locadoraDeVeiculos.Moto;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setModelo("GOl 1.0");
        carro1.setPlaca("RFK5842");
        carro1.setAno(2011);
        carro1.setCapacidade(5);
        carro1.setPortas(2);

        Carro carro2 = new Carro();
        carro2.setModelo("Polo 1.6");
        carro2.setPlaca("EGP5157");
        carro2.setAno(2018);
        carro2.setCapacidade(5);
        carro2.setPortas(4);

        Carro carro3 = new Carro();
        carro3.setModelo("I30 MI");
        carro3.setPlaca("RSD6352");
        carro3.setAno(2020);
        carro3.setCapacidade(5);
        carro3.setPortas(4);
        ;

        Moto moto1 = new Moto();
        moto1.setModelo("CG 160");
        moto1.setPlaca("R5F6878");
        moto1.setAno(2020);
        moto1.setCapacidade(2);
        moto1.setCilindradas(160);

        Moto moto2 = new Moto();
        moto2.setModelo("CB 500");
        moto2.setPlaca("T7O5457");
        moto2.setAno(2012);
        moto2.setCapacidade(2);
        moto2.setCilindradas(500);

        Moto moto3 = new Moto();
        moto3.setModelo("Suzuki Hayabusa");
        moto3.setPlaca("H5F5742");
        moto3.setAno(2010);
        moto3.setCapacidade(2);
        moto3.setCilindradas(1300);

        Locadora locadora = new Locadora();
        locadora.setNome("Auto Motores");
        locadora.setDescricao("Alugueis de Carros e motos");
        locadora.getVeiculos().add(carro1);
        locadora.getVeiculos().add(carro2);
        locadora.getVeiculos().add(carro3);
        locadora.getVeiculos().add(moto1);
        locadora.getVeiculos().add(moto2);
        locadora.getVeiculos().add(moto3);

        System.out.print("\nTODOS OS VEICULOS DISPONIVEIS \n");
        System.out.print(locadora.getVeiculos());
        System.out.println("\n");

        Cliente cliFulvio = new Cliente();
        cliFulvio.setNome("Fulvio Pimentel");
        locadora.getClientes().add(cliFulvio);

        cliFulvio.alugarVeiculo(locadora, moto1);
        cliFulvio.alugarVeiculo(locadora, carro1);
        cliFulvio.setDiasAluguel(7);

        System.out.print("\nVEICULOS ALUGADO POR " + cliFulvio.getNome() + " PARA " + cliFulvio.getDiasAluguel() + " DIAS \n");
        System.out.println(cliFulvio.getVeiculosAlugado());

        System.out.print("\nVALOR TOTAL DO ALUGUEL: \n");
        System.out.println(cliFulvio.calculaTotalAlugueis());


        System.out.print("\nTODOS OS VEICULOS DISPONIVEIS \n");
        System.out.print(locadora.getVeiculos());


        Cliente cliCarol = new Cliente();
        cliCarol.setNome("Carol de Brito");
        locadora.getClientes().add(cliCarol);

        cliCarol.alugarVeiculo(locadora, moto3);
        cliCarol.setDiasAluguel(10);

        System.out.print("\nVEICULOS ALUGADO POR " + cliCarol.getNome() + " PARA " + cliCarol.getDiasAluguel() + " DIAS \n");
        System.out.println(cliCarol.getVeiculosAlugado());

        System.out.print("\nVALOR TOTAL DO ALUGUEL: \n");
        System.out.println(cliCarol.calculaTotalAlugueis());

        System.out.print("\nTODOS OS VEICULOS DISPONIVEIS \n");
        System.out.print(locadora.getVeiculos());


    }

}
