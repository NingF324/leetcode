package programMercarl.array;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/12 上午9:00
 */
public class q5_59 {
    public int[][] generateMatrix(int n) {
        int[][] result =new int[n][n];
        int offset=1;
        int loop=1;
        int startX=0,startY=0;
        int count=1;
        int i,j;
        while(loop <= n/2){
            for(j=startX;j<n-offset;j++){
                result[startY][j]=count;
                count++;
            }
            for(i=startY;i<n-offset;i++){
                result[i][j]=count;
                count++;
            }
            for(;j>startX;j--){
                result[i][j]=count;
                count++;
            }
            for(;i>startY;i--){
                result[i][j]=count;
                count++;
            }
            loop++;
            startX++;
            startY++;
            offset++;
        }
        if(n%2==1){
            result[n/2][n/2]=count;
        }
        return result;
    }
}
