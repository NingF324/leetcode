package daily1;

import java.util.*;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/29 22:34
 */
public class DiagonalSort001 {
    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i < m; i++){
            List<Integer> li = new ArrayList<>();
            for(int p = i, q = 0; p < m && q < n; p++, q++){
                li.add(mat[p][q]);
            }
            Collections.sort(li);
            for(int p = i, q = 0; p < m && q < n; p++, q++){
                mat[p][q] = li.get(q);
            }
        }
        for(int j = 1; j < n; j++){
            List<Integer> li = new ArrayList<>();
            for(int p = 0, q = j; p < m && q < n; p++, q++){
                li.add(mat[p][q]);
            }
            Collections.sort(li);
            for(int p = 0, q = j; p < m && q < n; p++, q++){
                mat[p][q] = li.get(p);
            }
        }
        return mat;
    }
}
