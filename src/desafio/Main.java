package desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int controleDeCompra(double limite, List<Produto> produtos) {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getProdutoPrice();
        }
        if (total > limite) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int operacao = 1;
        List<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (operacao != 0) {
            System.out.println("Digite o Limite do seu cartão de crédito: ");
            double limite = scanner.nextDouble();
            while(limite > 0) {
                System.out.println("Digite o Produto que quer comprar: ");
                String produtoName = scanner.next();
                System.out.println("Digite o preço do produto: ");
                double produtoPrice = scanner.nextDouble();
                int result = controleDeCompra(limite, produtos);
                if (result == 1) {
                    System.out.println("Você não pode comprar esse produto, pois o total ultrapassa o limite do cartão.");
                    limite = 0;
                    operacao = 0;
                } else {
                    Produto produto = new Produto(produtoName, produtoPrice);
                    limite -= produtoPrice;
                    produtos.add(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    System.out.println("Você quer continuar comprando? 1 - Sim, 0 - Não");
                    operacao = scanner.nextInt();
                }
            }


        }
        System.out.println("Produtos comprados: ");
        Collections.sort(produtos);
        System.out.println(produtos);
    }
}
