import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    Set<Product> productsSet = new HashSet<>();
    Set<Recipes> RecipesSet = new HashSet<>();

    public static void main(String[] args) {
        Product product;
        Recipes recipes;

        Product product1 = new Product("Масло сливочное 100 гр.", 150, 40);
        Product product2 = new Product("Масло подсолнечное 300 мл.", 120, 40);
        Product product3 = new Product("Сахар 1000 кг.", 60, 40);
        Product product4 = new Product("Мука 1 кг", 130, 40);

        product1.addHashSet(product1);
        product2.addHashSet(product2);
        product3.addHashSet(product3);
        product4.addHashSet(product4);
        // -------------рецепты-----------------
        Recipes recipes1 = new Recipes("Пирог", product1, product2);
        recipes1.addRecipes(recipes1);
        System.out.println("recipes1.toString() = " + recipes1.toString());
        System.out.println("recipes1.costOfProducts() = " + recipes1.costOfProducts());


        // Задание 2
        ArrayList<Integer> intArray = new ArrayList<Integer>(20);
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

}

