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

