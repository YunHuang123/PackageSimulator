import java.util.ArrayList;
public class PackageSimulator {

    public String generateZip(){
        String zipThatISAString = "";
        int zip = (int) (Math.random() * 99442 + 501);
        zipThatISAString += zip;
        return zipThatISAString;
    }
    public void generatePackages (int num){
        ArrayList<Package> generatedPs = new ArrayList<Package>();
    }
}