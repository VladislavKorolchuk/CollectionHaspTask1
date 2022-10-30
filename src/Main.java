import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static public Set<Product> productsSet = new HashSet<>();
    static public Set<Recipe> recipeSet = new HashSet<>();
    public static void main(String[] args) {

        Product product1 = new Product("Масло сливочное 1 кг.", 150, 40);
        addProduct(product1);
        Product product2 = new Product("Масло подсолнечное 1 кг.", 120, 40);
        addProduct(product2);
        Product product3 = new Product("Сахар 1000 кг.", 60, 40);
        addProduct(product3);
        Product product4 = new Product("Мука 1 кг", 130, 40);
        addProduct(product4);
        product3.setChesk();    // Признак товара / Куплен /
        System.out.println(product1.toString());

        // ------------- Рецепты -----------------
        Recipe recipes1 = new Recipe("Пирог", Set.of(product2,product4,product3));
        addRecipes(recipes1);
        Recipe recipes2 = new Recipe("Торт", Set.of(product1,product2));
        addRecipes(recipes2);
        System.out.println(recipes1.toString());

        // Задание 2
        ArrayList<Integer> intArray = new ArrayList<>(20);
        // Заполняем массив случайными числами от 0 до 1000
        for (int i = 0; i < 20; i++) {
            intArray.add(i, (int) (Math.random() * 1000));
        }
        System.out.println("intArray = " + intArray);

// --------------Убираем нечетные числа--------------------
        int size=20;
        for (int i = 0; i < size; i++) {
             if ((intArray.get(i)%2) == 1){
               intArray.remove(i);
               i--;
               size--;
            }
        }
        System.out.println("intArray = " + intArray);

    }

    static void addProduct(Product product){
        if (!productsSet.add(product)){
            throw new IllegalArgumentException("Повтор номенклатуры");
        }
    }

    static void addRecipes(Recipe recipe){
        if (!recipeSet.add(recipe)){
            throw new IllegalArgumentException("Повтор рецепта");
        }
    }

}