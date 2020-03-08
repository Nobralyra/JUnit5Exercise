package Planets;

public class Moon extends OrbitalObject
{
    private double OrbitToTheSun;

    public Moon(String name, double diameter, double orbit, int howManyMoons, double orbitToTheSun)
    {
        super(name, diameter, orbit, howManyMoons);
        OrbitToTheSun = orbitToTheSun;
    }

    @Override
    protected double CalculateDistanceBetweenTwoObjects(OrbitalObject orbitalObject)
    {
        double distanceBetweenTwoObjects = Math.abs(OrbitToTheSun - orbitalObject.getOrbit());
        return distanceBetweenTwoObjects;
    }
}
