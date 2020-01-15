
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;


public class Test {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Çalışan programına hoşgeldiniz....");
        System.out.println("*************************************");
        String islemler = "1. Yazılımcı İşlemleri\n"
                + "2.Yönetici İşlemleri\n"
                + "Çıkış için q'ya basınız";
        System.out.println(islemler);        
        System.out.println("*************************************");
        
        while (true) {            
            
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor....");
                break;
            }
            
            else if(islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Erdem", "Dirican", 1907, "C#, Java");
                
                String y_islemler = "1.Format at\n"
                        + "2.Bilgileri Göster\n"
                        + "Çıkış için q'ya basınız";
                System.out.println(y_islemler);
                
                while (true) {
                    
                    System.out.print("Yazılımcı işlemini seçiniz: ");
                    y_islemler = scanner.nextLine();
                    
                    if(y_islemler.equals("1")){
                        String isletim_sistemi;
                        System.out.println("İşletim sistemi: ");
                        isletim_sistemi = scanner.nextLine();
                        
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if(y_islemler.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else if(y_islemler.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor");
                        break;
                    }
                    else{
                        System.out.println("Geçersiz işlem seçtiniz....");
                    }
                    
                }
            }
            
            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("Mahir", "Dirican", 1958, 3);
                
                String yonetici_islemler = "1. Zam Yap\n"
                        + "2.Bilgileri Göster\n"
                        + "Çıkış için q'ya basınız";
                System.out.println(yonetici_islemler);
                
                while (true) {
                    String yonetici_islem;
                    System.out.print("Yönetici işlemini seçiniz: ");
                    yonetici_islem = scanner.nextLine();
                    
                    if(yonetici_islem.equals("1")){
                        int miktar;
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        miktar = scanner.nextInt();
                        scanner.nextLine();
                        
                        yonetici.zamYap(miktar);                        
                    }
                    else if(yonetici_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else if(yonetici_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else{
                        System.out.println("Geçersiz işlem seçtiniz....");
                    }
                }
                
            }
            else{
                System.out.println("Geçersiz işlem girdiniz.");
            }
        }
        
    }
    
}
