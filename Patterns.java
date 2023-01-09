public class Patterns {
    public static void main(String[] args) {
        System.out.println("Simple Triangle");
        for(int i=0; i<5; i++) {   
            for(int j=0; j<=i; j++){   
                System.out.print("* ");   
            }   
            System.out.println(); // Move to Next Line 
        }
        System.out.println("Inverted Triangle");
        for(int i=4; i>=0; i--) {   
            for(int j=i; j>=0; j--){   
                System.out.print("* ");   
            }   
            System.out.println(); // Move to Next Line 
        }
        System.out.println("Square Pattern");
        for(int i=0; i<=4; i++) {   
            for(int j=0; j<=4; j++){   
                if(i==0 || i==4 || j==0 || j==4){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }   
            System.out.println(); // Move to Next Line 
        }
        System.out.println("Pattern No.4");
        for(int i=1; i<=5; i++) {   
            for(int j=1; j<=i; j++){   
                System.out.print(j+" ");   
            }   
            System.out.println(); // Move to Next Line 
        }
    }
}

/*
    0 1 2 3 4
(0) 1 
(1) 1 2
(2) 1 2 3 
(3) 1 2 3 4 
(4) 1 2 3 4 5

* 1. i=0, j=0         -> *
* 2. i=1, j=0,1       -> *
* 3. i=2, j=0,1,2     -> *
* 4. i=3, j=0,1,2,3   -> *
* 5. i=4, j=0,1,2,3,4 -> *

    0 1 2 3 4
0   * * * * *
1   *       * 
2   *       *
3   *       *
4   * * * * * 

1. i=0, j=4
2. i=1, j=4,3
3. i=2, j=4,3,2
4. i=3, j=4,3,2,1
5. i=4, j=4,3,2,1,0


 * 1. i=0, j=0         -> *
 * 2. i=1, j=0,1       -> *
 * 3. i=2, j=0,1,2     -> *
 * 4. i=3, j=0,1,2,3   -> *
 * 5. i=4, j=0,1,2,3,4 -> *
 * 
 * 1. i=4, j=4,3,2,1,0
 * 2. i=3, j=3,2,1,0 
 * 3. i=2, j=2,1,0
 * 4. i=1, j=1,0
 * 5. i=0, j=0
 */

/*
   0 1 2 3 4
0  *
1  * *
2  * * *
3  * * * *
4  * * * * *

    4 3 2 1 0
4   * * * * *
3   * * * * 
2   * * *
1   * *
0   * 
*/