import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int numeroVaga;
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Estaciona Fácil");
        System.out.println("Veja as disponibilidades de nossas vagas");

        Estacionamento estacionamento = new Estacionamento();
        estacionamento.mostrarVagas();
        Scanner scanner = new Scanner(System.in);

        Proprietario p = new Proprietario();

        System.out.println("Infome o seu nome: ");
        String nomeInformado = scanner.nextLine();

        p.setNome(nomeInformado);
        if(!p.contemNumeros(nomeInformado)) {
            System.out.println("Nome registrado: " + p.getNome());
        }
        else if (p.contemNumeros(nomeInformado)){
            for(int tentativas =0; tentativas <3; tentativas++){
                System.out.println("Infome o seu nome: ");
                 nomeInformado = scanner.nextLine();
                p.setNome(nomeInformado);
            }
            System.out.println("Número de tentativas excedido. Reinicie o programa e tente novamente.");
            return;
        }

        Veiculo v = new Veiculo();
        System.out.print("Informe a placa do seu veículo: ");
        String placaInformada = scanner.nextLine();

        v.setPlaca(placaInformada);

        System.out.println("Placa cadastrada: " + v.getPlaca());

        System.out.println("Agora escolha a sua vaga");
        estacionamento.mostrarVagas();
        String vagaEscolhida = scanner.nextLine();
        int numeroVaga = Integer.parseInt(vagaEscolhida);

        estacionamento.ocuparVaga(numeroVaga, placaInformada);

        estacionamento.mostrarVagas();

        scanner.close();


    }
}