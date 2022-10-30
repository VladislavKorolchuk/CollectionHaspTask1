import java.util.Arrays;
import java.util.Set;

final class Recipe {
    private final String nameRecipe;
    private final Set<Product> products;

    public Recipe(String nameRecipe, Set<Product> products) {
        if (nameRecipe == null || nameRecipe.isEmpty()) {
            throw new IllegalArgumentException("Введите корректные данные");
        }
        this.nameRecipe = nameRecipe;
        this.products = products;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Set<Product> getProducts1() {
        return products;
    }

    @Override
    public String toString() {
        return "Рецепт - " + nameRecipe+
                ", products=" + products;
    }

    // метод расчета стоимости продуктов
    public int costOfProducts() {
        int sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

}
