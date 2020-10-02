### 滑动窗口标准模板

```java
public class MinSubArrayLen209 {

    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int right = -1;

        int sum = 0;
        int minLength = nums.length + 1;  //防止全部数组和仍然小于s
        for (int i = 0; i < nums.length; i++) {
            right = i;
            sum += nums[right];

            while (sum >= s) {
                if (minLength > right - left + 1) {
                    minLength = right - left + 1;
                }
                sum -= nums[left];
                left += 1;
            }
        }
        return minLength > nums.length ? 0: minLength;
    }
}
```

`atMost方法`
求数组nums[]中，最多连续k个，满足某一条件的所有数组个数，或者最长的子序列长度问题

```java
public class SubarraysWithKDistinct992 {
    public int subarraysWithKDistinct(int[] A, int K) {
        return atMost(A, K) - atMost(A, K-1);
    }
        
    private int atMost(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap();
        
        int left = 0;
        int result = 0;
        for(int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) k-= 1;
            map.compute(A[i], (key, value) -> value == 0? 1: value+1);
            
            while (k < 0) {
                map.compute(A[left++], (key, value) -> value-1);
                if (map.values().removeIf(value -> value.equals(0))) {
                    ++k;
                }
            }
            result += i - left + 1;
        }
        return result;
    }
}
```
