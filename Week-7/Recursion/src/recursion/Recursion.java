
package recursion;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
/**
 *
 * @author student
 */
public class Recursion {
    
    //Method for calculating factorial of an integer
    public int factorial(int n)
    {
        return n==0?1:n*factorial(n-1);
    }
    
    
    //Method for calculating linearly sum of an array elements 
    public int linSum(int []arr, int l)
    {
        return l==0?arr[0]:arr[l]+linSum(arr, l-1);
    }
    
    
    //Method for reversing elements of an array
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
    
    //Method for calculating euclidean GCD of a number
    public int gcd(int a , int b)
    {
        return b==0?a:gcd(b,a%b);
    }
    
    
    //Method for calculating terms of fibonacci series 
    public int Fibonacci(int nth)
    {
        return nth<=1?nth:Fibonacci(nth-1)+Fibonacci(nth-2);
    }
    
    
    //Method for calculating triangular terms(sum of a triangular term i,e 3,6,10) 
    public int Triangular(int n)
    {
        return n==1?1:n+Triangular(n-1);
    }
    
    
    //Method for calculating sum of sqaure of series 
    public int squareSum(int n)
    {
        return n==1?1:(n*n)+squareSum(n-1);
    }
    
    
    //Method for calculating binary sum of an array elements via binary recursion 
    public int BinarySum(int A[] , int i, int n)
    {
        return n==1?A[i]:BinarySum(A, i, (int)ceil((double)n/2))+BinarySum(A, (int)(i+ceil((double)n/2)), (int)floor((double)n/2));
    }
    
    //Binary search Method
    
    public int binarySearch(int A[] , int i,int t,int k)
    {
        if(t>=i)
        {
            int mid=i+(t-i)/2;
            if(A[mid]==k)
                return mid;
            if(A[mid]>k)
                return binarySearch(A, i, mid-1, k);
            return binarySearch(A, mid+1, t, k);
        
        }
        return -1;
    }
    
    public int intSum(int n)
    {
        return n>0?(n%10)+intSum(n/10):n;
        
    }
}
