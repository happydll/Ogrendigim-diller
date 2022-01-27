public class OzurMesajý {

    public static void main(String[] args) {
        String[] myArrays = {"Ö", "Z", "Ü", "R", " ", "D", "Ý", "L", "E", "R", "Ý", "M"};

        try{
            for (int i = 0; i < myArrays.length; i++) {
                System.out.println(myArrays[i]);
                Thread.sleep(1000);//iþlemi 1 saniye boyunca durdurur.
            }
        }catch (InterruptedException devam){} /* yukarýda iþlemi thread.sleep'le 1 saniye kesintiye uðrattýðým.
        kesintiye uðramýþ iþlemin devam etmesi için de InterruptedException kullandým.*/


    }
}

