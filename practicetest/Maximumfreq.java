package practicetest;

import java.util.HashMap;

public class Maximumfreq {
    public static void main(int arr[],int n) {
        int maxfreq=0;
        HashMap <Integer,Integer>mp=new HashMap<>();
        for(int nums:arr){
            mp.put(nums,mp.getOrDefault(nums,0)+1);
        }
        int ans=Integer.MAX_VALUE;

        for(int key:mp.keySet()){
            int freq=mp.get(key);
            if(freq>maxfreq||(maxfreq==freq && key<ans)){
                ans=key;
                maxfreq=freq;
            }
        }
        return ans;
    }
}
