package odev_kodlamaio_mimari.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void logging(String text) {
		System.out.println(text+ " Database logland�");
		
	}

}
