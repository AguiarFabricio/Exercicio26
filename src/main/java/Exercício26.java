import javax.swing.JOptionPane;
public class Exercício26 {
    public static void main(String[] args) {
        int qtde = 5;
        int[] vetor = new int[qtde];

        // Leitura dos números/Entrada
        for (int i = 0; i < qtde; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: " + (i + 1)));
        }

        // Ordenação do vetor (usando o método de ordenação por troca)/Processamento
        for (int i = 0; i < qtde - 1; i++) {
            for (int j = i + 1; j < qtde; j++) {
                if (vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        // Exibindo o vetor ordenado/Saída
        for (int i = 0; i < qtde; i++) {
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }
    }
}
