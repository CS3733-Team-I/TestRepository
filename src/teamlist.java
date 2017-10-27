public class teamlist {

    public static void main(String[] args) {
        System.out.println("Jerry Brown");
        System.out.println("Michael Sidler");
        System.out.println("Da Xu");
        System.out.println("Ben Gillette");
        System.out.println("John Parrick");
        printbkg();
        print_jp();

    }
    private static void printbkg(){
        System.out.println("Ben Gillette new method");

        System.out.println("Henry Dunphy");

        jerry();

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
}
