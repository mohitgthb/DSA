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

    public void pairSumOp(int arr[]){  //Two sum approch O(nlogn)
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

// Interview Cross Questions They May Ask
//      What if array is already sorted?

//      What if duplicates exist?

//      What if negative numbers?

//      What if we must not sort?

//      Can we do in O(n)?

// Answer: Use HashSet
    public void pairSumHashSet(int arr[]){  //using hashset O(n)
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            int target = 20 - num;

            if(set.contains(target)){
                System.out.println(num + " " + target);
            }

            set.add(num);
        }
    }
}

public class Array {
    public static void main(String[] args){
        int arr[] = {5, 7, 5, 10, 10, 15};

        Solution s = new Solution();

        //s.pairSum(arr);
        //s.pairSumOp(arr);
        s.pairSumHashSet(arr);
    }
}
