import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Object> Alimentos = new HashMap<>();

        System.out.println("Digite seu produto: ");
        produto = sc.nextLine();
        

        Alimentos.put("Nome", "Arroz");
        Alimentos.put("Quantidade", 10);
        Alimentos.put("Preço", 32.15);
        Alimentos.put("Categoria", "Alimentos");

        String Nome = (String) Alimentos.get("Nome");
        Integer Quantidade = (Integer) Alimentos.get("Quantidade");
        Double Preço = (Double) Alimentos.get("Preço");

        System.out.println("Nome: " + Nome);
        System.out.println("Qunatidade: " +   Quantidade);
        System.out.println("Preço: " + Preço);

        sc.close();

    }
}