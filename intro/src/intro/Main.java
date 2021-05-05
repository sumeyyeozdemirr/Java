package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = true;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü gifi");
			
		}  else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi gifi");			
		} 
		else {
			System.out.println("Dolar eþittir gifi");
		}

		
		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi Kredisi";
		String kredi5 = "MSB Kredisi";
		String kredi6 = "MEB Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		String[] krediler = 
			{
					"Hýzlý Kredi", 
					"Mutlu Emekli Kredisi", 
			        "Konut Kredisi", 
			        "Çiftçi Kredisi", 
					"MSB Kredisi",
					"MEB Kredisi",
					"Kültür Bakanlýðý Kredisi"
			};
		
		//foreach 
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
	    
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
	}

}
