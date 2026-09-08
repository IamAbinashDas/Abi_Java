public class Grid {//Allowed Path:Down&Right
    public static int gridWays(int i,int j,int n,int m){//TC-O(2^(n+m)) :- exponential ie too bad
        //base case
        if(i==n-1 && j==m-1){//last cell cond
            return 1;
        }else if(i==n||j==m){//boundary cross cond
            return 0;
        }

        int w1=gridWays(i+1, j, n, m);
        int w2=gridWays(i, j+1, n, m);
        return w1+w2;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
/*Another optimize method ->TC-O(n) Linear
By using math formula ie 
total ways=(n-1+m-1)!/(n-1)!(m-1)!
where, 
    total char=n-1+m-1
    Down=n-1(reapeting)
    Right=m-1(reapeting)
 */
