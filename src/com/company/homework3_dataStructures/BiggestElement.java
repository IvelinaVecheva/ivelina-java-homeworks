package com.company.homework3_dataStructures;

import java.util.*;

public class BiggestElement {
    public static void main(String[] args) {

        int arr[] = {10, 20, 25, 63, 96, 57, -5};

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);

    }
}
