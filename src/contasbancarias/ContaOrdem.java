
package contasbancarias;

public class ContaOrdem extends Conta {
    private double saldoMinimo;
    private double ordenado;

    // construtor sem parametros
    public ContaOrdem() {
        saldoMinimo = 0;
        ordenado = 0;
    }

    // construtor com parametros
    public ContaOrdem(double saldoMinimo, double ordenado, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.saldoMinimo = saldoMinimo;
        this.ordenado = ordenado;
    }

    // metodos de acesso static

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;

    }

    public double getOrdenado() {
        return ordenado;
    }

    public void setOrdenado(double ordenado) {
        this.ordenado = ordenado;
    }

    // Sobercarga do metodo toString
    @Override
    public String toString() {
        return "" + saldoMinimo + "," + ordenado + "\n";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("SaldoMinimo : " + saldoMinimo);
        System.out.println("Ordenado    : " + ordenado);
    }
    // public void comparaSaldoMinimo(saldoMinimo >= saldoMinimo){
    // return saldoMinimo;
    // }
}
