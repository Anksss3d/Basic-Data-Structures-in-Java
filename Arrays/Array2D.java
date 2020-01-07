/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;
import java.util.Scanner;

/**
 *
 * @author ankss
 */
public class Array2D {
    int arr[][];
    int M, N;
     public Array2D(int m, int n){
         this.arr = new int[m][n];
         this.M = m;
         this.N = n;
         for(int i=0; i<this.M; i++){
             for(int j=0; j<this.N; j++){
                 this.arr[i][j] = Integer.MIN_VALUE;
             }
         }

     }
     
     public void getValues(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter all Numbers: ");
         for(int i=0; i<this.M; i++){
             for(int j=0; j<this.N; j++){
                 this.arr[i][j] = sc.nextInt();
             }
         }
     }
     
     public void traverse(){
         for(int i=0; i<this.M; i++){
             for(int j=0; j<this.N; j++){
                 System.out.print(arr[i][j] + "\t");
             }
             System.out.println("");
         }
     }
     
     public int getValue(int i, int j){
         try {
             return arr[i][j];
         } catch (Exception e) {
             System.out.println("Wrong Index, sending Default Value");
             return Integer.MIN_VALUE;
         }  
     }
     
     
     public int[] searchArray(int value){
         for(int i=0; i<this.M; i++){
             for(int j=0; j<this.N; j++){
                 if(arr[i][j] == value){
                     int[] a = {i, j};
                     return a;
                 }
             }
         }
         int[] a = {-1, -1};
         return a;
     }
     
     
     public void deleteValue(int i, int j){
         if(arr[i][j] == Integer.MIN_VALUE){
             System.out.println("Already Blank Value");
         }
         else{
             arr[i][j] = Integer.MIN_VALUE;
         }
     }
     
     public void InsertValue(int value, int i, int j){
         if(arr[i][j] == Integer.MIN_VALUE){
             arr[i][j] = value;
         }
         else{
             System.out.println("position is not empty");
         }
     }
}
