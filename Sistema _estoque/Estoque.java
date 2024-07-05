import java.util.ArrayList;
public class Estoque{
    private String NomeP;
    private String MarcaP;
    private String ValidadeP;
    private String CodP;
    ArrayList<String> Produtos = new ArrayList<>();

    public String Cadastro(String NomeP, String MarcaP, String ValidadeP, String CodP){
        this.NomeP = NomeP;
        this.MarcaP = MarcaP;
        this.ValidadeP = ValidadeP;
        this.CodP = CodP;
        String novoProduto = "Nome: " + NomeP + ", Marca: " + MarcaP + ", Validade: " + ValidadeP + ", Código: " + CodP;
        Produtos.add(novoProduto);
        return "Produto cadastrado com sucesso!";
    }

    public void ListarProd() {
        System.out.println("Lista de Produtos:");
        for (String produto : Produtos) {
            System.out.println(produto);
        }
    }
    

    


    public static boolean Verificacao(int OP) {
        if(OP != 1 && OP != 2 && OP != 3){
            return true;
        }else{
            return false;
        }
    }
}