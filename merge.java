public class merge {

    public static void conquer(int arr[], int si,int mid, int ei){
        // create new temparory array to store result
        int merged[]=new int[ei - si + 1];

        int idx1=si; //it will track index of divided array-1
        int idx2=mid+1; //it will track index of divided  array-2
        int x=0; //it will track index of merged(new) array

        while (idx1 <= mid && idx2 <= ei) {
            if (idx1 <= idx2) { // if element of array-1 is small then it will go in new array (merged)
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            else{ //if element of array-2 is smaller then it will go in new array(merged)
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
        }
        //we need another while due to,if size of both array-1 and array-2 is not same then some elements will left inside big array
        while (idx1 <= mid) {
                merged[x]=arr[idx1];
                x++;
                idx1++;
        }
        //we need another while due to,if size of both array-1 and array-2 is not same then some elements will left inside big array
        while (idx2 <= ei) {
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }
        // during above while execution only one while loop executes at one time 

        //to copy merged array into main sorted array
        for(int i=0 , j=si; i< merged.length; i++, j++){
            arr[j]=merged[i];
        }
    }
    //while understanding the code start from here then go to conqure function
    public static void divide(int arr[], int si,int ei){
        if(si >= ei){
            return;
        }
        int mid=si + (ei - si)/2; // (si+ei)/2
        divide(arr, si, mid); // array-1 while dividing from one array / left half
        divide(arr, mid+1 ,ei); // array-2 while dividing from one array / right half
        conquer(arr, si, mid, ei); //to rebuild one array from multiple
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,9,5};
        int n=arr.length;

        divide(arr, 0, n - 1);//calling function
        //print final array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
