import java.util.Arrays;
import java.util.Collections;
public class sorting {
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
       }
    }

    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);//left
        mergeSort(arr, mid+1, ei);//right
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void quickSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int pIdx=partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);//left
        quickSort(arr, pIdx+1, ei);//right
    }

    /*if the value of pivot is always a smallest or largest then the worst time complexcity is comes ie O(2) =>in case of sorted array*/

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;//make space

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
            i++;
            //swap
            int temp=pivot;
            arr[ei]=arr[i];
            arr[i]=temp;
            return i;
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8,-2};//use object for reverse an sorted array
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //Arrays.sort(arr);
        //Arrays.sort(arr,Collections.reverseOrder());
        //countingSort(arr);
        //mergeSort(arr,0,arr.length-1);
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
