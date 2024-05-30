package basics;

public class Main {

    public static void program1() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void program2() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ___*
    //__**
    // _***
    // ****
    //spaces = n-i
    public static void program3() {
        int n = 5;
        for (int i = 1; i < n; i++) {
            int spaces = n - i;
            for (int j = 1; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *****
    // *   *
    // *   *
    // *****
    // stars are at (11) (12) (13) (14) (15)
    // (21) (25) (31) (35) (41) (45) (51) (55)
    // (41)...(45)
    // either i=1 or i=4 or j=1 or j=4
    public static void program4() {
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < m; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5

    public static void program5() {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //    1 2 3 4 5
//    1 2 3 4
//    1 2 3
//    1 2
//    1
    public static void program6() {
        int n = 5;
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

//    1
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1
// i+j = even print
// i+j = odd print 0

    public static void program7() {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    //BUTTERFLY
    // *      *  2 stars 6 spaces
    // **    **  4 stars 4 spaces
    // ***  ***  6 stars 2 spaces
    // ********  8 stars 0 spaces
    // ********
    // ***  ***
    // **    **
    // *      *
    public static void program8() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    ***** 4 space 5 star
    //   *****  3 space 5 star
    //  *****   2 space 5 star
    // *****    1 space 5 star
    //*****     0 space 5 star
    public static void program9() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // int space= n-i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//        1      4 space
//       2 2     3 space
//      3 3 3    2 space
//     4 4 4 4   1 space
//    5 5 5 5 5  0 space
    public static void program10() {


        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

//                  1
//                2 1 2
//              3 2 1 2 3
//             4 3 2 1 2 3 4
//            5 4 3 2 1 2 3 4 5

    public static void program11(){
        int n=5;
for(int i= 1; i<=n; i++){
    int space= n-i;
    for(int j=1; j<=space; j++){
        System.out.print(" ");
    }
    for(int j= i; j>1; j--){
        System.out.print(j + " ");
    }
    for(int j=1; j<=i; j++){
        System.out.print(j+ " ");
    }
    System.out.println();
}
    }

        public static void main (String[]args){
            program11();



    }
}
