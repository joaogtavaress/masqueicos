import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String Sistema = "on";    
        Estoque estoque = new Estoque();
        
        while(Sistema == "on"){
            System.out.println("Selecione a opção desejada!!");
            System.out.println("1 - Cadastrar produtos.");
            System.out.println("2 - Listar produtos.");
            System.out.println("3 - Sair do programa.");
            int OP = sc.nextInt();
    
            if(Estoque.Verificacao(OP)){
                System.out.println("Opção inválida! Por favor, selecione uma opção válida (1, 2 ou 3).");
                continue;
            }
    
            if(OP == 3){
                break;
            }
    
            switch (OP) {
                case 1:
                    System.out.println("- CADASTRANDO PRODUTOS -");
                    System.out.println("Digite o nome do produto: ");
                    String NomeP = sc.next();
                    System.out.println("Digite a marca do produto!");
                    String MarcaP = sc.next();
                    System.out.println("Digite a validade do produto!");
                    String ValidadeP = sc.next();
                    System.out.println("Digite o código do produto!");
                    String CodP = sc.next();
                    String Cadastro = estoque.Cadastro(NomeP, MarcaP, ValidadeP, CodP);
                    System.out.println("");
                    System.out.println("----------------------------------------");
                    System.out.println(Cadastro);
                    System.out.println("----------------------------------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("----------------------------------------");
                    System.out.println("Produtos Cadastrados.");
                    System.out.println("----------------------------------------");
                    System.out.println("");
                    estoque.ListarProd();
                    break;
            }
        }
        System.out.println("Você saiu do programa! Até mais!!");
    }
}
