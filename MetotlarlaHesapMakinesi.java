import java.util.Scanner;

public class MetotlarlaHesapMakinesi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu= "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";
        System.out.println(menu);

        do {

            System.out.print("Yapacaginiz Islemi Seciniz: ");
            select=input.nextInt();

            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
            }
        }while (select != 0);

    }

    static void plus(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz: ");
        int a= scan.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        int b= scan.nextInt();
        int result= a+b;
        System.out.println("ISLEM SONUCU: "+ result);
    }

    static void minus(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz: ");
        int a= scan.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        int b= scan.nextInt();
        int result= a-b;
        System.out.println("ISLEM SONUCU: "+ result);
    }

    static void times(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz: ");
        int a= scan.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        int b= scan.nextInt();
        int result= a*b;
        System.out.println("ISLEM SONUCU: "+ result);
    }

    static void divided(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz: ");
        int a= scan.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        int b= scan.nextInt();
        if (b == 0 ){
            System.out.println("Ikinci sayi 0 dan farkli olmali");
        }
        int result= a/b;
        System.out.println("ISLEM SONUCU: "+ result);
    }

    static void power(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: ");
        int sayi=scan.nextInt();
        System.out.print("Us Sayiyi Giriniz: ");
        int us=scan.nextInt();

        int result=1;

        for (int i=1; i<=us; i++){
            result=result*sayi;
        }
        System.out.println("ISLEM SONUCU: "+ result);
    }

    static void factorial(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: ");
        int sayi=scan.nextInt();
        int result=1;

        for (int i=sayi; i>=1; i--){
            result=result*i;
        }
        System.out.println("ISLEM SONUCU: "+ result);
    }

    static void mod(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: ");
        int sayi=scan.nextInt();
        System.out.print("Mod Sayisini Giriniz: ");
        int modnumber=scan.nextInt();
        int result= sayi%modnumber;
        System.out.println("ISLEM SONUCU: "+ result);
    }

    static void calc(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Uzun Kenari Giriniz: ");
        int uzun=scan.nextInt();
        System.out.print("Kisa Kenari Giriniz: ");
        int kisa=scan.nextInt();
        int resultAlan= uzun*kisa;
        int resultCevre=2*(uzun+kisa);
        System.out.println("Dikdortgen Alan: "+ resultAlan);
        System.out.println("Dikdortgen Cevre: "+ resultCevre);
    }

}

/*
                  "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
 */