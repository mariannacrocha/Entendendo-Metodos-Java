package com.company;

public class Main {

    public static void main(String[] args) {

        //Classe Calculadora - chamada dos métodos
        System.out.println("Exercício Calculadora");
        Calculadora.soma(2,4);
        Calculadora.subtracao(5,8);
        Calculadora.multiplicacao(10,7);
        Calculadora.divisao(5,3);

        //Classe Mensagem - chamada dos métodos
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(4);
        Mensagem.obterMensagem(21);

        //Classe Empréstimo - chamada de métodos
        System.out.println("Exercício Empréstimo");
        Emprestimo.calculaValorEmprestimo(3500, Emprestimo.getDuasParcelas());
        Emprestimo.calculaValorEmprestimo(240, Emprestimo.getTresParcelas());

        //Classe Quadriláteros
        System.out.println("Exercício Quadriláteros");
        Quadrilateros.calculaArea(5);
        Quadrilateros.calculaArea(4,2);
        Quadrilateros.calculaArea(7,8,9);

    }
}
