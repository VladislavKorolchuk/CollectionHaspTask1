import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product extends HashMap {
    private String nameProducts;
    private int price;
    private int num;
    static public Set<Product> productsSet = new HashSet<>();

    public Product(String nameProducts, int price, int num) {
        this.nameProducts = nameProducts;
        this.price = price;
        this.num = num;
    }

    public String getNameProducts() {
        return nameProducts;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;

        boolean ComparisonOfNames = nameProducts.equals(product.nameProducts);
        return ComparisonOfNames;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProducts);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProducts='" + nameProducts + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }

    static void addHashSet(Product product) {
        if (productsSet.size() == 0) {
            productsSet.add(product);
        } else {
            for (Product products : productsSet) {
                if (products.hashCode() == product.hashCode()) {
                    throw new IllegalArgumentException("Повторяющий элемент");
                }
            }
        }
        productsSet.add(product);
    }
}
