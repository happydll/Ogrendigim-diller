import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        //Hashmap
        /* Listeler gibi tek fark� burada de�erlere anahtar kelimeler atayabiliyoruz.
        Bu sayede ileride bir de�ere ula�mam�z gerekti�i zaman daha kolay ula�abiliriz.
         */

        HashMap<String, String> myHashmap= new HashMap<>();

        myHashmap.put("isim", "ali");
        //myHashmap.put("isim", "veli"); //ayn� key birden fazla de�er alam�yor


        System.out.println(myHashmap.get("isim"));
    }
}

