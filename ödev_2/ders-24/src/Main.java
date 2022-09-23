
public class Main {

	public static void main(String[] args) {
		sayiBulmaca(3);
		sayiBulmaca(4);
		sayiBulmaca(5);
		sayiBulmaca(8);

	}
	
	public static void sayiBulmaca(int aranacak) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		boolean varMi=false;
		String mesaj ="";
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			mesaj = "Sayý Mevcuttur:";
			mesajVer(mesaj,aranacak);
		}
		else {
			mesaj = "Sayý Mevcut Deðildir:";
			mesajVer(mesaj,aranacak);
		}
	}
	public static void mesajVer(String mesaj,int aranacak) {
		System.out.println(mesaj+" "+ aranacak);
	}
}



// Output:

	//Sayý Mevcut Deðildir: 3
	//Sayý Mevcut Deðildir: 4
	//Sayý Mevcuttur: 5
	//Sayý Mevcut Deðildir: 8



