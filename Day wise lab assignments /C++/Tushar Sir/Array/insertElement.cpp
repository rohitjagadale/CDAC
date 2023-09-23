#include <iostream>
using namespace std;
 
// Function to insert x in arr at position pos
int* insertX(int n, int arr[],
            int x, int pos)
{
    int i;
 
    // increase the size by 1
    n++;
 
    // shift elements forward
    for (i = n; i >= pos; i--)
        arr[i] = arr[i - 1];
 
    // insert x at pos
    arr[pos - 1] = x;
 
    return arr;
}
 
// Driver Code
int main()
{
    int arr[100] = { 0 };
    int i, x, pos, n ;
    cout<<"Enter the size of array";
    cin>>n;
 
    // initial array of size 10
    for (i = 0; i < n; i++)
        cin>>arr[i];
 
    // print the original array
    for (i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout << endl;
 
    // element to be inserted

    cout<<"Insert the element";
    cin>>x ;
 
    // position at which element is to be inserted
    cout<<"Enter th position at which element to enter:";
    cin>>pos;
 
    // Insert x at pos
    insertX(n, arr, x, pos);
 
    // print the updated array
    for (i = 0; i < n + 1; i++)
        cout << arr[i] << " ";
    cout << endl;
 
    return 0;
}