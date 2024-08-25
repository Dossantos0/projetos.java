public class main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("resultado de operação de soma:" + calculadora.soma(10, 10));
        System.out.println("resultado de operação de subtração:" + calculadora.subtracao(20, 4));
        System.out.println("resultado de operação de multiplicação:" + calculadora.multiplicacao(4, 8));
        System.out.println("resultado de operação de divisão:" + calculadora.divisao(20, 5));
    }

}