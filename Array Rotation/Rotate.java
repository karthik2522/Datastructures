Class Rotate{
  void left(int arr[], int R, int n){
    for (int i =0; i<R; i++)
      //rotates one by one
      leftrotate(arr,n);
  }
  
  void leftrotate(int arr[],int n){
    int i ,temp;
    temp = arr[0];
    for(int i=0; i< n-1; i++)
      arr[i] = arr[i+1];
    arr[n-1] = temp;
    
  }
 
  void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
 
    public static void main(String[] args)
    {
        Rotatearr rotate = new Rotatearr();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.leftrotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}
