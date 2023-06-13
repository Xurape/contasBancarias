
package contasbancarias;

public class Conta {
    // variaveis de instancia
    private int numero;
    private String titular;
    private double saldo;

    // variavel da classe
    private static String nomeDoBanco;

    // construtor sem parametros
    public Conta() {
        numero = 0;
        titular = "";
        saldo = 0.0;
        nomeDoBanco = "BCP";
    }

    // construtor com parametros
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        nomeDoBanco = "BCP";
    }
    // metodos de acesso static

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public static void setNomeDoBanco(String nomeDoBanco) {
        Conta.nomeDoBanco = nomeDoBanco;
    }
    // metodo de sobercarga da toString

    @Override
    public String toString() {
        return "" + numero + ", " + titular + ", " + saldo + "\n";
    }

    public void print() {
        System.out.println("numero  : " + numero);
        System.out.println("titular : " + titular);
        System.out.println("saldo   : " + saldo);
    }

}
