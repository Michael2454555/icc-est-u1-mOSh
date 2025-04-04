package controller;

public class ShellSort {
    
    public void sort (int[] arr, boolean isDes){
        
        int n= arr.length;
        for (int gap = n/2;gap>0;gap/=2){
            int contCambios=0;
            for(int i= gap; i<n;i++ ){
                int temp = arr[i];
                int j=i; 
                if(isDes){
                    while(j>= gap && arr[j- gap] < temp){
                        arr[j] = arr[j-gap];
                        j-=gap;
                        contCambios++;
                }
            }
                else{
                    while(j>= gap && arr[j- gap] > temp){
                        arr[j] = arr[j-gap];
                        j-=gap;
                        contCambios++;
                }
                }
                arr[j]=temp;
            }
        System.out.println(contCambios  +" cambios en gap "+ gap);
            printArray(arr);
            

        }
        
    }
    public void printArray(int[] a){
        for (int num : a){
            System.out.print(num + ",");
        }
        System.out.println();
        
    }
}