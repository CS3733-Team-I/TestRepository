public class teamlist {

    public static void main(String[] args) {
        System.out.println("Jerry Brown");
        System.out.println("Michael Sidler");
        System.out.println("Da Xu");
        System.out.println("Ben Gillette");
        System.out.println("John Parrick");
        // finally working for mary
        System.out.println("Mary Hatfalvi");
        printbkg();
        print_jp();

    }
    private static void printbkg(){
        System.out.println("Ben Gillette new method");
        System.out.println("John Parrick");
        System.out.println("Henry Dunphy");

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
    // this is from mary's branch
    public static void mary(){
        System.out.println("this is from Mary's branch");
    }
    public static void print() {
        System.out.println("branch Da Xu");
    }

    public static void print_jp() {
        System.out.println("John Parrick -- Branch");
    }
}
