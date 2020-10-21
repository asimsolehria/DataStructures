package sortingapp;

public class SortingAlgos 
{
    private int bSwap;
    private int bComp;
    
    void SortingAlgos()
    {
        bSwap = 0;
        bComp = 0;
    }
    
    public void BubbleSort(int array[])
    {

        for (int i = 0; i < array.length-1; i++) 
        {
            for (int j = 0; j < array.length-1-i; j++) 
            {
                if(array[j]>array[j+1]){
                    int temp;
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }  
    
    }
    public void selectionSort(int array[])
    {
        for (int i = 0; i < array.length-1; i++) 
        {
            int min=i;
            for (int j = i+1; j < array.length; j++) 
            {
                if(array[j]<array[min])
                    min=j;
            }
            
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }
    
    public void PrintList(int List[])
    {
        for(int i=0; i<List.length; i++)
        {
            System.out.print(List[i]+" ");
        }
        
    }
    
    public void PrintReport()
    {
        System.out.println("----------------------------------");
        System.out.println("\t Comparison Chart");
        System.out.println("----------------------------------");
        System.out.println("Bubble Sort Comparisons    : "+bComp);
        System.out.println("Bubble Swaps Swaps         : "+bSwap);
        
    }
    
}
