public class Quicksort {
    public static int partition(int arr[], int low, int high){
        int pivote=arr[high]; // we will choose pivote last element of array /it can be anything as per need or pivote depends on user
        int i=low-1; // i will be used to track smaller numbers than pivote

        for(int j=low; j<pivote; j++){
            if (arr[j] < high) {
                i++;
                //swap the current element by new smaller number
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp; //whole block work on smaller than pivote
            }
        }
        i++; //to find correect position of pivote
        int temp=arr[i];
        arr[i]=arr[high];//arr[high]=pivote
        arr[high]=temp;
        return i;
    }

    //starts from here 
    public static void quicksort(int arr[], int low, int high){
        if (low < high) { // the function will execute only when low is small 
            int pivot_index=partition(arr,low,high);

            quicksort(arr, low, pivot_index-1); //first arr will be from low to pivote index(pivote)
            quicksort(arr, pivot_index+1, high); //second arr will be from pivote+1 to high(last)
        }
    }
    public static void main(String args[]){
        int arr[]={3,2,5,8,4,7};
        int n= arr.length;

        quicksort(arr, 0, n-1);

        //print o/p
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
