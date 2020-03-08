package Planets;

public class Answers
{
    public void PrintAnswers()
    {
        Planet earth = new Planet("Earth", 6371.00, 149.598262, 1);
        Planet venus = new Planet("Venus", 6051.00, 108.209475, 0);
        System.out.println("Distance between Earth and Venus: " + earth.CalculateDistanceBetweenTwoObjects(venus));

        Moon moon = new Moon("Moon", 3474.2, 384400, 0, 150.000000);
        System.out.println("Distance between Moon and Venus: " + moon.CalculateDistanceBetweenTwoObjects(venus));


        Planet saturn = new Planet("Saturn", 116.460 , 1.426666422, 83);
        System.out.println("How many moons does Saturn have? " + saturn.getHowManyMoons());
    }

}
