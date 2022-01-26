public class Arrays {

    public static void main(String[] args) {

        String[] myStringArray = new String[3];
        /*
        mystringArray diye bir dizi tanýmladým. onun 3 elemalý olduðunu belirttim.
        */
        myStringArray[0]="ali";
        /*
        dizilerde elemanlar 0. indexten baþlar. 1. eleman 0.indexte durur.
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
        dersek dizi sýnýrlarý aþtýn diye hata verir.
        baþta 3 elemanlý olarak tanýmladýðýn diziye 4. elemaný tanýmlayamazsýn.
         */

        System.out.println(myIntigerArray[1]);

        int[] myNuberArray= {1,2,3,4,5,6,7}; //Diziler bu þekilde de tanýmlandabilir.
        System.out.println(myNuberArray[4]);
    }
}
