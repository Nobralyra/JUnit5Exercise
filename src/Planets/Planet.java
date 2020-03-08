package Planets;

public class Planet extends OrbitalObject
{

    public Planet(String name, double diameter, double orbit, int howManyMoons)
    {
        super(name, diameter, orbit, howManyMoons);
    }

    @Override
    public double CalculateDistanceBetweenTwoObjects(OrbitalObject orbitalObject)
    {
        double distanceBetweenTwoPlanets = Math.abs(this.getOrbit() - orbitalObject.getOrbit());
        return distanceBetweenTwoPlanets;
    }

    @Override
    public int getHowManyMoons()
    {
        return super.getHowManyMoons();
    }
}
