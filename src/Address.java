public class Address {

    private String streetNum;
    private String streetName;
    private String aptNum;
    private String city;
    private String state;
    private String zip;


    public Address (String sNum, String sName, String aptNumber, String c, String s, String z)
    {
        streetNum = sNum;
        streetName = sName;
        aptNum = aptNumber;
        city = c;
        state = s;
        zip = z;
    }

    public Address (Address address)
    {
        this.streetNum = address.streetNum;
        this.streetName = address.streetName;
        this.aptNum = address.aptNum;
        this.city = address.city;
        this.state = address.state;
        this.zip = address.zip;
    }

    public Address (String address)
    {
        String[] a = address.split(",");
        String[] s = a[2].split(" ");
        int index1 = a[0].indexOf(" ");
        int index2 = a[0].indexOf("Apt");
        streetNum = a[0].substring(0, index1);
        if (index2 != -1)
        {
            streetName = a[0].substring(index1 + 1, index2 - 1);
            aptNum = a[0].substring(index2);
        }
        else
        {
            streetName = a[0].substring(index1 + 1);
        }
        city = a[1].substring(1);
        state = s[0];
        zip = s[1];
    }


    public String getNumStreets() {
        return streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAptNum() {
        return aptNum;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public void setNumStreets(String numStreets) {
        this.streetNum = numStreets;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString()
    {
        return streetNum + " " + streetName + " " + aptNum + ", " + city + ", " + state + " " + zip;
    }
}
