/*Concept is sum of natural no and sum of the array then subtract both of these you will find a missing no.  */
/*TC =O(n)
 * SC =O(1)
 */

class MissingNo
{
    public static void main(String[] args) {
        int [] arr ={1,2,3,5,6};
        int  n=arr.length;
        int sum_natural_no = ((n+1)*(n+2))/2; //TC =O(1)
        int sum=0;
        for (int i=0;i<n;i++) //TC =O(n)
        {
            sum =sum + arr[i];

        }
        int missing =sum_natural_no - sum ;
       
         
        System.out.println(missing);   
    
    }
}