package Level1.LoopsConcept;

public class Pattern {
    /**--------------------------------------------------
     # we are starting row and column value from 0
     # Outer loop is for row and the inner loop is for columns
     # print statement prints a star at the first row and
     the second println statement prints the spaces and throws the cursor at the next line.
     ---------------------------------------------------------**/

    public static void main(String[] args) {
        int i, j, len=5;
        for(i=0;i<len;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
