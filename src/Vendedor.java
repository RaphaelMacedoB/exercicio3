public class Vendedor extends Pessoa{

    private static int codigo_vendedor;
    private int id_vendedor;

    Vendedor(String nome, String cpf){
        super(nome, cpf);
        this.codigo_vendedor++;
        this.id_vendedor = codigo_vendedor;
    }
    public int getCodigo_vendedor() {
        return codigo_vendedor;
    }
}
