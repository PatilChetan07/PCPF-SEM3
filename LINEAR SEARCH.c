#include <stdio.h>
void main(){
    int a[50];
    int flag = 0,n,x;
    printf("enter the size of array\n");
        scanf("%d",&n);
        printf("enter the elements in the array\n");
        for(int i=0; i<n; i++){
            scanf("%d",&a[i]);
        }
        
       printf("enter the element to search in array\n");
       scanf("%d",&x);
       for(int i=0;i<n;i++){
            if(a[i] == x){
                flag = 1;
            }
        }
        if(flag == 1){
            printf("element is present in array \n");
        }
        else{
            printf("element is not present in array \n");
        }
}
