package com.SGP.modelos;  // Declaração do pacote

public class Carro {
    
    private String marca;  // Atributo privado, acessível somente dentro da classe Pessoa
    private String modelo;  // Atributo privado, acessível somente dentro da classe Pessoa
    private int ano;

    // Construtor que recebe marca e modelo como parâmetros
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Construtor sobrecarregado que recebe apenas o marca
    // Inicializa com valores padrão: marca="Carlos" e modelo=20
    public Carro() {
        this.marca = "Ferrari";
        this.modelo = "F8 Tributo 3.9 V8";
        this.ano = 2021;
    }

    // Método que exibe uma mensagem de saudação com o marca e modelo da pessoa
    public void saudacao() {
        System.out.println("Olá, seu carro é da " + marca + "do modelo" + modelo + ano + ".");
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados
    
    // Retorna o marca da pesso
    public String getMarca() {
        return marca;
    }

    // Retorna a modelo da pessoa
    public String getmodelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Define um novo marca para a pessoa
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Define uma nova modelo para a pessoa
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
    }
}
