
package contasbancarias;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    private static String nomeDoBanco;

    public Conta() {
        this.numeroConta = 0;
        this.nomeTitular = null;
        this.saldo = 0.0;
        nomeDoBanco = "BCP";
    }

    public Conta(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numeroConta;
    }

    public void setNumero(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getTitular() {
        return nomeTitular;
    }

    public void setTitular(String titular) {
        this.nomeTitular = titular;
    }

    // Métodos de acesso
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para imprimir um objeto
    public void imprimirConta() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
    }

    public static String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public static void setNomeDoBanco(String nomeDoBanco) {
        Conta.nomeDoBanco = nomeDoBanco;
    }

    // Sobrecarga do método toString()
    @Override
    public String toString() {
        return "Número da conta: " + numeroConta + "\nNome do titular: " + nomeTitular + "\nSaldo: " + saldo;
    }
}