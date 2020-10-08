/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp;
import java.util.Scanner;

/**
 *
 * @author INAM
 */
public class MyArray 
{
    int size;
    int List[];
    Scanner input;
    
    void MyArray(int S)
    {
        size = S;
        List = new int[size];
        input = new Scanner(System.in);
    }
    
    void FillArray()
    {
        //Using input get values from user
        //Put values in Array
    }
    
    int FindElement()
    {
        //Get Search Key from User using input
        //Serach from first element to last in array
        //Return -999 if key not found
        //otherwise return Index of key
    }
    
    void DelElement()
    {
        //get key to be deleted
        //Search Key
        //if found Delete and replace all other elements
        //otherwise NOT FOUND MESSAGE
    }
    void ModifyElement()
    {
        //Get new value from user
        //Get key to be modified
        //Replace old value with new if found
    }
    
    void DisplayArray()
    {
        //Display All Elements in Array
    }
    
    
    
}
