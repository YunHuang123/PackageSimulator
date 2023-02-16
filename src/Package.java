public class Package {

    private Address origin;
    private Address destination;
    private double weight;
    private double length;
    private double width;
    private double height;

    public Package(Address from, Address to, double pounds, double l, double w, double h)
    {
        origin = from;
        destination = to;
        if (pounds > .1)
        {
            weight = pounds;
        }
        if (l > 2)
        {
            length = l;
        }
        if (w > 2)
        {
            width = w;
        }
        if (h > 2)
        {
            height = h;
        }
    }

    public Address getOrigin() {
        return origin;
    }

    public Address getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
