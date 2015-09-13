class Gravitycalculator {
  public static void main(String[] arguments) {
    double gravity = -9.81; // Earth's gravity in m/s^2
    double intialVelocity = 0.0;
    double fallingTime = 10.0;
    double intialPosition = 0.0;
    double finalPosition = 0.5 * (gravity * (fallingTime * fallingTime)) + (0 * fallingTime) + intialPosition;
    System.out.println("The object's position after" + fallingTime + "seconds is" + finalPosition + "m");
   }
}

// before change it tells me that after 10.0s that final position is 0.0m

// after change it tell that after 10.0s the final position is -490.5m
