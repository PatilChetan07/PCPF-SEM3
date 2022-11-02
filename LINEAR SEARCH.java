import java.util.Scanner;

public class Main{
    public static void main(String args []){
        int [] a = new int [50];
        int flag = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the elements in the array");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("enter the element to search in array");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i] == x){
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("element is present in array \n");
        }
        else{
            System.out.println("element is not present in array \n");
        }
    }
}
