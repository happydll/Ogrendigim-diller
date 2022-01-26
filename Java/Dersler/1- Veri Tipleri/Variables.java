package com.yasininan.myapplication;

public class Main {
    public static void main(String[] args){

        //String
        //kelime olarak yaz�lan de�i�kenlere String denir.
        // tan�mlarken de�i�kenin �n�ne String ifadesini yazar�z.

        String yaz="ali";
        System.out.println(yaz+" "+"bak");

        //Intiger / Long
        //tam say� olarak kullan�lan de�i�kenlere dinteger denir.
        //tan�mlarken de�i�kenin �n�ne int/long ifadesini yazar�z.
        // intle longun aras�ndaki sadece kapasite fark� var int 32 bit long 64 bit.

        int a=10; //tam say� de�i�
        int b=6;
        long amk=15;
        System.out.println(amk);
        System.out.println(a/b);

        //Double / Float
        // Double ve float veri tiplerini tam say� olmayan de�i�kenler tan�mlarken kullan�r�z.
        // doublela float aras�nda da kapasite fark� var.
        // float 32 bit double 64 bitlik kapsiteye sahip.

        double sayi=15.0;
        float sayi2=15.2f;
        //float de�i�keninde tan�mlarken double ile kar��mamas� i�inde�i�kenin sonuna f yazar�z.

        System.out.println(sayi-sayi2);

        //Boolean
        // Do�ru veya yanl�� de�erini alan de�i�ken tipi
        boolean love=true;
        System.out.println(love);

        //Final
        //de�i�kenlerin de�i�memesini istiyorsak tan�mlarken final kullan�r�z.

        int myinteger=4;
        myinteger=5;
        System.out.println(myinteger);

        //kod �zerinde de�i�kenleri tekrar tan�mlarsak kodda en son verdi�imiz degeri al�r.


        final int myinteger2= 51;
        // myinteger2=545;

        /* yorum sat�r�n� kald�r�rsak bu kod �al��maz ��nk� myinteger de�i�nenini
        tan�mlarken �n�nde final ifadesini yazarak de�i�keni sabit hale getirdik
        sabit de�i�keni bir daha de�i�tiremeyiz.
         */

    }
}
