import controller.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a= {-10, 0, 4, 7, 2, 1, 9, 6, 5};

        ShellSort sS = new ShellSort();
        System.out.println("Michael Yumbla ");
        System.out.println( "Orden Ascendente");
        sS.printArray(a);
        sS.sort(a,false);
        System.out.println( "Orden Descendente");
        sS.printArray(a);
        sS.sort(a, true);
        
    }
}