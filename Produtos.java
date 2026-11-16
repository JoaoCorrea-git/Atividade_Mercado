import javax.swing.*;

public class Produtos {

    static double[] preço = new double[10];
    static String[] nome = new String[10];
    static int produtosCadastrados = 0;
    static int[] produtos = new int[10];

    public static void cadastroProduto() {

        String Numero = "Qual posição deseja cadastrar o Produto(0 - 9)? Para cancelar insiria(10)!";

        int opção = -1;
        opção = Integer.parseInt(JOptionPane.showInputDialog(Numero));
        switch (opção) {
            case 0:
                nome[0] = JOptionPane.showInputDialog("Qual o nome do produto?");
                preço[0] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
                produtos[0] =Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial de Estoque?"));
                produtosCadastrados++;
                break;
            case 1:
                nome[1] = JOptionPane.showInputDialog("Qual o nome do produto?");
                preço[1] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
                produtos[1] =Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial de Estoque?"));
                produtosCadastrados++;
                break;
            case 2:
                nome[2] = JOptionPane.showInputDialog("Qual o nome do produto?");
                preço[2] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
                produtos[2] =Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial de Estoque?"));
                produtosCadastrados++;
                break;
            case 3:
                nome[3] = JOptionPane.showInputDialog("Qual o nome do produto?");
                preço[3] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
                produtos[3] =Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial de Estoque?"));
                produtosCadastrados++;
                break;
            case 4:
                nome[4] = JOptionPane.showInputDialog("Qual o nome do produto?");
                preço[4] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
                produtos[4] =Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial de Estoque?"));
                produtosCadastrados++;
                break;
            case 5:
                nome[5] = JOptionPane.showInputDialog("Qual o nome do produto?");
                preço[5] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
                produtos[5] =Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial de Estoque?"));
                produtosCadastrados++;
                break;
            case 6:
                nome[6] = JOptionPane.showInputDialog("Qual o nome do produto?");
                preço[6] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
                produtos[6] =Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial de Estoque?"));
                produtosCadastrados++;
                break;
            case 7:
                nome[7] = JOptionPane.showInputDialog("Qual o nome do produto?");
                preço[7] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
                produtos[7] =Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial de Estoque?"));
                produtosCadastrados++;
                break;
            case 8:
                nome[8] = JOptionPane.showInputDialog("Qual o nome do produto?");
                preço[8] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
                produtos[8] =Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial de Estoque?"));
                produtosCadastrados++;
                break;
            case 9:
                nome[9] = JOptionPane.showInputDialog("Qual o nome do produto?");
                preço[9] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
                produtos[9] =Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial de Estoque?"));
                produtosCadastrados++;
                break;

            case 10:
                JOptionPane.showMessageDialog(null, "Cadastro Cancelado!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Por favor selecione uma opção valida!");

        }
    }

    public static void RegistrarCompra() {

        String Numero1 = "Em qual codigo de produto deseja cadastrar a compra(0 - 9)? Para cancelar insiria(10)!";
        int valorDesejado=-1;
        String valor = "Quantas unidades deseja inserir?";
        int opç = -1;
        opç = Integer.parseInt(JOptionPane.showInputDialog(Numero1));
        switch (opç) {
            case 0:
               valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
               produtos[0] = produtos[0] + valorDesejado;
                Movimentaçoes.Movimentacoes.registrarCompraMov(0, valorDesejado);
                break;
            case 1:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[1] = produtos[1] + valorDesejado;
                Movimentaçoes.Movimentacoes.registrarCompraMov(1, valorDesejado);
                break;
            case 2:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[2] = produtos[2] + valorDesejado;
                Movimentaçoes.Movimentacoes.registrarCompraMov(2, valorDesejado);
                break;
            case 3:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[3] = produtos[3] + valorDesejado;
                Movimentaçoes.Movimentacoes.registrarCompraMov(3, valorDesejado);
                break;
            case 4:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[4] = produtos[4] + valorDesejado;
                Movimentaçoes.Movimentacoes.registrarCompraMov(4, valorDesejado);
                break;
            case 5:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[5] = produtos[5] + valorDesejado;
                Movimentaçoes.Movimentacoes.registrarCompraMov(5, valorDesejado);
                break;
            case 6:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[6] = produtos[6] + valorDesejado;
                Movimentaçoes.Movimentacoes.registrarCompraMov(6, valorDesejado);
                break;
            case 7:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[7] = produtos[7] + valorDesejado;
                Movimentaçoes.Movimentacoes.registrarCompraMov(7, valorDesejado);
                break;
            case 8:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[8] = produtos[8] + valorDesejado;
                Movimentaçoes.Movimentacoes.registrarCompraMov(8, valorDesejado);
                break;
            case 9:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[9] = produtos[9] + valorDesejado;
                Movimentaçoes.Movimentacoes.registrarCompraMov(9, valorDesejado);
                break;

            case 10:
                JOptionPane.showMessageDialog(null, "Cadastro de compra Cancelado!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Por favor selecione uma opção valida!");

        }
    }

