public class recursion{
    public static void allOccurences(int arr[],int  key,int i) {
        if(i==arr.length) {
            return;

        }
        if(arr[i] ==key) {
            System.out.print(i+" ");}
            allOccurences(arr,key,i+1);
      
    }

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int number) {
        if(number==0) {
            return;
        }
        int lastDigit=number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static int length(String str) {
        if(str.length() ==0) {
            return 0;
        }
        return length(str.substring(1)) +1;
}

public static int countSubstrs(String s,int i,int j,int n) {
    if(n==1) {
        return 1;
    }
    if(n<=0) {
        return 0;
    }
    int res=countSubstrs(s,i+1,j,n-1)+
    countSubstrs(s,i,j-1,n-1)-
    countSubstrs(s,i+1,j-1,n-2);
    if(s.charAt(i) ==s.charAt(j)) {
        res++;
    }
    return res;
}

public static void towerOfHanoi(int n1,String src,String helper,String dest) {
    if(n1==1) {
        System.out.println("transfer disk "+n1+"from "+src+" to "+dest);
        return;
    }

    //transfer top n-1 from src to helper usingdest as 'helper'
    towerOfHanoi(n1-1,src,dest,helper);
    //transfer nth from src to dest
    System.out.println("transfer disk "+n1+"from "+src+" to "+helper);
    //transfer n-1 from helper to dest using srcas 'helper'
    towerOfHanoi(n1-1,helper,src,dest);
}

    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key=2;
        allOccurences(arr,key,0);
        System.out.println();

        printDigits(1234);
        System.out.println();

        String str="abcde";
        System.out.println(length(str));

        String s="abcab";
        int n=s.length();
        System.out.println(countSubstrs(s,0,n-1,n));

        int n1=4;
        towerOfHanoi(n1,"A","B","C");

    }
}