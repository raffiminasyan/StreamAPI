import java.util.List;

public class Product {
    public String name;
    public int price;
    public Categories category;

    public Product(String name, int price, Categories category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Categories getCategory() {
        return category;
    }

    public static double calculateAverage(List<Product> productList) {

        return (double) (sum(productList) / productList.size());
    }

    public static double sum(List<Product> productList) {
        int sum =0;
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            sum += product.getPrice();
        }
        return sum;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
