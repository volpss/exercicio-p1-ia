package br.unibave;

public class Funcionario {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {

        this.nome = nome;

        if (salarioBase < 0) {
            System.out.println("Salário base inválido. Definido como 0.");
            this.salarioBase = 0;

        } else {

            this.salarioBase = salarioBase;
        }
    }

    public double calcularSalarioFinal() {
        return salarioBase;
    }

    public String exibirInformacoes() {
        return "Nome: " + nome + "\nSalário Final: R$" + calcularSalarioFinal();
    }
}