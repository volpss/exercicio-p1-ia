package br.unibave;

public class Vendedor extends Funcionario {

    private double comissaoPorVenda;
    private int quantidadeVendas;

    public Vendedor(String nome, double salarioBase, double comissaoPorVenda, int quantidadeVendas) {
        super(nome, salarioBase);

        if (comissaoPorVenda < 0) {

            System.out.println("Comissão inválida. Definido como 0.");
            this.comissaoPorVenda = 0;

        } else {

            this.comissaoPorVenda = comissaoPorVenda;
        }

        if (quantidadeVendas < 0) {

            System.out.println("Quantidade de vendas inválida. Definido como 0.");
            this.quantidadeVendas = 0;

        } else {

            this.quantidadeVendas = quantidadeVendas;
        }
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + (comissaoPorVenda * quantidadeVendas);
    }

    @Override
    public String exibirInformacoes() {
        return "Nome: " + nome + "\nSalário Final: R$" + calcularSalarioFinal();
    }
}