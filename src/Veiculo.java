import java.util.Random;

public class Veiculo {
    private String nome;
    private String modelo;
    private double preco;
    private int codigo;

    Veiculo(String nome, String modelo, double preco){
        this.setNome(nome);
        this.setModelo(modelo);
        this.setPreco(preco);
        this.setCodigo(codigo);
    }

    Veiculo(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDados(){
        return String.format("Nome: %2s\nModelo: %2s\nPreço: %2.2f\nCódigo: %d\n\n",nome,modelo,preco,codigo);
    }

    public void printDados(){
        System.out.printf("Nome: %2s\nModelo: %2s\nPreço: %2.2f\nCódigo: %d\n\n",nome,modelo,preco,codigo);
    }

    public void setCodigo(int codigo){
        Random random = new Random();
        this.codigo = random.nextInt(1000);
    }
    
}