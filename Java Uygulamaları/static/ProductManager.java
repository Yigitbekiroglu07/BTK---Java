public class ProductManager {
    public void add(Product product){
        // ProductValidator Validator = new ProductValidator(); Eğer ProductValidator.java classında boolean yanına
        // static eklersek newlemeye gerek kalmaz class ismiyle direkt çağırabiliriz.
        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        } else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }
    }
}
