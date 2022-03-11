import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Veiculo> veiculo_revenda = new ArrayList<>();
        veiculo_revenda.add(new Veiculo("v1","SUV",30000));
        veiculo_revenda.add(new Veiculo("v2","SUV",40000));

        Revenda revenda = new Revenda(veiculo_revenda);
        List<Veiculo> veiculo_raphael = new ArrayList<>();
        veiculo_raphael.add(new Veiculo("hb20","hatch",50000));
        veiculo_raphael.add(new Veiculo("608","caminhao",100000));

        Cliente  c1 = new Cliente("Raphael","14160546587",veiculo_raphael);
        Cliente  c2 = new Cliente("Lucas","13156489587", new ArrayList<Veiculo>());
        Vendedor vd1 = new Vendedor("Jeferson", "cpf");
        Vendedor vd2 = new Vendedor("Luiz", "14151423548");


        vd1.vender(c1, veiculo_raphael.get(0));
    }
}