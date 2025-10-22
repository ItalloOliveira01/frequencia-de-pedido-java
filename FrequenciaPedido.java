
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FrequenciaPedido{
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de pedidos: ");
        int quantidade = scanner.nextInt();
        int[] pedidos = new int[quantidade];
       
        System.out.println("Digite os códigos dos pedidos: ");
        for (int i = 0; i < quantidade; i++){
            pedidos[i] = scanner.nextInt();
        }
        Map<Integer, Integer > frequencia = new HashMap<>();

        //for(int i = 0; i < pedidos.length; i++)
        for ( int codigo : pedidos){
            frequencia.put(codigo, frequencia.getOrDefault(codigo, 0) + 1);
        }
        int maisPedido = -1;
        int maiorFrequencia = 0;
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() > maiorFrequencia) {
                maisPedido = entry.getKey();
                maiorFrequencia = entry.getValue();
            }
        }
        System.out.println("O item mais pedido é o código: " + maisPedido);
        System.out.println("Quantidade de vezes: " + maiorFrequencia);
        scanner.close();
    }
}