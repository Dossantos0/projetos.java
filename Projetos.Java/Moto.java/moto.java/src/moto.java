public class moto {
    String marca="Harley-Davidson";
    String modelo="Fat Boy";
    int ano=2024;
    String cor="preto";
    double preco=100000.00;
    public String obterMarca() {
        return marca;
    }

    public String obterModelo() {
        return modelo;
    }

    public int obterAno() {
        return ano;
    }

    public String obterCor() {
        return cor;
    }

    public double obterPreco() {
        return preco;
    }
    public void exibirInformacoes() {
        System.out.println("Marca: " + obterMarca());
        System.out.println("Modelo: " + obterModelo());
        System.out.println("Ano: " + obterAno());
        System.out.println("Cor: " + obterCor());
        System.out.println("Preço: R$ " + obterPreco());
    }

}
