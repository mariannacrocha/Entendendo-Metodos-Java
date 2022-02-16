package com.company;

public class Emprestimo {

    //calcular valor final de emprestimo a partir do valor solicitado (digitado).Taxas e parcelas influenciam.
    //Defina arbitrariarmente as faixas que influenciam nos valores

    //definir parcelas e taxas

    public int duasParcelas;
    public int tresParcelas;
    public double taxaDuasParcelas;
    public double taxaTresParcelas;


    public static int getDuasParcelas() {
        return 2;
    }

    public void setDuasParcelas(int duasParcelas) {
        this.duasParcelas = duasParcelas;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public void setTresParcelas(int tresParcelas) {
        this.tresParcelas = tresParcelas;
    }

    public static double getTaxaDuasParcelas() {
        return 0.2;
    }

    public void setTaxaDuasParcelas(double taxaDuasParcelas) {
        this.taxaDuasParcelas = taxaDuasParcelas;
    }

    public  static double getTaxaTresParcelas() {
        return 0.3;
    }

    public void setTaxaTresParcelas(double taxaTresParcelas) {
        this.taxaTresParcelas = taxaTresParcelas;
    }

    public static void calculaValorEmprestimo (double valor, int parcelas) {

        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println ("O valor final do empréstimo para duas parcelas é R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println ("O valor final do empréstimo para três parcelas é R$ " + valorFinal);
        } else {
            System.out.println ("Número de parcelas inválido");

        }

    }
}
