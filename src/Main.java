import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> list = getProducts();
        List<Product> priceCheckList =
                list.stream()
                        .filter(product -> product.getCategory().equals(Categories.Books))
                        .filter(product -> product.getPrice() > 100)
                        .collect(Collectors.toList());
        System.out.println(priceCheckList);
        long count = priceCheckList.stream().count();
        System.out.println(" The number of the books (<100) in this category are " + count);

        List<Product> max =
                list.stream()
                        .filter(product -> product.getCategory().equals(Categories.Books))
                        .max(Comparator.comparing(Product::getPrice))
                        .stream().collect(Collectors.toList());
        System.out.println("The maximum price from the books is this item " + max);

        List<Product> min =
                list.stream()
                        .filter(product -> product.getCategory().equals(Categories.Books))
                        .min(Comparator.comparing(Product::getPrice))
                        .stream().collect(Collectors.toList());
        System.out.println("The minimum  price from the books is this item " + min);

        List<Product> countOfTheBooks =
                list.stream()
                        .filter(product -> product.getCategory().equals(Categories.Books))
                        .collect(Collectors.toList());
        System.out.println("The number of the books are " + countOfTheBooks.stream().count());


        List<Product> averageOfTheBooKs =
                list.stream()
                        .filter(product -> product.getCategory().equals(Categories.Books))
                        .collect(Collectors.toList());
        System.out.println("The average of the book is " + Product.calculateAverage(averageOfTheBooKs));

        List<Product> sumOfTheBooks =
                list.stream()
                        .filter(product -> product.getCategory().equals(Categories.Books))
                        .collect(Collectors.toList());
        System.out.println("The sum of the book is " + Product.sum(sumOfTheBooks));


        List<Product> ListForBabies =
                list.stream()
                        .filter(product -> product.getCategory().equals(Categories.Baby))
                        .collect(Collectors.toList());
        System.out.println(ListForBabies);
    }

    public static List<Product> getProducts() {
        return List.of(
                new Product("Toys", 4657, Categories.Toys),
                new Product("Clothing", 10, Categories.Clothing),
                new Product("Spoons", 394, Categories.ConvienceGoods),
                new Product("Cars", 46, Categories.Toys),
                new Product("Car Seat", 190, Categories.Baby),
                new Product("Go ", 64, Categories.Books),
                new Product("Leader", 29, Categories.Books),
                new Product("Sacrifice", 90, Categories.Books),
                new Product("Leader", 88, Categories.Books),
                new Product("Machines", 190, Categories.Baby),
                new Product("Leader", 110, Categories.Books),
                new Product("Stroller", 190, Categories.Baby),
                new Product("Towels", 190, Categories.Baby)

        );
    }
}