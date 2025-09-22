import jdk.jfr.Enabled;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.Scanner;

public class Estacionamento {
    Proprietario proprietario = new Proprietario();
    public String [] vagasDisponiveis = new String [10];

    public void mostrarVagas() {
        for (int vagaInicial = 0; vagaInicial < vagasDisponiveis.length; vagaInicial++) {
            if(vagasDisponiveis[vagaInicial] == null) {
                System.out.println("Vaga " + vagaInicial + " está live");
            }
            else {
                System.out.println("Vaga " + vagaInicial + " está ocupada");
            }
        }
    }

    public void ocuparVaga(int posicao, String placa) {
        if(vagasDisponiveis[posicao] == null) {
            vagasDisponiveis[posicao] = placa;
            System.out.println("Veículo estacionado na vaga: " + posicao + ". Placa: " + placa);
        }
        else if (vagasDisponiveis[posicao] != null){
            System.out.println("Vaga já está ocupada!");
        }
    }


//    private List<Veiculo> placas = new ArrayList<>();
//
//    public void cadastrarNome(Scanner scanner) {
//        int numeroTentativas = 3;
//        int i = 0;
//
//        System.out.println("Informe o seu nome: ");
//        String leitor = scanner.nextLine();
//
//        while (leitor.length() != 7 && i < numeroTentativas) {
//            System.out.println("Entrada inválida. A placa deve ter 7 caracteres.");
//            System.out.println("Informe a placa do veículo: ");
//            leitor = scanner.nextLine();
//            i++;
//        }
//
//        if (leitor.length() == 7) {
//    //            placas.add(leitor);
//            System.out.println("Placa cadastrada com sucesso!");
//        } else {
//            System.out.println("Número de tentativas excedido.");
//        }
//    }



//    public void cadastrarPlaca(Scanner scanner) {
//        int numeroTentativas = 3;
//        int i = 0;
//
//        System.out.println("Informe a placa do veículo: ");
//        String leitor = scanner.nextLine();
//
//        while (leitor.length() != 7 && i < numeroTentativas - 1) {
//            System.out.println("Entrada inválida. A placa deve ter 7 caracteres.");
//            System.out.println("Informe a placa do veículo: ");
//            leitor = scanner.nextLine();
//            i++;
//        }
//
//        if (leitor.length() == 7) {
////            placas.add(leitor);
//            System.out.println("Placa cadastrada com sucesso!");
//        } else {
//            System.out.println("Número de tentativas excedido.");
//        }
//    }
}
