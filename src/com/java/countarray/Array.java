package com.java.countarray;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Array {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        int[] copied = new int[ar.length];
        
        for(int x = 0; x < n; x++){
        	if(exist(copied, ar[x]) == false) {
        		copied[x] = ar[x];
        		int currcount = 0;
            	for(int z = 0; z < n; z++) {
            		if(ar[x] == ar[z]) {
            			currcount++;
            		}
            	}
            	
        		int res = currcount / 2;
        		count+=res;
        	}
        }
        return count;
    }
    
    static boolean exist(int[]ar, int num) {
    	for(int x = 0; x < ar.length; x++) {
    		if(ar[x] == num) {
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        
        System.out.println("result : " + result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
