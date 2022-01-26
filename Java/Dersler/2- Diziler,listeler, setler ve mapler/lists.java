import java.util.ArrayList;

public class lists {
    public static void main(String[] args) {
        //lists

        ArrayList<String> isimler = new ArrayList<>(); //kaç eleman olacaðýný belirmemize gerek yok.
        /*
        isimler adýnda sadece stringler yazýlabilern bir list oluþturduk.
         */
        isimler.add("ali"); //listenin 0. indexine aliyi ekledi
        isimler.add("veli");
        isimler.add(1, "ahmet");
        /*
        listenin 1. indexinde veli var ama biz sonradan ahmeti 1. indexe yazmak isersek
        add fonskyonunun içine sýrasýný belirtip sonra veriyi yazarýz.
        Sonrasýnda ilk baþta 1. index olan veli ise bir sonraki indexe yazýlýr.
         */
        isimler.add("mehmet");

        System.out.println(isimler.get(0));
        System.out.println(isimler.get(1));
        System.out.println(isimler.get(2));
        System.out.println(isimler.get(3));

    }
}
