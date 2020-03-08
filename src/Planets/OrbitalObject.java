package Planets;

public abstract class OrbitalObject
{
    /**
     * Name of the object
     */
    protected String Name;
    /**
     * Radius of the object
     */
    protected double Diameter;
    /**
     * Distance to what the object is spinning around
     */
    protected double Orbit;

    protected int HowManyMoons;

    public String getName()
    {
        return Name;
    }

    public double getDiameter()
    {
        return Diameter;
    }

    public double getOrbit()
    {
        return Orbit;
    }

    public int getHowManyMoons()
    {
        return HowManyMoons;
    }

    public OrbitalObject(String name, double diameter, double orbit, int howManyMoons)
    {
        Name = name;
        Diameter = diameter;
        Orbit = orbit;
        HowManyMoons = howManyMoons;
    }

    protected abstract double CalculateDistanceBetweenTwoObjects(OrbitalObject orbitalObject);
}
