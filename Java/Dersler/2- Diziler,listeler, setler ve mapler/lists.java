import java.util.ArrayList;

public class lists {
    public static void main(String[] args) {
        //lists

        ArrayList<String> isimler = new ArrayList<>(); //ka� eleman olaca��n� belirmemize gerek yok.
        /*
        isimler ad�nda sadece stringler yaz�labilern bir list olu�turduk.
         */
        isimler.add("ali"); //listenin 0. indexine aliyi ekledi
        isimler.add("veli");
        isimler.add(1, "ahmet");
        /*
        listenin 1. indexinde veli var ama biz sonradan ahmeti 1. indexe yazmak isersek
        add fonskyonunun i�ine s�ras�n� belirtip sonra veriyi yazar�z.
        Sonras�nda ilk ba�ta 1. index olan veli ise bir sonraki indexe yaz�l�r.
         */
        isimler.add("mehmet");

        System.out.println(isimler.get(0));
        System.out.println(isimler.get(1));
        System.out.println(isimler.get(2));
        System.out.println(isimler.get(3));

    }
}
