import java.util.HashSet;

public class sets {
    public static void main(String[] args) {
        //set
        /*
        Setlerin listlerden veya arraylerden fark� burada yazd���m�z bir de�eri bir daha yazam�yoruz.
         */
        HashSet<String> mySet= new HashSet<>();//bunda da ka eleman olaca��n� s�ylememize gerek yok.
        mySet.add("ali");
        mySet.add("ali");
        System.out.println(mySet.size());//size elementi biz i�indeki veri say�s�n� s�yler.
    }
}
