
package contasbancarias;

public class ContaOrdem extends Conta {
    private double saldoMinimo;
    private boolean contaOrdenado;

    public ContaOrdem() {
        super();
        this.saldoMinimo = 0.0;
        this.contaOrdenado = false;
    }

    public ContaOrdem(int numeroConta, String nomeTitular, double saldo, double saldoMinimo, boolean contaOrdenado) {
        super(numeroConta, nomeTitular, saldo);
        this.saldoMinimo = saldoMinimo;
        this.contaOrdenado = contaOrdenado;
    }

    // Métodos de acesso
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public boolean isContaOrdenado() {
        return contaOrdenado;
    }

    public void setContaOrdenado(boolean ordenado) {
        this.contaOrdenado = ordenado;
    }

    // Sobrecarga do método toString()
    @Override
    public String toString() {
        return super.toString() + "\nSaldo Mínimo: " + saldoMinimo + "\nConta Ordenado: " + contaOrdenado;
    }

    // Método para comparar o saldo mínimo de duas contas à ordem
    public String compararSaldoMinimo(ContaOrdem outraConta) {
        if (this.saldoMinimo > outraConta.getSaldoMinimo()) {
            return "Maior";
        } else if (this.saldoMinimo < outraConta.getSaldoMinimo()) {
            return "Menor";
        } else {
            return "Igual";
        }
    }
}