public class OzurMesaj� {

    public static void main(String[] args) {
        String[] myArrays = {"�", "Z", "�", "R", " ", "D", "�", "L", "E", "R", "�", "M"};

        try{
            for (int i = 0; i < myArrays.length; i++) {
                System.out.println(myArrays[i]);
                Thread.sleep(1000);//i�lemi 1 saniye boyunca durdurur.
            }
        }catch (InterruptedException devam){} /* yukar�da i�lemi thread.sleep'le 1 saniye kesintiye u�ratt���m.
        kesintiye u�ram�� i�lemin devam etmesi i�in de InterruptedException kulland�m.*/


    }
}

