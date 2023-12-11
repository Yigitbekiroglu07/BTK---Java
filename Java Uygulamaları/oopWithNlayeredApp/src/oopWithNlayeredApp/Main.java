package oopWithNlayeredApp;

import java.lang.System.Logger;

import oopWithNlayeredApp.business.ProductManager;
import oopWithNlayeredApp.core.logging.DataBaseLogger;
import oopWithNlayeredApp.core.logging.FileLogger;
import oopWithNlayeredApp.core.logging.MailLogger;
import oopWithNlayeredApp.dataAccess.HibernateProductDao;
import oopWithNlayeredApp.dataAccess.jdbcProductdao;
import oopWithNlayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// Arayüz
		// Arayüz iş birimiyle iletişim kurar, veritabanına gidemez.
		// İş birimi = ProductManager
		Product product1 = new Product(1, "Iphone Xr", 10000);
		
		Logger[] loggers = {};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}
