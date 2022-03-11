import java.util.List;

public class Cliente extends Pessoa{
    private static int codigo_cliente = 0;
    private int id_cliente = 0;

    private List<Veiculo> listVeiculos;

    Cliente(String nome, String cpf, List<Veiculo> listVeiculos){
        super(nome, cpf);
        this.codigo_cliente++;
        this.id_cliente = codigo_cliente;
        this.listVeiculos = listVeiculos;
    }

    public int getCodigo_cliente() {
        return id_cliente;
    }

    public void listarVeiculos(){
        for (Veiculo veiculo : listVeiculos) {
            veiculo.getDados();
        }
    }

    public List<Veiculo> getListVeiculos() {
        return listVeiculos;
    }

    public void setListVeiculos(List<Veiculo> listVeiculos) {
        this.listVeiculos = listVeiculos;
    }

    
}