package recursion;
import java.util.Scanner;
public class main {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int N1, N2;
        Recursion recObj = new Recursion();
        
        int choice;            
        while(true)
        {
            System.out.println("\n########## RECURSION MENUE ##########");
            System.out.println("\t1. Euclidean GCD");
            System.out.println("\t2. Fibonacci Term");
            System.out.println("\t3. Fibonacci Series");
            System.out.println("\t4. Triangular Series");
            System.out.println("\t5. Sum of Squares");
	    System.out.println("\t6. Factorial ");
            System.out.println("\t7  Linear Sum of an Array");
            System.out.println("\t8  Reverse an Array");
            System.out.println("\t0. Exit Programe");
            
            System.out.println("------------------------------------");
            System.out.print("Enter Your Choice (0/1/2/3/4/5/6/7/8) : ");
            
            choice =  input.nextInt();
            
            if(choice == 1)
            {
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter First Number ");
                N1 = input.nextInt();
                System.out.print("\nEnter Second Number ");
                N2 = input.nextInt();
                int GCD = recObj.gcd(N1, N2);
                System.out.print("\nThe GCD of "+N1+" and "+N2+" : "+GCD);
            }
            else if(choice == 2)
            {
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter Number for Fib Term : ");
                int F = input.nextInt();
                int Term = recObj.Fibonacci(F);
                System.out.print("\nThe "+F+"th Term of Fibonacci Seireis is "+Term);
                
		
            }
            else if(choice == 3)
            {
		
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter Number of Fib Terms : ");
                int N = input.nextInt();
                int Term;
                for(int i=1; i<=N; i++)
                {
                    Term = recObj.Fibonacci(i);
                    System.out.print(Term+" ");
                }
                System.out.println();
                System.out.println("\n------------------------------------");
		
                
            }
            else if(choice == 4)
            {
		
                System.out.println("\n------------------------------------");
                System.out.print("Enter the Triangular Series Range : ");
                int R = input.nextInt();
                int Term = 0;
                System.out.println("The Triangular Series : ");
                for(int i=1; i<=R; i++)
                {
                    Term = recObj.Triangular(i);
                    System.out.print(Term+" ");
                }
                System.out.println();
                System.out.println("\n------------------------------------");
	
                
            }
            else if(choice == 5)
            {
		
                System.out.println("\n------------------------------------");
                System.out.print("Sum of Square Range: ");
                int R = input.nextInt();
                System.out.print("The Sum of First"+R+" integers:");
                int SUM = recObj.squareSum(R);
                System.out.println(SUM);
                System.out.println("\n------------------------------------");
                
            }
	    else if(choice == 6)
            {
		
                System.out.println("\n------------------------------------");
                System.out.print("Enter Number to Find its Factorial : ");
                int N = input.nextInt();
                System.out.print("The Factorial of "+N+" :");
                int Fact = recObj.factorial(N);
                System.out.println(Fact);
                System.out.println("\n------------------------------------");
		

                
            }
	    else if(choice == 7)
            {
		
                System.out.println("\n------------------------------------");
                System.out.print("Enter array elements to get sum!");
                int arr[]=new int[10];
                for (int i = 0; i < 10; i++) {
                    System.out.println("\nEnter array element #"+(i+1));
                    arr[i]=input.nextInt();
                }
                int sum=recObj.linSum(arr, arr.length-1);
                System.out.print("Sum of given array elements is :");
                System.out.println(sum);
                System.out.println("\n------------------------------------");
		

                
            }
	    else if(choice == 8)
            {
		
                System.out.println("\n------------------------------------");
                System.out.print("Enter array elements to get reverse array!");
                int arr[]=new int[10];
                for (int i = 0; i < 10; i++) {
                    System.out.println("\nEnter array element #"+(i+1));
                    arr[i]=input.nextInt();
                }
                recObj.reverseList(arr, 0, arr.length-1);
                System.out.print("Reverse of given array is :\n");
                for (int i : arr) {
                    System.out.println(i);
                }
                System.out.println("\n------------------------------------");
		

                
            }
          
            else if(choice == 0)
            {
                System.out.println("\n--------------------------------");
                System.out.println("Programe Exiting.......! \nThank You for Being Here");
                System.out.println("\n--------------------------------");
                System.exit(0);
            }
        }
    
    }
    
}
