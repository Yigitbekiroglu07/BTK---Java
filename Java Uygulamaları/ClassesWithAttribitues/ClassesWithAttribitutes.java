// Classes With Attribitutes
// Classlar ilgili operasyonları ilgili özellikleri tutar.
// Bir method bir iş yapar, ProductManager içine Product yazılamaz.
public class ClassesWithAttribitutes {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.description = "Huawei Laptop";
        product.id = 500;
        product.price = 5000;
        product.stockAmount = 1000;
        // Ürün artık elimizde var, onu veri tabanına ekliyoruz.
        ProductManager productManager = new ProductManager();
        productManager.Add(product);


    }
}