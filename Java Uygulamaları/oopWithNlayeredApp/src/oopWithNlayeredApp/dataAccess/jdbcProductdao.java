package oopWithNlayeredApp.dataAccess;
// Bir pkaeti başka bir paket içinde kullanmaya import denir.
import oopWithNlayeredApp.entities.Product;

public class jdbcProductdao implements ProductDao {
	// Ürün ekleme yaparken parametre gerekli, o yüzden parantez içinde eklemek istediğimiz
	// parametreyi yazmalıyız.
	public void add(Product product) {
		// sadece db erişim kodları buraya yazılır. Veri tabanıdır.
		// JDBC veri tabanına erişim yçntemidir.
		System.out.println("JDBC ile veritabanına eklendi");
	}

}
