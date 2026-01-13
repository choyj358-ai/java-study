package algo;

import java.util.Random;

public class LottoApp {
    public static void main(String[] args) {
        int count= 0;
        int[] arr = new int[6];
        Random r = new Random();
        int n;
//        n = r.nextInt(45)+1;//1~45
//        System.out.println(n);
//        n = r.nextInt(45)+1;
//        System.out.println(n);


        for (int i = 0; i < arr.length; i++) {
            n = r.nextInt(45)+1;
            arr[i] = n;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ",");
        }

        /**
         * 1. 랜덤 숫자를 생성함
         * 2. 랜덤 숫자가 배열에 없다면 넣는다.
         * 3. arr[count] = 랜덤숫자
         * 카운트를 1증가 시킨다.
         *
         * 3. 랜덤 숫자가 배열에 존재함
         * 카운트 증가시키지 않음
         *
         *
         *
         */




        // 중복 발생 되지 않도록 설계



    }
}
