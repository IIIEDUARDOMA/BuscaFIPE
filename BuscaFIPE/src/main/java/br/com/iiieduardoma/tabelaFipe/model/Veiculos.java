package br.com.iiieduardoma.tabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Veiculos(String Valor,
                       String Marca,
                       String Modelo,
                       String AnoModelo,
                       String Combustivel
                      ) {
    @Override
    public String toString() {
        return String.format("""
                Marca: %s
                Modelo: %s
                Ano do veículo: %s
                Tipo de combustível: %s
                Valor: %s
                """,Marca,Modelo,AnoModelo,Combustivel,Valor);
    }
}
