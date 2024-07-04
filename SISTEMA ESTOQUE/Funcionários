import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int proximoCodigo = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Cadastrar Funcionarios");
            System.out.println("2 - Listar Funcionarios");
            System.out.println("3 - Excluir Funcionarios pelo Código");
            System.out.println("4 - Sair do Cadastro");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do Funcionario:");
                    String nome = sc.nextLine();
                    System.out.println("Digite a idade do Funcionario:");
                    String idade = sc.nextLine();
                    System.out.println("Digite o telefone do Funcionario:");
                    String telefone = sc.nextLine();
                    System.out.println("Digite o CPF do Funcionario:");
                    String cpf = sc.nextLine();

                    String funcionarioInfo = "Código: " + proximoCodigo + "\n" +
                            "Nome: " + nome + "\n" +
                            "Idade: " + idade + "\n" +
                            "Telefone: " + telefone + "\n" +
                            "CPF: " + cpf;
                    funcionarios.add(funcionarioInfo);
                    System.out.println("Funcionario cadastrado com sucesso!");
                    proximoCodigo++;
                    break;
                case 2:
                    System.out.println("Lista de Funcionarios:");
                    for (String funcionario : funcionarios) {
                        System.out.println(funcionario);
                        System.out.println(); // Linha em branco para separar os funcionarios
                    }
                    break;
                case 3:
                    System.out.println("Digite o código do funcionarios a ser excluído:");
                    int codigoExcluir = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha
                    if (codigoExcluir >= 1 && codigoExcluir <= funcionarios.size()) {
                        funcionarios.remove(codigoExcluir - 1);
                        System.out.println("Funcionario removido com sucesso!");
                    } else {
                        System.out.println("Código inválido! Nenhum Funcionario encontrado com esse código.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, selecione uma opção válida (1, 2, 3 ou 4).");
            }
        }
    }
}
