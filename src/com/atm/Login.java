package com.atm;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adı : ");
        String kullanici_adi = scanner.nextLine();
        System.out.println("Parola : ");
        String parola = scanner.nextLine();
        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {
            return true;
        }
        else {
            return false;
        }

    }
}

