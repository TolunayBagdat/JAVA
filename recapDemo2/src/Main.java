public class Main {

    public static void main(String[] args) {
	double[] mylist = {1.2,1.3,4.3,5.6};
    double total=0;
    double max=mylist[0];
    for (double list:mylist){
        if (max<list){
            max=list;

        }
        total= total + list;
        System.out.println(list);
    }
    System.out.println("Toplam = "+total);
    System.out.println("En büyük sayi = "+ max);

    }
}
