import java.util.ArrayList;
import java.util.Scanner;
public class Estoque{
    private String NomeP;
    private String MarcaP;
    private String ValidadeP;
    private String CodP;

    
    public class Cadastro(){
        this.NomeP = NomeP;
        this.MarcaP = MarcaP;
        this.
    }
    
    
    
    
    
    
    
    
    
    ArrayList<String>Produtos = new ArrayList<>();

    
    
    
    
    
    
    
    
    
    
    
    public static boolean Verificacao(int OP) {
        if(OP != 1 && OP != 2 && OP != 3){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Sistema = "on";    
        
        while(Sistema == "on"){
            System.out.println("Selecione a opção desejada!!");
            System.out.println("1 - Cadastrar produtos.");
            System.out.println("2 - Listar produtos.");
            System.out.println("3 - Sair do programa.");
            int OP = sc.nextInt();

            if(Verificacao(OP)){
                System.out.println("Opção inválida! Por favor, selecione uma opção válida (1, 2 ou 3).");
                continue;
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




                    System.out.println("Selecione novamente a opção desejada!!");
                    System.out.println("1 - Cadastrar produtos.");
                    System.out.println("2 - Listar produtos.");
                    System.out.println("3 - Sair do programa.");
                    OP = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Teste!");



                    System.out.println("Selecione novamente a opção desejada!!");
                    System.out.println("1 - Cadastrar produtos.");
                    System.out.println("2 - Listar produtos.");
                    System.out.println("3 - Sair do programa.");
                    OP = sc.nextInt();
                    break;
                case 3:
                    Sistema = "off";
                    break;
            }
        }
        System.out.println("Você saiu do programa! Até mais!!");
    }
}