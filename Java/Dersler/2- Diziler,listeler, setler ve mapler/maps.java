import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        //Hashmap
        /* Listeler gibi tek farký burada deðerlere anahtar kelimeler atayabiliyoruz.
        Bu sayede ileride bir deðere ulaþmamýz gerektiði zaman daha kolay ulaþabiliriz.
         */

        HashMap<String, String> myHashmap= new HashMap<>();

        myHashmap.put("isim", "ali");
        //myHashmap.put("isim", "veli"); //ayný key birden fazla deðer alamýyor


        System.out.println(myHashmap.get("isim"));
    }
}

