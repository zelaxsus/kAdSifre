package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, rePassword, newPassword;
        int secim;
        rePassword="Java123";
        System.out.print("Kullanıcı adı: ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("Patika") && (password.equals(rePassword))) {
            System.out.print("Başarılı giriş");

        } else {
            System.out.println("Giriş Başarısız \n Şifre yenilemek isterseniz 1 e basınız \n istemiyorsanız 2'yi tuşlayınız");
        }
        secim= input.nextInt();
        switch (secim) {
            case 1:
            System.out.println("Yeni sifre "+ input.nextLine());
             newPassword=input.nextLine();
             if(newPassword.equals("Java123"))
             {
                 System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
             }
             else
             {
                 System.out.println("Şifre oluşturuldu");
             }
             break;
            default:

        }

    }
}
