import java.util.HashSet;

public class sets {
    public static void main(String[] args) {
        //set
        /*
        Setlerin listlerden veya arraylerden farký burada yazdýðýmýz bir deðeri bir daha yazamýyoruz.
         */
        HashSet<String> mySet= new HashSet<>();//bunda da ka eleman olacaðýný söylememize gerek yok.
        mySet.add("ali");
        mySet.add("ali");
        System.out.println(mySet.size());//size elementi biz içindeki veri sayýsýný söyler.
    }
}
