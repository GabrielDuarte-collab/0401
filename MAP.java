import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP {
    
        Map<String, Object> Alimentos = new HashMap<>();

        Alimentos.put("Nome", "Arroz");
        Alimentos.put("Quantidade", 10);
        Alimentos.put("Preço", 32.15);
        Alimentos.put("Categoria", "Alimentos");

        Alimentos.put("Nome", "Café");
        Alimentos.put("Quantidade", 10);
        Alimentos.put("Preço", 27.50);
        Alimentos.put("Categoria", "Alimentos");

        String Nome = (String) Alimentos.get("Nome");
        Integer Quantidade = (Integer) Alimentos.get("Quantidade");
        Double Preço = (Double) Alimentos.get("Preço");

        System.out.println("Nome: " + Nome);
        System.out.println("Qunatidade: " + Quantidade);
        System.out.println("Preço: " + Preço);
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Digite seu produto: ");
    

    sc.close();

    }
}