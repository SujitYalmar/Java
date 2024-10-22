package com.company;

public class cwh_29_array_practice_sets {
    public static void main(String[] args) {
        //problem number 1
        /*
        int [] marks = {85,78,98,54,78};

        int sum =0;
        for (int element: marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is : " + sum);
        */
        // problem number 2
        /*
        int [] marks = {85,78,98,54,78};
        int num = 94;
        boolean isINArray = false;
        for (int element: marks) {
            if (num == element) {
                isINArray = true;
                break;
            }
        }
        if (isINArray){
            System.out.println("The number is in list ");
        }
        else{
            System.out.println("The number is not in list ");

        }


        // Problem number 3
        float [] physics = {85.8f,78.5f,98.4f,54.8f,78.9f};
        float sum = 0;
        for (float element: physics) {
            sum = sum + element;
        }
        System.out.println("The Average value of physics is : "+ sum / physics.length);
        */
        /*

          // Practice Problem 4
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" "); // Prints a new line
        }

         */
        /*
        //problem number 5
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int l = arr.length;
        int  n = Math.floorDiv(l,2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

         */
        //Problem number 6
        /*
        int [] arr = {45,65,32,445,78,545,64,258,854,546,68,325,36,45,25};
        int max = 0;
        for (int element: arr){
            if (element>max){
                max = element;
            }
        }
        System.out.println("the maximum value of this array is : " + max);

        }
    }

         */
        //problem number 7
        /*
        int [] arr = {45,65,32,445,78,545,64,258,854,546,68,325,36,45,25,1};
        int min = 45;
        for (int element: arr){
            if (element < min){
                min = element;
            }
        }
        System.out.println("the minimum value of this array is : " + min);

    }
}

         */
        //problem number:8
        int[] arr = {6, 25, 32, 52, 85, 98};
        boolean issorted = true;
        for (int i=0; i<arr.length -1; i++) {
            if (arr[i]>arr[i+1]) {
                issorted = false;
                break;
            }
        }
        if (issorted) {
            System.out.println("The list is sorted");
        }
        else {
            System.out.println("The list is not sorted");
        }
    }
}

