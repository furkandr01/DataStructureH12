import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bilet = {2, 3, 5, 1, 4}; // bekleyenlerin bilet sayıları

        System.out.print("Müşteri kaçıncı sırada bekliyor ? : ");
        int k = scanner.nextInt();
        scanner.close();
        int toplamSure = 0;
        int kisiBilet = bilet[k]; // sıradaki kişinin bilet sayısı

        while (kisiBilet > 0) {
            // sıradaki kişi bir bilet alır
            bilet[k]--;
            kisiBilet--;
            toplamSure++;

            // eğer sıradaki kişinin birden fazla bilet alması gerekiyorsa
            // sıraya tekrar girer
            while (kisiBilet > 0) {
                for (int i = k + 1; i < bilet.length; i++) {
                    if (bilet[i] > 0) {
                        bilet[i]--;
                        kisiBilet--;
                        toplamSure++;
                        if (kisiBilet == 0) {
                            break;
                        }
                    }
                }
                if (kisiBilet > 0) {
                    // sıradaki kişi kuyruğa eklenir
                    bilet[k] += kisiBilet;
                    kisiBilet = bilet[k];
                }
            }

            // diğer kişiler sırayla bilet almaya devam eder ve süreye eklenir
            for (int i = 0; i < bilet.length; i++) {
                if (i != k && bilet[i] > 0) {
                    bilet[i]--;
                    toplamSure++;
                }
            }

            // sıradaki kişi, biletlerini almak için yeniden sıraya girer
            bilet[k] += kisiBilet;
            kisiBilet = bilet[k];
        }

        System.out.println("Geçen Süre: " + toplamSure + " saniye");
    }

   

    public Integer Scanner() {
        return null;
    }
}
