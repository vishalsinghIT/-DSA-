//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int a[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }
            Solution obj = new Solution();
            int f = 0;
            int idx = obj.peakElement(a);
            int n = a.length;
            if (idx < 0 && idx >= n)
                System.out.println("false");
            else {
                if (n == 1 && idx == 0)
                    f = 1;
                else if (idx == 0 && a[0] > a[1])
                    f = 1;
                else if (idx == n - 1 && a[n - 1] > a[n - 2])
                    f = 1;
                else if (idx > 0 && idx < n && a[idx] > a[idx + 1] &&
                         a[idx] > a[idx - 1])
                    f = 1;
                else
                    f = 0;
                if (f == 1) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    public int peakElement(int[] arr) {
        // code here
        // length of array 
        int n=arr.length;
        
        // array with zero elements 
        if(n==0)
        {
            return -1;
        }
        // if array contain one elements
        if(n==1)
        {
            return 0;
        }
        for(int index=0; index<n; index++)
        {
            // first elements
            if(index==0)
            {
                if(arr[index]> arr[index+1])
                {
                    return index;
                }
            }
            else if(index==n-1)
            {
                if(arr[index] > arr[index-1]) //last elements
                {
                    return index;
                }
            }else{
                if(arr[index]>arr[index+1] && arr[index]> arr[index-1])
                {
                    return index;
                }
            }
            
        }
        return -1;
    }
}
