
package contasbancarias;

public class Banco {
    public static void main(String[] args) {
        // Criando objetos com construtores sem parâmetros
        Conta conta1 = new Conta();
        ContaPrazo contaPrazo1 = new ContaPrazo();
        ContaOrdem contaOrdem1 = new ContaOrdem();

        // Criando objetos com construtores com parâmetros
        Conta conta2 = new Conta(1, "João", 1000.0);
        ContaPrazo contaPrazo2 = new ContaPrazo(2, "Maria", 5000.0, 30, 0.05);
        ContaOrdem contaOrdem2 = new ContaOrdem(3, "Carlos", 2000.0, 1000.0, true);

        // Alterando atributos dos objetos criados com construtores sem parâmetros usando métodos de acesso
        conta1.setNumero(4);
        conta1.setTitular("Ana");
        conta1.setSaldo(1500.0);

        contaPrazo1.setNumero(5);
        contaPrazo1.setTitular("Pedro");
        contaPrazo1.setSaldo(3000.0);
        contaPrazo1.setPrazo(60);
        contaPrazo1.setTaxaJuro(0.03);

        contaOrdem1.setNumero(6);
        contaOrdem1.setTitular("Sara");
        contaOrdem1.setSaldo(2500.0);
        contaOrdem1.setSaldoMinimo(500.0);
        contaOrdem1.setContaOrdenado(false);

        // Imprimindo objetos usando o método criado para esse efeito
        conta1.imprimirConta();
        System.out.println();
        contaPrazo1.imprimirConta();
        System.out.println();
        contaOrdem1.imprimirConta();
        System.out.println();

        // Imprimindo objetos usando a instrução System.out.println( referencia_do_objeto )
        System.out.println(conta2);
        System.out.println(contaPrazo2);
        System.out.println(contaOrdem2);
        System.out.println();

        // Verificando se duas contas a prazo possuem a mesma taxa
        System.out.println("Contas a prazo possuem a mesma taxa? " + contaPrazo1.mesmaTaxa(contaPrazo2));
        System.out.println();

        // Comparando os saldos mínimos de duas contas à ordem
        System.out.println("Saldo mínimo das contas à ordem: " + contaOrdem1.compararSaldoMinimo(contaOrdem2));
    }
}