package Giris;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 4000;
        int select;
        while (right > 0){
            System.out.print("Kullanıcı adınız : ");
            userName = baba.nextLine();
            System.out.print("Parolanız : ");
            password = baba.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz bankasına hoşgeldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin : ");
                    select = baba.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para Miktarı :");
                            int price = baba.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı :");
                            int price2 = baba.nextInt();
                            if (price2 > balance){
                                System.out.println("Bakiye Yetersiz!");
                            }else {
                                balance -= price2;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı ya da şifre. Tekrar deneyiniz.");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}
