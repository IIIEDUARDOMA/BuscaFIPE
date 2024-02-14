package br.com.iiieduardoma.tabelaFipe.main;

import br.com.iiieduardoma.tabelaFipe.model.Dados;
import br.com.iiieduardoma.tabelaFipe.model.Modelos;
import br.com.iiieduardoma.tabelaFipe.model.Veiculos;
import br.com.iiieduardoma.tabelaFipe.service.ConsumoAPI;
import br.com.iiieduardoma.tabelaFipe.service.ConverteDados;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    private Scanner scanner = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();
    private String endereco;
    public void exibeMenu(){
        System.out.println("""
                
                
                Bem vindo ao Busca FIPE!
                
                ***********| OPÇÕES |***********
                Carros
                Motos
                Caminhoes
                ********************************
                
                Digite o tipo de veículo que deseja buscar:
               """);

        var tipo = scanner.nextLine();
        if (tipo.toLowerCase().contains("car")){
            endereco = URL_BASE + "carros/marcas/";
        } else if (tipo.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas/";
        } else {
            endereco = URL_BASE + "caminhoes/marcas/";
        }
        var json =consumo.obterDados(endereco);
        System.out.println(json);

        var marcas = conversor.obterLista(json, Dados.class);

        marcas.stream()
                .sorted(Comparator.comparing(Dados::codigo))
                        .forEach(System.out::println);

        System.out.println("Digite o código da marca do veicúlo: ");

        var codMarca = scanner.nextLine();
        endereco = endereco + codMarca + "/modelos/";
        json = consumo.obterDados(endereco);
        var modelosLista = conversor.obterDados(json, Modelos.class);

        System.out.println("\nModelos de veículos dessa marca: ");
        modelosLista.modelos().stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        System.out.println("\nDigite o modelo do veículo que busca: ");
        var buscaModelo = scanner.nextLine();
        modelosLista.modelos().stream()
                .filter(m -> m.nome().toLowerCase().contains(buscaModelo.toLowerCase()))
                .forEach(System.out::println);


        System.out.println("\nDigite o código do veículo desejado:");
        var codVeiculo = scanner.nextLine();
        endereco = endereco + codVeiculo + "/anos/";
        json = consumo.obterDados(endereco);
        List<Dados> anos = conversor.obterLista(json, Dados.class);
        List<Veiculos> veiculos = new ArrayList<>();

        for (int i = 0; i < anos.size(); i++) {
            var enderecoAnos = endereco + anos.get(i).codigo();
            json = consumo.obterDados(enderecoAnos);
            Veiculos veiculo = conversor.obterDados(json, Veiculos.class);

            veiculos.add(veiculo);
        }

        veiculos.forEach(System.out::println);



    }
}
