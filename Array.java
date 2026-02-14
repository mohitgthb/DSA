import java.util.*;

class Solution {
    public void pairSum(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == 20){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    } //time complexity O(n^2)

    public void pairSumOp(int arr[]){  //Two sum approch O(n)
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == 20){
                System.out.println(arr[left] + " " + arr[right]);
                left++;
                right--;
            } else if(sum < 20){
                left++;
            } else {
                right--;
            }

        }
    }
}

public class Array {
    public static void main(String[] args){
        int arr[] = {5, 7, 5, 10, 10, 15};

        Solution s = new Solution();

        //s.pairSum(arr);
        s.pairSumOp(arr);
    }
}
