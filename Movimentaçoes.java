import javax.swing.*;
public class Movimentaçoes {

    public class Movimentacoes {

        static int[][] historicoMov = new int[10][2];

        public static void registrarCompraMov(int codigo, int quantidade) {
            historicoMov[codigo][0] += quantidade;
        }


        public static void registrarVendaMov(int codigo, int quantidade) {
            historicoMov[codigo][1] += quantidade;
        }

        public static void exibirRelatorio() {
            String relatorio = "Movimentações (Entradas e Saídas):\n";

            for (int i = 0; i < 10; i++) {
                if (Produtos.nome[i] != null && !Produtos.nome[i].isEmpty()) {
                    relatorio += "\n Código " + i + " - " + Produtos.nome[i] + "\n" +
                            "   Total Comprado (Entradas): " + historicoMov[i][0] + "\n" +
                            "   Total Vendido (Saídas): " + historicoMov[i][1] + "\n" +
                            "   Estoque Atual: " + Produtos.produtos[i];
                }
            }

            JOptionPane.showMessageDialog(null, relatorio);
        }
    }
}