    public static void RegistrarVenda() {
        String Numero2 = "Em qual codigo de produto deseja cadastrar a venda(0 - 9)? Para cancelar insiria(10)!";
        int valorDesejado=-1;
        String valor = "Quantas unidades deseja remover?";
        int opço = -1;
        opço = Integer.parseInt(JOptionPane.showInputDialog(Numero2));
        switch (opço) {
            case 0:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[0] = produtos[0] - valorDesejado;
                Movimentaçoes.Movimentacoes.registrarVendaMov(0, valorDesejado);
                break;
            case 1:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[1] = produtos[1] - valorDesejado;
                Movimentaçoes.Movimentacoes.registrarVendaMov(1, valorDesejado);
                break;
            case 2:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[2] = produtos[2] - valorDesejado;
                Movimentaçoes.Movimentacoes.registrarVendaMov(2, valorDesejado);
                break;
            case 3:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[3] = produtos[3] - valorDesejado;
                Movimentaçoes.Movimentacoes.registrarVendaMov(3, valorDesejado);
                break;
            case 4:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[4] = produtos[4] - valorDesejado;
                Movimentaçoes.Movimentacoes.registrarVendaMov(4, valorDesejado);
                break;
            case 5:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[5] = produtos[5] - valorDesejado;
                Movimentaçoes.Movimentacoes.registrarVendaMov(5, valorDesejado);
                break;
            case 6:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[6] = produtos[6] - valorDesejado;
                Movimentaçoes.Movimentacoes.registrarVendaMov(6, valorDesejado);
                break;
            case 7:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[7] = produtos[7] - valorDesejado;
                Movimentaçoes.Movimentacoes.registrarVendaMov(7, valorDesejado);
                break;
            case 8:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                produtos[8] = produtos[8] - valorDesejado;
                Movimentaçoes.Movimentacoes.registrarVendaMov(8, valorDesejado);
                break;
            case 9:
                valorDesejado= Integer.parseInt(JOptionPane.showInputDialog(valor));
                Movimentaçoes.Movimentacoes.registrarVendaMov(9, valorDesejado);
                produtos[9] = produtos[9] - valorDesejado;
                break;

            case 10:
                JOptionPane.showMessageDialog(null, "Cadastro de venda Cancelada!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Por favor selecione uma opção valida!");

        }
    }


    public static void verProduto() {
        String PosiçãoProduto = "Voce possui " + Produtos.produtosCadastrados + " produtos cadastrados!" + " Os produtos cadastrado são:" +
                "\n" + "Codigo 0: " + Produtos.nome[0] + " - Preço: R$" + Produtos.preço[0] + " - Estoque: "+ Produtos.produtos[0] +" Unidades" +
                "\n" + "Codigo 1: " + Produtos.nome[1] + " - Preço: R$" + Produtos.preço[1] + " - Estoque: "+ Produtos.produtos[1] +" Unidades" +
                "\n" + "Codigo 2: " + Produtos.nome[2] + " - Preço: R$" + Produtos.preço[2] + " - Estoque: "+ Produtos.produtos[2] +" Unidades" +
                "\n" + "Codigo 3: " + Produtos.nome[3] + " - Preço: R$" + Produtos.preço[3] + " - Estoque: "+ Produtos.produtos[3] +" Unidades" +
                "\n" + "Codigo 4: " + Produtos.nome[4] + " - Preço: R$" + Produtos.preço[4] + " - Estoque: "+ Produtos.produtos[4] +" Unidades" +
                "\n" + "Codigo 5: " + Produtos.nome[5] + " - Preço: R$" + Produtos.preço[5] + " - Estoque: "+ Produtos.produtos[5] +" Unidades" +
                "\n" + "Codigo 6: " + Produtos.nome[6] + " - Preço: R$" + Produtos.preço[6] + " - Estoque: "+ Produtos.produtos[6] +" Unidades" +
                "\n" + "Codigo 7: " + Produtos.nome[7] + " - Preço: R$" + Produtos.preço[7] + " - Estoque: "+ Produtos.produtos[7] +" Unidades" +
                "\n" + "Codigo 8: " + Produtos.nome[8] + " - Preço: R$" + Produtos.preço[8] + " - Estoque: "+ Produtos.produtos[8] +" Unidades" +
                "\n" + "Codigo 9: " + Produtos.nome[9] + " - Preço: R$" + Produtos.preço[9] + " - Estoque: "+ Produtos.produtos[9] +" Unidades";
        JOptionPane.showMessageDialog(null, PosiçãoProduto);
    }


}