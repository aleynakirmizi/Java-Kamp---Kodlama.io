package _25_ParametreliMetodlarýAnlamak;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Bugün hava çok güzel";
		//String yeniMesaj = mesaj.substring(0,2);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,6);
		System.out.println(sayi);
	}
	public static void ekle() {
		
	}
	public static void sil() {
			
	}
	
	public static void güncelle() {
		
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static String sehirVer() {
		return "Bilecik";
	}
	
//Output:
	//Bilecik
	//11


}
