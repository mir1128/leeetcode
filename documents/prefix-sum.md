
### 前缀和的核心过程

```java
public class Solution {
    public void function(int nums[]) {
        int ans = 0;
        int pre = 0;
        for(int i = 0; i < nums.length; i++) {
             if (accumulated(i) condition somenumber) {
                pre += 1; 
             } else {
                pre = 0;
             }
             ans += pre;
        }
    }
} 
```