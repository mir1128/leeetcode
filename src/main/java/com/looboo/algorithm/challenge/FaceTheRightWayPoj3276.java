package com.looboo.algorithm.challenge;

public class FaceTheRightWayPoj3276 {
    public int[] faceTheRightWay(char[] cows) {
        int n = cows.length;
        int[] res = new int[2];

        res[0] = cows.length;
        res[1] = -1;

        char[] arr = new char[cows.length];
        for (int k = 1; k <= n; k++) {
            System.arraycopy(cows, 0, arr, 0, cows.length);
            int cnt = 0;
            for (int i = 0; i <= n - k; i++) {
                if (arr[i] == 'F') continue;
                cnt++;
                for (int j = i; j < i + k; j++) {
                    arr[j] = (arr[j] == 'B' ? 'F' : 'B');
                }
            }
            boolean isFit = true;
            for (int i = n - k; i < n; i++) {
                if (arr[i] == 'B') {
                    isFit = false;
                    break;
                }
            }
            if (isFit && cnt < res[0]) {
                res[0] = cnt;
                res[1] = k;
            }
        }
        return res;
    }
}
