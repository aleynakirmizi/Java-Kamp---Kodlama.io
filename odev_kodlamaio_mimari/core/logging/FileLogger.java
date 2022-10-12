package odev_kodlamaio_mimari.core.logging;

public class FileLogger implements Logger{

	@Override
	public void logging(String text) {
		System.out.println(text+" Belgeye loglandý");
	}

}
