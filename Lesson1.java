public class Lesson1 {


    public static void main(String[] args) {
        System.out.println("Hello!");

        printThreeWords();
        checkSumSign();
        printColor();
       System.out.print(betweenNum(10, 5) + "\n");

       printPositiveNegative(3);

       System.out.println(numPositive(-15));

        printWords("Hello", 3);

        System.out.println(leapYear(2025));

        myArray();
        myArray2();
        myArray3();
        myArray4(5,5);
        myArray5(5,7);

    }

        static void printThreeWords() {
 String word = "Orange", word1 = "Banana", word2 = "Apple";
            System.out.println(word);
            System.out.println(word1);
            System.out.println(word2);
    }

    static void checkSumSign() {
        int a = 5, b = 10;
        int sum = a+b;
        if(sum>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        }

        static void printColor() {
        int value = 150;
        if(value <=0) {
            System.out.println("Красный");
        }
        else if(value >0 && value<=100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
        }

    static boolean betweenNum(int a, int b) {
        int c = a+b;
        boolean less = (c>=10);
        boolean more = (c<=20);
        if(less && more) {
            return true; }
        else {
            return false;
        }
        }
        static void printPositiveNegative(int num) {
        String result = "Positive";
                if(num<0) result = "Negative";
                System.out.println(result);
        }

        static boolean numPositive(int a) {
        return a>0;
        }

        static void printWords(String word, int c) {
        for(int i=1; i<=c; i++) {
            System.out.println(i + ")" + word);
        }
        }

        static boolean leapYear(int num) {
        if(num % 400 == 0) {
            return true;
        } else if(num % 100 == 0) {
            return false;
        } else {
            return num % 4 == 0;
        }
        }

        static void myArray() {

            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            int array = arr.length;
            for (int i = 0; i < array; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }
            System.out.println("Massive: ");
            for (int i = 0; i < array; i++) {
                System.out.println(arr[i]);
            }
        }

    static void myArray2() {
        int[] array = new int[8];
        int a = 0;
        int num = array.length;
        System.out.println(" ");
        System.out.println("Massive 2: ");
        for(int i = 0; i < num; ++i, a = a+3) {
            array[i] = a;
            System.out.print(+ array[i] + " ");
            System.out.println(" ");
        }
    }
    static void myArray3() {
        int[] ray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arr1 = ray.length;
        for (int i = 0; i < arr1; i++) {
            if (ray[i] < 6)
                ray[i] = ray[i] * 2;
        }
        System.out.println(" ");
        System.out.print("Massive 3:  ");

        for (int i = 0; i < arr1; i++) {

            System.out.print(+ray[i] + ", ");
        }
    }
    static void myArray4(int a, int b) {

        int[][] sarr = new int[a][b];
        System.out.println("");
        System.out.println("Massive 4:");

        for (int i = 0; i < sarr.length; i++) {
            for (int j = 0; j < sarr.length; j++) {
                sarr[i][i] = 1;
                System.out.print(sarr[i][j] + " ");
            }
            System.out.println();
        }
    }

     static int[] myArray5(int len, int initialValue) {
         int array2[] = new int[len];
         int arr1 = array2.length;
         for (int i = 0; i < arr1; i++) {
             array2[i] = initialValue;
         System.out.println(array2[i]); }

         return array2;
     }
    }



