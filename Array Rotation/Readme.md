# Write a function rotate(ar[], R, n) that rotates arr[] of size n by R elements.

          Where R  = Rotating Number
                n = numbers of an array
                arr[] = Variable for storing the numbers
## Method 1
         array list :  1  ,  2  ,   3  ,  4  ,  5  ,  6  ,  7 
              Index : [0]   [1]    [2]   [3]   [4]   [5]   [6]
         
         Rotating array by 3
         R = 3
         
         1) Store the first R elements in a temp array
              temp[] = [1,2,3]
         2) Shift rest of the arr[]
              arr[] = [4, 5, 6, 7, 5, 6, 7]
          3) Store back the d elements
              arr[] = [4, 5, 6, 7, 1, 2, 3]
              
              
         Time Complaxity is O(n)
         Space is O(R)

## Method 2 
          leftRotate(arr[], R, n)
          start
            For i = 0 to i < R
              Left rotate all elements of arr[] by one
          end
