
package contasbancarias;

public class ContaPrazo extends Conta {
    private int prazo;
    private double taxaJuro;

    public ContaPrazo() {
        super();
        this.prazo = 0;
        this.taxaJuro = 0.0;
    }

    public ContaPrazo(int numeroConta, String nomeTitular, double saldo, int prazo, double taxaJuro) {
        super(numeroConta, nomeTitular, saldo);
        this.prazo = prazo;
        this.taxaJuro = taxaJuro;
    }

    // Métodos de acesso
    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public double getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }
    
    // Sobrecarga do método toString()
    @Override
    public String toString() {
        return super.toString() + "\nPrazo: " + prazo + " dias" + "\nTaxa de Juro: " + taxaJuro;
    }

    // Método para verificar se duas contas a prazo possuem a mesma taxa
    public boolean mesmaTaxa(ContaPrazo outraConta) {
        return this.taxaJuro == outraConta.getTaxaJuro();
    }
}
