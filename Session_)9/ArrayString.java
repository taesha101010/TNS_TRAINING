// reverse of array: 
public class ArrayString {
    public static void main(String[] args) {
        int[] a  = {1,2,3,4,5};
        int [] rev = new int[a.length];

        System.out.println("Original Array: ");
        for (int i = 0; i < a.length; i++){
            System.out.print( a[i]+ " ");
        }

        for (int i = 0; i < a.length; i++){
              rev[i] = a[a.length - 1 - i];
        }
        
        System.out.println();
        System.out.println("After Reversing Array: ");
        for (int i = 0; i<rev.length; i++){
            System.out.print(rev[i] + " ");

        }

        //Copy/clone of array
        int[] n1 = {1,2,3};
      //  int[]n2 = n1;
      //  n2[0] = 9;
       // System.out.println(n1[0]); //9   hence this no the correct way to make a clone
        int[] n2 = n1.clone();
        System.out.println("Clone array:");
        for (int i = 0; i<n1.length; i++ ){
            System.out.print(n1[i]+" ");
        }
        
        ///////Find second largest element in one  pass
        
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int x : a){
            if (x > first) {
                second = first;
                first = x;

            } 

            else if (x>second && x != first) {
                  second = x;
            }
        }
        System.out.println("Largest: " + first);
System.out.println("Second largest: " + second);

    }
}
