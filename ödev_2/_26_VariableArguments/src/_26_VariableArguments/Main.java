package _26_VariableArguments;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Bug�n hava �ok g�zel";
		//String yeniMesaj = mesaj.substring(0,2);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,6);
		System.out.println(sayi);
		int toplam = topla(1,2,3,4,5,6,7);
		System.out.println(toplam);

	}public static void ekle() {
		
	}
	public static void sil() {
			
	}
	
	public static void g�ncelle() {
		
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static String sehirVer() {
		return "Bilecik";
	}
	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam+sayi;
		}
		return toplam ;
		
	}

}

//Output:
//Bilecik
//11
//21


