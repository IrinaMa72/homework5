public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        1 задача
        int[] firstArr = new int[3];
        firstArr[0] = 1;
        firstArr[1] = 2;
        firstArr[2] = 3;

        double[] secondArr = {1.57, 7.654, 9.986};

        int[] seasons = new int[4];
        seasons[0] = 10_000;
        int winterPrice = seasons[0];
        int winter = 0;
        seasons[1] = 20_000;
        int springPrice = seasons[1];
        seasons[2] = 30_000;
        int summerPrice = seasons[2];
        seasons[3] = 5_000;
        int autumnPrice = seasons[3];

//        2 задача
        for (int i = 0; i < firstArr.length; i++) {
            if (i == firstArr.length - 1) {
                System.out.print(firstArr[i]);
            } else {
                System.out.print(firstArr[i] + ", ");
            }
        }
            {
                System.out.println();
            }
            for (int i = 0; i < secondArr.length; i++){
                if (i >= secondArr.length - 1) {
                    System.out.print(secondArr[i]);
                } else {
                    System.out.print(secondArr[i] + ", ");
                }}
            {
                System.out.println();
            }
            for (int i = 0; i < seasons.length; i++){
                if (i >= seasons.length - 1) {
                    System.out.print(seasons[i]);
                } else {
                    System.out.print(seasons[i] + ", ");
                }
            {
                System.out.println();
            }}
            //        3 задача
            for (int i = firstArr.length - 1; i >= 0; i--){
                if (i <= 0) {
                    System.out.print(firstArr[i]);
                } else {
                    System.out.print(firstArr[i] + ", ");
                }
            {
                System.out.println();
            }}

            for (int i = secondArr.length - 1; i >= 0; i--){
                if (i <= 0) {
                    System.out.print(secondArr[i]);
                } else {
                    System.out.print(secondArr[i] + ", ");
                }}
            {
                System.out.println();
            }
            for (int i = seasons.length - 1; i >= 0; i--){
                if (i <= 0) {
                    System.out.print(seasons[i]);
                } else {
                    System.out.print(seasons[i] + ", ");
                }
                {
                    System.out.println();
                }
                }
//                  4 задача
        for (int i =0; i<firstArr.length; i++){
            if (firstArr[i]%2==1)
            firstArr[i] ++;

            if (i<firstArr.length-1) {
                System.out.print(firstArr[i] + ", ");
            }
              else {
                System.out.print(firstArr[i]);
            }
                }

        }
    }
