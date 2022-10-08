package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Dosyaya loglandý:" + data);
		
	}

}
