package Maths_DSA;

public class Total_Distance_Traveled_LeetCode {
    public static void main(String[] args) {
        System.out.println(distanceTraveled(9, 1));
    }

    static int distanceTraveled(int mainTank, int additionalTank) {
        int fuel = mainTank;
        while (mainTank >= 5) {
            if (additionalTank == 0) break;
            else {
                mainTank = mainTank - 5 + 1;
                fuel = fuel + 1;
            }
            additionalTank--;
        }
        return fuel * 10;
    }
}


// return (mainTank+(Math.min((mainTank-1)/4 , additionalTank)))*10;