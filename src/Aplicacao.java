import Entidades.Aluguel;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;
import Entidades.Veiculo;
import Enums.TipoVeiculo;
import Interfaces.Cliente;

public class Aplicacao {
    public static void main(String[] args) {

        // Veículos para teste
        Veiculo veiculo1 = new Veiculo("NAX7600", TipoVeiculo.PEQUENO);
        Veiculo veiculo2 = new Veiculo("JVQ2356", TipoVeiculo.MEDIO);
        Veiculo veiculo3 = new Veiculo("HTH2387", TipoVeiculo.SUV);

        // Clientes para teste
        Cliente cliente1 = new PessoaFisica("317.603.143-23", "Emily Isabella Ramos");
        Cliente cliente2 = new PessoaJuridica("37.755.541/0001-30", "Tânia e Bruno Assessoria Jurídica ME");

        // TESTE

        // Dados entrada
        Cliente cliente = cliente1;
        Veiculo veiculo = veiculo1;
        int numeroDiarias = 6;

        // Execução
        Aluguel locacao = new Aluguel(veiculo, cliente, numeroDiarias);
        locacao.calcularValorFinal();

    }
}
