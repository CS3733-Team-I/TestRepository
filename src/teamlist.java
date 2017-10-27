public class teamlist {

    public static void main(String[] args) {
        System.out.println("Jerry Brown");
        printMichael();
        System.out.println("Ziheng(Leo) Li");
        System.out.println("Da Xu");
        System.out.println("Ben Gillette");
        System.out.println("John Parrick");
        // finally working for mary
        System.out.println("Mary Hatfalvi");
        printbkg();
        print_jp();
        print_hd();

    }
    private static void printbkg(){
        System.out.println("Ben Gillette new method");
        System.out.println("John Parrick");

        jerry();
        print_jp();
    }

    public static void jerry() {
        System.out.println("Jerry Branch -- Branch");
    }

    public void print_zli() {
        System.out.println("Ziheng(Leo) Li");
        print();
    }

    public static void print() {
        System.out.println("branch Da Xu");
    }

    public static void print_jp() {
        System.out.println("John Parrick -- Branch");
    }

    public static void print_hd(){
        System.out.println("Henry Dunphy");
    }

    public static void printMichael() {
        System.out.println("Michael Sidler");
    }
}
