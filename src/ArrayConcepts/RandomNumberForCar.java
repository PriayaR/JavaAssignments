package ArrayConcepts;

import java.util.*;

public class RandomNumberForCar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of car numbers:");
        int noOfCars = in.nextInt();
        String[] arr = new String[noOfCars];

        // create random object
        Random rand = new Random();
        for(int i=0; i<noOfCars; i++){cd
            arr[i] = "MH" + rand.nextInt(9999);
        }
        System.out.println("Car number : "+ Arrays.toString(arr));
        in.close();
    }

}
