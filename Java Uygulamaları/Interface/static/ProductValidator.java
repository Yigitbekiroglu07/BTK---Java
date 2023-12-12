public class ProductValidator {
    // Ürünü güncellerken kurala uygun olup olmadığını bulmak için kullanırız.
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}