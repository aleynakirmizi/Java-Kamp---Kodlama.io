package _37_InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//ogretmenKrediManager.hesapla();
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new TarimKrediManager());
		krediUI.KrediHesapla(new OgrenciManager());
	}

}
