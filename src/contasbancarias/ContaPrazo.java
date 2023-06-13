
package contasbancarias;

public class ContaPrazo extends Conta {
    // variaveis de instancia
    private int dias;
    private double juros;

    // constrtor sem parametros
    public ContaPrazo() {
        dias = 0;
        juros = 0.0;
    }

    // construtor com parametros
    public ContaPrazo(int dias, double juros, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.dias = 0;
        this.juros = 0.0;
    }

    // metodos de acesso static
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    // sobrecarga do metodo toString
    @Override
    public String toString() {
        return "" + dias + "," + juros + "\n";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Dias : " + dias);
        System.out.println("Juros: " + juros);
    }
    // public boolean sameJuros (ContaPrazo A2){
    // return juros.equals(A2.juros);
    // }

}
