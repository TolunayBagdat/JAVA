public class Main {

    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Başarılı");
                break;
            case 'B':
                System.out.println("Orta");
                break;
            case 'C':
                System.out.println("Düşük");
                break;
            case 'F':
                System.out.println("Kaldın");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");

        }
    }
