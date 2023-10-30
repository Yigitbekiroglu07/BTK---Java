// Classes With Attribitutes
// Classlar ilgili operasyonları ilgili özellikleri tutar.
// Bir method bir iş yapar, ProductManager içine Product yazılamaz.
public class Encapsulation {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setDescription("Huawei Laptop");
        product.setId(1);
        product.setPrice(5000);
        product.setStockAmount(3);


        // Ürünün Id'sini okumak için product.getId yapılır.
        // Ürün artık elimizde var, onu veri tabanına ekliyoruz.
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


    }
}