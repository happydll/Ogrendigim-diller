public class Loops {

    public static void main(String[] args) {

        //for loops

        int[] myNumbers={10,12,14,16};

        // int x=myNumbers[0]/2+5;
        // System.out.println(x);

        for (int i=0;i<myNumbers.length;i++){
            int x=myNumbers[i]/2+5;
            System.out.println(x);
        }
        /*
        Burada for içerisinde i isimli bir deðiþken tanýmladýk
        döngüde i myNumbers dizisinin eleman sayýsýndan küçük olduðu sürece i yi bir arttýramasýný söyleyerek
        döngüyü tanýmladýk.
         */

        for(int number:myNumbers){
            System.out.println(number/2+5);
        }
        /*
        Burada da for içerisinde number isimli bir deðiþken tanýmladýk
        Sonrasýnda number deðiþkenin içine sýrasýyla myNumbers dizisinin içimdeki elemanlarýn
        yazdýrýlmasýný isteyerek döngüyü tanýmladýk.

         */

        //while loops

        int c=0;
        while (c<10){
            int d=c+1;
            System.out.println(d);
            c++;
            
        }
    }
}
