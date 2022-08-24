public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
      int weight = 55;
      double growth = 1.65;

        double index;
        index = service.calculate (weight, growth) ;
        System.out.println("Ваш индекс массы тела составляет:");
        System.out.println (index); }





}

