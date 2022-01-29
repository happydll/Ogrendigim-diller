public class Statements {
    public static void main(String[] args) {

        //Statements

        int x=4;
        x=x+1; // x'in de�erini 1 artt�r ve bunu x in yerine yaz.
        System.out.println(x);
        x++; // yukar�dakiyle ayn� i�lem, x'in de�erini 1 artt�r�r.
        System.out.println(x);

        x=x-1; //xin de�erinden bir ��kar�r
        System.out.println(x);
        x--; // yukar�dakiyle ayn� i�lem, x'in de�erinden 1 ��kart�r.
        System.out.println(x);


        int y=10;

        System.out.println(x>y); // x'in de�eri y'den b�y�k m� diye k�yaslama yapar.
        /* Sonucu boolean veri tipinde d�nd�r�r*/

        System.out.println(x<y); // x'in de�eri y'den k���k m� diye k�yaslama yapar.

        System.out.println(x==y); // x'in de�eri y'ye e�it mi diye kontrol eder.

        System.out.println(x!=y); // x'in de�eri y'ye e�it de�il mi diye kontrol eder.

        // and &&
        // or ||

        x=3;
        y=4;
        int z=5;

        System.out.println(x<y && y>z); // x, y'den k���k m� VE y, z'den b�y�k m� diye kontrol etti

        /* And (&&) operat�r� de�erleri

        1 && 1 = 1
        1 && 0 = 0
        0 && 1 = 0
        0 && 0 = 0
         */

        /* Or (||) operat�r� de�erleri

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
