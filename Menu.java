import javax.swing.*;

public class Menu {

    public static boolean menu() {
        String menu = "1 - Cadastrar Produtos\n2 - Ver Produto\n3 - Registrar Compras\n4 - Registrar Vendas\n5 - Conferencia de Movimentações\n0 - Sair do Menu";
        int opção = -1;
        while(opção !=0) {
            opção = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opção) {
                case 1:
                    Produtos.cadastroProduto();
                    break;
                case 2:
                    Produtos.verProduto();
                    break;
                case 3:
                    Produtos.RegistrarCompra();
                    break;

                case 4:
                    Produtos.RegistrarVenda();
                    break;

                case 5:
                Movimentaçoes.Movimentacoes.exibirRelatorio();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado e até logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Dado invalido");
            }
        }
        return true;
    }
}
