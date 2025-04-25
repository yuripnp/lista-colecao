package desafio;

public class Produto implements Comparable<Produto> {
    private String produtoName;
    private double produtoPrice;

    public Produto(String produtoName, double produtoPrice) {
        this.produtoName = produtoName;
        this.produtoPrice = produtoPrice;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "produtoName='" + produtoName + '\'' +
                ", produtoPrice=" + produtoPrice +
                '}';
    }

    public String getProdutoName() { return produtoName; }
    public double getProdutoPrice() { return produtoPrice; }
    public void setProdutoName(String produtoName) { this.produtoName = produtoName; }
    public void setProdutoPrice(double produtoPrice) { this.produtoPrice = produtoPrice; }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.produtoPrice < outroProduto.produtoPrice ? -1 : this.produtoPrice > outroProduto.produtoPrice ? 1 : 0;
    }
}
