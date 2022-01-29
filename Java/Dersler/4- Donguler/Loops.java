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
        Burada for i�erisinde i isimli bir de�i�ken tan�mlad�k
        d�ng�de i myNumbers dizisinin eleman say�s�ndan k���k oldu�u s�rece i yi bir artt�ramas�n� s�yleyerek
        d�ng�y� tan�mlad�k.
         */

        for(int number:myNumbers){
            System.out.println(number/2+5);
        }
        /*
        Burada da for i�erisinde number isimli bir de�i�ken tan�mlad�k
        Sonras�nda number de�i�kenin i�ine s�ras�yla myNumbers dizisinin i�imdeki elemanlar�n
        yazd�r�lmas�n� isteyerek d�ng�y� tan�mlad�k.

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
