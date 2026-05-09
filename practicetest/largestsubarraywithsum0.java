package practicetest;

import java.util.HashMap;

public class largestsubarraywithsum0 {
    static int largesubaaray(int arr[],int n){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int maxlen=0;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==0){
                return i+1;
            }
            if(mp.containsKey(sum)){
                int previndx=map.get(sum);
                maxlen=Math.max(maxlen,i-previndx);
            }
            else{
                map.put(sum,i);
            }

        }
        return maxlen;
    }
}
