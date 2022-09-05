package sheet.Day3;

//Pow(X,n)

//https://leetcode.com/problems/powx-n/submissions/

public class D3P2 {

    public double myPow(double x, int n) {

        long nn = n;
        if(n<0) nn = -1 * nn;

        double ans = 1.0;

        while(nn !=0){

            if(nn%2 ==0){
                x =x*x;
                nn  = nn /2;

            }
            else{
                ans = ans *x;
                nn = nn -1;
            }
        }
        if(n <0){
            return (double)1.0 /(double) ans;
        }
        return ans;
    }
}
