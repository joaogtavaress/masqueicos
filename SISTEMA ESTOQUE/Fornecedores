import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   
    private String NomeFornecedor;
    private String ProdutoFornecedor;
    private String TelefoneFornecedor;
    private String CNPJFornecedor;
    private int CodigoFornecedor;

    
    static ArrayList<String> Fornecedores = new ArrayList<>();

    public static boolean Verificacao(int OP) {
        return (OP != 1 && OP != 2 && OP != 3 && OP !=4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione a opção desejada!!");
            System.out.println("1 - Cadastrar Fornecedor.");
            System.out.println("2 - Listar Fornecedores.");
            System.out.println("3 - Remover Fornecedor.");
            System.out.println("4 - Sair do Cadastro.");
            int OP = sc.nextInt();
            sc.nextLine();

            if (Verificacao(OP)) {
                System.out.println("Opção inválida! Por favor, selecione uma opção válida (1, 2, 3 ou 4).");
                continue;
            }

            switch (OP) {
                case 1:
                    System.out.println("Digite o nome do Fornecedor:");
                    String NomeFornecedor = sc.nextLine();
                    Fornecedores.add(NomeFornecedor);
                    System.out.println("Digite o produto do fornecedor:");
                    String ProdutoFornecedor = sc.nextLine();
                    Fornecedores.add(ProdutoFornecedor);
                    System.out.println("Digite o telefone do fornecedor:");
                    String TelefoneFornecedor = sc.nextLine();
                    Fornecedores.add(TelefoneFornecedor);
                    System.out.println("Digite o CNPJ do fornecedor:");
                    String CNPJFornecedor = sc.nextLine();
                    Fornecedores.add(CNPJFornecedor);
                    break;
                case 2:
                    System.out.println("Lista de Fornecedores:");
                    for (int i = 0; i < Fornecedores.size(); i += 4) {
                    System.out.println("Fornecedor " + (i / 4 + 1) + ":");
                    System.out.println("Nome: " + Fornecedores.get(i));
                    System.out.println("Produto: " + Fornecedores.get(i + 1));
                    System.out.println("Telefone: " + Fornecedores.get(i + 2));
                    System.out.println("CNPJ: " + Fornecedores.get(i + 3));
                    System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Digite o número do Fornecedor que deseja remover:");
                    int CodigoFornecedor = sc.nextInt();
                    sc.nextLine(); // Consome a nova linha

                    int startIndex = (CodigoFornecedor - 1) * 4;

                    if (startIndex >= 0 && startIndex < Fornecedores.size()) {
                    // Remover os quatro atributos do fornecedor
                    for (int i = 0; i < 4; i++) {
                    Fornecedores.remove(startIndex);
                    }
                    System.out.println("Fornecedor removido com sucesso!");
                    } else {
                    System.out.println("Fornecedor não encontrado!");
                    }
                    break;
                    case 4:
                    System.out.println("Saindo do Cadastro...");
                    sc.close();
                    return;
            }
        }
     }
 }
