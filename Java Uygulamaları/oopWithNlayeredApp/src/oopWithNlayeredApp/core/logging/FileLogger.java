package oopWithNlayeredApp.core.logging;

public class FileLogger implements Logger {
	// Override baseden alınan bir interface olunduğunu ve üzerine yazıldığını ifade eder.
	// Override çıkarılırsa değişen bir şey olmaz.
	@Override
	public void log(String data) {
		System.out.println("Dosyaya Loglandı: " +data);
		
	}

}
