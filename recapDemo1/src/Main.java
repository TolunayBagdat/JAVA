public class Main {

    public static void main(String[] args) {
	int sayi1=20;
    int sayi2=25;
    int sayi3=2;
    int enBuyuk= sayi2;

    if (enBuyuk<sayi1) {enBuyuk=sayi1;}
    if (enBuyuk<sayi3) {enBuyuk=sayi3;}

    System.out.print("En büyük sayı = " + enBuyuk);
    }

}
