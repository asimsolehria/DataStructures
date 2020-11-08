
package recursion;

/**
 *
 * @author student
 */
public class Recursion {
    
    public int factorial(int n)
    {
        return n==0?1:n*factorial(n-1);
    }
    
    public int linSum(int []arr, int l)
    {
        return l==0?arr[0]:arr[l]+linSum(arr, l-1);
    }
    
    public void reverseList(int arr[],int i , int j)
    {
        if(i<j)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            reverseList(arr, i+1, j-1);
        }
        
        
    }
}
