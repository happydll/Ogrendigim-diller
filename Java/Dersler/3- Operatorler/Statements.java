public class Statements {
    public static void main(String[] args) {

        //Statements

        int x=4;
        x=x+1; // x'in deðerini 1 arttýr ve bunu x in yerine yaz.
        System.out.println(x);
        x++; // yukarýdakiyle ayný iþlem, x'in deðerini 1 arttýrýr.
        System.out.println(x);

        x=x-1; //xin deðerinden bir çýkarýr
        System.out.println(x);
        x--; // yukarýdakiyle ayný iþlem, x'in deðerinden 1 çýkartýr.
        System.out.println(x);


        int y=10;

        System.out.println(x>y); // x'in deðeri y'den büyük mü diye kýyaslama yapar.
        /* Sonucu boolean veri tipinde döndürür*/

        System.out.println(x<y); // x'in deðeri y'den küçük mü diye kýyaslama yapar.

        System.out.println(x==y); // x'in deðeri y'ye eþit mi diye kontrol eder.

        System.out.println(x!=y); // x'in deðeri y'ye eþit deðil mi diye kontrol eder.

        // and &&
        // or ||

        x=3;
        y=4;
        int z=5;

        System.out.println(x<y && y>z); // x, y'den küçük mü VE y, z'den büyük mü diye kontrol etti

        /* And (&&) operatörü deðerleri

        1 && 1 = 1
        1 && 0 = 0
        0 && 1 = 0
        0 && 0 = 0
         */

        /* Or (||) operatörü deðerleri

        1 || 1 = 1
        1 || 0 = 1
        0 || 1 = 1
        0 || 0 = 0
         */


        //if statements

        x=5;
        y=5;

        if(x<y){
            System.out.println("y is bigger");
        }
        else if(y<x){
            System.out.println("x is bigger");
        }
        else {
            System.out.println("x=y");
        }

        //switch case statements

        int day=1;
        String dayString="";

        switch (day){
            case 1:
                dayString="Monday";
                break;
            case 2:
                dayString="Tuesday";
                break;
            case 3:
                dayString="Wednesday";
                break;
            default:
                dayString="Sunday";
                break;
                
        }



    }
}
