package com.yasininan.myapplication;

public class Main {
    public static void main(String[] args){

        //String
        //kelime olarak yazýlan deðiþkenlere String denir.
        // tanýmlarken deðiþkenin önüne String ifadesini yazarýz.

        String yaz="ali";
        System.out.println(yaz+" "+"bak");

        //Intiger / Long
        //tam sayý olarak kullanýlan deðiþkenlere dinteger denir.
        //tanýmlarken deðiþkenin önüne int/long ifadesini yazarýz.
        // intle longun arasýndaki sadece kapasite farký var int 32 bit long 64 bit.

        int a=10; //tam sayý deðiþ
        int b=6;
        long amk=15;
        System.out.println(amk);
        System.out.println(a/b);

        //Double / Float
        // Double ve float veri tiplerini tam sayý olmayan deðiþkenler tanýmlarken kullanýrýz.
        // doublela float arasýnda da kapasite farký var.
        // float 32 bit double 64 bitlik kapsiteye sahip.

        double sayi=15.0;
        float sayi2=15.2f;
        //float deðiþkeninde tanýmlarken double ile karýþmamasý içindeðiþkenin sonuna f yazarýz.

        System.out.println(sayi-sayi2);

        //Boolean
        // Doðru veya yanlýþ deðerini alan deðiþken tipi
        boolean love=true;
        System.out.println(love);

        //Final
        //deðiþkenlerin deðiþmemesini istiyorsak tanýmlarken final kullanýrýz.

        int myinteger=4;
        myinteger=5;
        System.out.println(myinteger);

        //kod üzerinde deðiþkenleri tekrar tanýmlarsak kodda en son verdiðimiz degeri alýr.


        final int myinteger2= 51;
        // myinteger2=545;

        /* yorum satýrýný kaldýrýrsak bu kod çalýþmaz çünkü myinteger deðiþnenini
        tanýmlarken önünde final ifadesini yazarak deðiþkeni sabit hale getirdik
        sabit deðiþkeni bir daha deðiþtiremeyiz.
         */

    }
}
