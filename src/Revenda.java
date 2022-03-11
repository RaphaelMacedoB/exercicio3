import java.util.List;
import java.io.*;
public class Revenda {

    private List<Veiculo> listVeiculos;

    Revenda(List<Veiculo> listVeiculos){
        this.listVeiculos = listVeiculos;
    }

    public static void vender(Pessoa vendedor, Pessoa comprador, Veiculo veiculo) {

        FileWriter arq = null;
        
        try {
            
            arq = new FileWriter("venda.txt");
            BufferedWriter gravarArq = new BufferedWriter(arq);
            String format = "Vendedor: %-13s\nComprador: %-13s\nVeiculo: %s";
            String dados = String.format(format,vendedor.getNome(),comprador.getNome(),veiculo.getDados());
            gravarArq.write(dados);
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                arq.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
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