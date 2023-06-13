
package contasbancarias;

public class Banco {

    public static void main(String[] args) {
        ContaPrazo A1 = new ContaPrazo();
        ContaPrazo A2 = new ContaPrazo();

        A1.setDias(365);
        A1.setJuros(0.1);

        A2.setDias(420);
        A2.setJuros(0.5);

        ContaOrdem B1 = new ContaOrdem();
        ContaOrdem B2 = new ContaOrdem();

        B1.setOrdenado(1000);
        B1.setSaldoMinimo(50);

        B2.setOrdenado(1500);
        B2.setSaldoMinimo(20);

        A1.print();
        A2.print();
        if (A1 == A2)
            System.out.println("Possui a mesma taxa");
        else
            System.out.println("Não possui a mesma taxa");

        // System.out.print(A);
        // System.out.println (B);

    }

}
