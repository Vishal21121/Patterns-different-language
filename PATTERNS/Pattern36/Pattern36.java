public class Pattern36 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= (n + 1) / 2) {
                    if (i == 1 && (j == 1 || j >= (n + 1) / 2)) {
                        System.out.print("* ");
                    } else if (i > 1 && j == (n + 1) / 2 || j == 1) {
                        System.out.print("* ");
                    } else if (i == (n + 1) / 2) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (i < n && (j == (n + 1) / 2 || j == n)) {
                        System.out.print("* ");
                    } else if (i == n && (j <= (n + 1) / 2) || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
