public class Arrays {

    public static void main(String[] args) {

        String[] myStringArray = new String[3];
        /*
        mystringArray diye bir dizi tan�mlad�m. onun 3 elemal� oldu�unu belirttim.
        */
        myStringArray[0]="ali";
        /*
        dizilerde elemanlar 0. indexten ba�lar. 1. eleman 0.indexte durur.
        */
        myStringArray[1]="veli";
        myStringArray[2]="ahmet";

        System.out.println(myStringArray);
        System.out.println(myStringArray[0]); //bana n. indexi getir.

        int[] myIntigerArray= new int[3];
        myIntigerArray[0]=15;
        myIntigerArray[1]=17;
        myIntigerArray[2]=19;
        //myIntigerArray[4]=20;
        /*
        dersek dizi s�n�rlar� a�t�n diye hata verir.
        ba�ta 3 elemanl� olarak tan�mlad���n diziye 4. eleman� tan�mlayamazs�n.
         */

        System.out.println(myIntigerArray[1]);

        int[] myNuberArray= {1,2,3,4,5,6,7}; //Diziler bu �ekilde de tan�mlandabilir.
        System.out.println(myNuberArray[4]);
    }
}
