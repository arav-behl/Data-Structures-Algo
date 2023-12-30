import java.util.WeakHashMap;

import javax.lang.model.util.AbstractTypeVisitor14;
import javax.security.auth.kerberos.KerberosCredMessage;
import javax.xml.catalog.CatalogFeatures.Feature;
import javax.xml.transform.Templates;


public class DSA {
    public static void printARR(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // public static void merge(int arr[], int si, int mid, int ei){ // don't understand how these parameters come and work 
    // int temp[] = new int[ei-si+1];
    // int i = si; // iterator for left part
    // int j = mid+1; // iterator for right part
    // int k = 0; // iterator for temp array

    // while(i<= mid && j<= ei){
    //     if(arr[i] < arr[j]){
    //     temp[k] = arr[i];
    //     i++;
    //     } else{
    //         temp[k] = arr[j];
    //         j++;
    //     }
    //     k++;

    // }

    // while(i<= mid){
    //     temp[k++] = arr[i++];
    // }
    // while(j<= ei){
    //     temp[k++] = arr[j++];
    // }

    // // now put numbers from temp array into original array


    // // this is actually a double where you should be iterating over 2 values 

    // for(k=0, i=si; k< temp.length; k++, i++){
    //     arr[i] = temp[k];

    // }

    // }

    // public static void mergesort(int arr[], int si, int ei){
    //     if(si >= ei){ // aisa hai kya ki jab toh ye condition reach nahi hogi tab tak recursive call hoti hi rehgi. yes! coz this is the base case
    //         return;
    //     }
    //     // find mid to divide b/w left & right 
    //     int mid = si + (ei-si)/2;
    //     mergesort(arr, si, mid); // left part
    //     mergesort(arr, mid+1, ei); // right part
    //     merge(arr, si, mid, ei);

    // }

    // public static void mergesort(int arr[], int si, int ei){

    //     // base case of recursion, when we get down to single block,it's great!
    //     if(si>= ei){
    //         return;
    //     }


    //     int mid = si + (ei-si)/2; // do we have to define what si & ei are?- no worries that is given by us in main function
    //     mergesort(arr, si, mid); // mergesort on left part
    //     mergesort(arr, mid+1, ei); // mergesort called on right part, breaking everything down into the left & right parts
    //     merge(arr, si, mid, ei);



    // }

        public static void mergesort(int arr[], int si, int ei){

            int mid = si + (ei-si)/2;
            mergesort(arr, si, arr.length-1); // left part
            mergesort(arr, mid+1, ei); // right part
            merge(arr,si,ei);
        }

        public static void merge(int arr[], int si, int ei){
            int mid =  si + (ei - si)/2;
            // int temp[] = new int[arr.length];  // very big error HERE
            // the temp has a variable length- sometimes it's 1 or 2 or bigger 
            int temp[] = new int[ei-si+1];
            int i = si; //iterator for left array?
            int j = mid+1;
            int k = 0; // initialised to 0, the new array number

            while(i<= mid && j<= ei){
                if(arr[i] < arr[j]){
                    temp[k] = arr[i];
                    i++;
                } else{
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }
            while(i<= mid){
                temp[k] = arr[i];
                i++ ; k++;
            }
            while(j<= ei){
                temp[k] = arr[j];
                j++; k++;
                
            }
            // copy elements from temp back to the array
            

        }











    // public static void merge(int arr[], int si, int mid,int ei){
    //     // we have to merge the small & eventually big elements together 
    //     // first we get iterators for all 3 things
    //     mid = si + (ei-si)/2;
    //     int temp[] = new int[ei-si+1]; // CHANGED FROM ARR.LENGTH
    //     int k = 0; // iterator for temp
    //     int i = si; // iterator for left part
    //     int j = mid+1; // iterator for right part

    //     while(i<=mid && j<= ei){
    //         if(arr[i]<arr[j]){
    //             temp[k] = arr[i];
    //             i++;
    //         } else{
    //             temp[k] = arr[j];
    //             j++;
    //         }
    //         k++;

    //     }
    //     while(i<= mid){
    //         temp[k++]= arr[i++]; // left over elements, can just be added because they are by default bigger and they are sorted
    //     }
    //     while(j<=ei){
    //         temp[k++] = arr[j++];

    //     }

    //     // copy elements from temp array back to original array

    //     // we will need 2 iterators- one for original array and 1 for new temp array
    //     for(k=0,i=si; k< temp.length; k++, i++){  // changed from arr.length -> temp.length
    //         arr[i] = temp[k];

    //     }
    // }

    // public static void quicksort(int arr[], int si, int ei){
    //     // my last element is my pivot 

    //     if(si>= ei){
    //         return;
    //     }
    //     int pidx = partition(arr, si, ei); // the job is to do magic by putting things on the left & right parts from the pivot, and gives me index of pivot
    //     quicksort(arr, si, pidx-1); // left part to be sorted
    //     quicksort(arr, pidx, ei); // right part 
            

    //     }
    // public static int partition(int arr[], int si, int ei){
    //     int pivot = arr[ei];
    //     int i = si-1; // iterator for the changing array

    //     for(int j=si; j<ei; j++){
    //         if(arr[j] <= pivot){ // for original array
    //             i++;
    //             // swap
    //             int temp = arr[j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }
    //     i++; // we do this for the pivot element
    //     int temp = pivot; // we are swapping index of i and the last element here to partition it properly 
    //     arr[ei] = arr[i];
    //     arr[i] = temp;
    //     return i; // we return the index number 
    // }

    // public static void quicksort(int arr[], int si, int ei){

    //     if(si>= ei){
    //         return;
    //     }
    //     int pidx = partition(arr, si, ei);

    //      // we partition it perfectly, then call quicksort on both left & right parts of array
    //     quicksort(arr, si, pidx-1); // left part is till what index 
    //     quicksort(arr, pidx+1, ei); // right part is till what index  
        

        
    // }

    // public static int partition(int arr[], int si, int ei){
    //     int pivot = arr[ei]; // this is the main difficulty in the code boys
    //     int i = si-1;
    //     /*
    //      we primarilhy do swaps here
    //      */

    //     // traverse the array normally
    //     //  for(int j=0; j< arr.length; j++){  // this is the original
    //         for(int j=si; j< ei; j++){


            
    //         // while(arr[j] < arr[i]){ // this is a wrong condition as comparison is with the pivot always 
    //             if(arr[j] <= pivot){ // comparison can simply be made with this constant value 
    //             // swap elements at i & j
    //             i++;
    //             int temp = arr[j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;
    //         }
    //         // now for the special pivot position. swap index of i and ei
    //         i++;
    //         // int temp = arr[ei];
    //         // arr[i] = temp;
    //         // arr[ei] = arr[i];

    //         int temp = pivot; 
    //         arr[ei] = arr[i]; // as ei is empty right now
    //         arr[i] = temp; 
    //         return i;


    //      }

    // }


    public static int rotated_sorted_arr(int arr[], int target, int si,int ei){
        int mid = si+ (ei-si)/2;
        // case FOUND
        if(arr[mid] == target){
            return mid; // mid is the index where we found our value 

        }
        // mid on L1
        if(arr[si] <= arr[mid]){
            
            if(arr[si] >= target){
                // search on the right bruv
                return rotated_sorted_arr(arr, target, mid+1, ei);

            } else{
                // just search on left 
                return rotated_sorted_arr(arr, target, si, mid-1);
            }


        } 

        // mid on L2
        else{
            if(arr[mid] <= target){
                // search on the right bruv
                return rotated_sorted_arr(arr, target, mid, ei);

            } else{
                // just search on left 
                return rotated_sorted_arr(arr, target, si, mid);
            }
        }



    }

    
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 6, 8, 9, 0, -1};
        // int arr[] = { "sun", "earth", "mars", "mercury"};
        // int target = 0;
        mergesort(arr,0, arr.length-1);

        // mergesort(arr,0, arr.length-1);
        // quicksort(arr, 0, arr.length-1);
        // printARR(arr);
        // int target_index = rotated_sorted_arr(arr, target,0, arr.length-1);
        // System.out.println(target_index);
        
    }
    
}

