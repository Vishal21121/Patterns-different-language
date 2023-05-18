public static void main(String[] args) {

    final int length = 10;

    for (int i = 1; i < length; i++) {

        //Print spaces first
        for (int j = length - 1; j > i; j--) {
            System.out.print(" ");
        }

        //Then print "*"
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}