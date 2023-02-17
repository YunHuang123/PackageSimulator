public class PostageCalculator {

    private final double baseCost = 3.75;
    public double pCalculator(Package p)
    {
        double cost = baseCost;
        cost += (p.getWeight() / .01) * .05;
        int originCounty = Integer.parseInt(p.getOrigin().getZip()) / 100;
        int destinationCounty = Integer.parseInt(p.getDestination().getZip()) / 100;
        double combinedDimensions = p.getHeight() + p.getLength() + p.getWidth();
        cost += Math.abs(originCounty - destinationCounty) / 100;
        if (combinedDimensions >= 36)
        {
            cost += (combinedDimensions - 36) * .1;
        }
        if (p.getWeight() > 40)
        {
            cost += (p.getWeight() - 40);
        }
        return cost;
    }

    public double pCalculator(String zip1, String zip2, double weight, double length, double width, double height)
    {
        double cost = baseCost;
        cost += (weight / .01) * .05;
        int originCounty = Integer.parseInt(zip1) / 100;
        int destinationCounty = Integer.parseInt(zip2) / 100;
        double combinedDimensions = height + length + width;
        cost += Math.abs(originCounty - destinationCounty) / 100;
        if (combinedDimensions >= 36)
        {
            cost += (combinedDimensions - 36) * .1;
        }
        if (weight > 40)
        {
            cost += (weight - 40);
        }
        return cost;
    }

    public double pCalculator(Address o, Address d, double weight, double length, double width, double height)
    {
        double cost = baseCost;
        cost += (weight / .01) * .05;
        int originCounty = Integer.parseInt(o.getZip()) / 100;
        int destinationCounty = Integer.parseInt(d.getZip()) / 100;
        double combinedDimensions = height + length + width;
        cost += Math.abs(originCounty - destinationCounty) / 100;
        if (combinedDimensions >= 36)
        {
            cost += (combinedDimensions - 36) * .1;
        }
        if (weight > 40)
        {
            cost += (weight - 40);
        }
        return cost;
    }
}
