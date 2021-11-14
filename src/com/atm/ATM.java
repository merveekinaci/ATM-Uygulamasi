package com.atm;

import java.util.Scanner;

public class ATM {
    public void calis (Hesap hesap) {

        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        int girishakki = 3;

        System.out.println("Bankamıza Hoşgeldinzi");

        while(true) {
            if (login.login(hesap)) {
                System.out.println("Giriş Başarılı");
                break;
            }
            else {
                System.out.println("Bilgileriniz Hatalı");
                girishakki--;
                System.out.println("Giriş Hakkı Sayınız : " + girishakki);
            }
            if (girishakki == 0) {
                System.out.println("Giriş Hakkınız Kalmadı. Daha Sonra Tekrar deneyiniz.");
                return;
            }
        }

        System.out.println("*******************");
        String islemlerString = "1.Çıkış için q ya basınız\n"
                + "2.Bakiye Görünlüleme\n"
                + "3.Para Cekme\n"
                + "4.Para Yatırma";
        System.out.println(islemlerString);
        System.out.println("*******************");

        while(true) {
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Sistemden Çıkılıyor");
                break;
            }
            else if (islem.equals("2")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            }
            else if (islem.equals("3")) {
                System.out.println("Çekmek İStediğiniz Ücreti Giriniz : ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(miktar);
            }
            else if (islem.equals("4")) {
                System.out.println("Yatırmak İstediğiniz Ücreti Giriniz : ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(miktar);
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }
        }
        scanner.close();
    }
}


