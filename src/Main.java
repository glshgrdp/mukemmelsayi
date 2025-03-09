
public class Main {
    public static void main(String[] args) {
        int sayi = 28;
        int kalan = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                kalan = kalan + i;
                System.out.println(i);

            }
            }
        if (kalan == sayi) {
            System.out.println("Isleme giren sayi , mukemmel sayidir.");
        } else {
            System.out.println("Isleme giren sayi , mukkemmel sayi degildir.");
        }
}



    }

