package oopWithNlayeredApp.business;

import java.lang.System.Logger;
import java.util.List;

import oopWithNlayeredApp.dataAccess.HibernateProductDao;
import oopWithNlayeredApp.dataAccess.ProductDao;
import oopWithNlayeredApp.dataAccess.jdbcProductdao;
import oopWithNlayeredApp.entities.Product;
// Siteye girildiğinde girilen veriler ProductManager'a gelir. İş birimi.
public class ProductManager {
	private ProductDao productDao;
	// List<Logger> Logger[] anlamına gelir.
 	private Logger[] loggers;
	// ProductManager newlendiğinde bana bir ProductDao ver demek.
	public ProductManager(ProductDao productDao,  Logger[] loggers){
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// İş kuralları yazılır.
		if(product.getUnitPrice()< 10) {
			// Hata fırlatma kodu
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz.");
		}
		// if bloğundan çıkıldı hata yok öyleyse ürünü ekle. productDao.add(product)
		productDao.add(product);
		// logger : loggers >>> loggers içindekileri tek tek gez demek.
		for (Logger logger : loggers) {
			logger.log(null, product.getName());
		}
		}
	}

