public class ConverterEx {
    //initializing variables used in converter class
    double distChain;
    double distFurlong;
    double distBarleycorn;

    //method for converting the units
    public void convertEx(int distMetres2) {
        this.distBarleycorn = (long)(distMetres2 * 118);
        this.distFurlong = (long)(this.distBarleycorn/1980);
        this.distBarleycorn = (long)this.distBarleycorn - (distFurlong * 1980);
        this.distChain = (long)this.distBarleycorn / 198;
        this.distBarleycorn = (long)this.distBarleycorn - (distChain * 198);
    }


    //method for printing the results
    public void printEx() {
        if (distFurlong == 1) {
            System.out.print(Math.round(distFurlong) + " furlong");
        }
        else if (distFurlong > 1) {
            System.out.print(Math.round(distFurlong) + " furlongs");
        }
        
        if (distFurlong >= 1 && distChain == 1) {
            System.out.print(", " + Math.round(distChain) + "  chain");
        }
        else if (distFurlong >= 1 && distChain > 1) {
            System.out.print(", " + Math.round(distChain) + " chains");
        }
        else if (!(distFurlong >= 1) && distChain == 1) {
            System.out.print(Math.round(distChain) + " chain");
        }
        else if (!(distFurlong >= 1) && distChain > 1) {
            System.out.print(Math.round(distChain) + " chains");
        }

        if ((distFurlong >= 1 || distChain >= 1) && distBarleycorn == 1) {
            System.out.print(" and " + Math.round(distBarleycorn) + " barleycorn");
        }
        else if ((distFurlong >= 1 || distChain >= 1) && distBarleycorn > 1) {
            System.out.print(" and " + Math.round(distBarleycorn) + " barleycorns");
        }
        else if (!(distChain >= 1) && !(distFurlong >= 1) && distBarleycorn == 1) {
            System.out.print(Math.round(distBarleycorn) + " barleycorn");
        }
        else if (!(distChain >= 1) && !(distFurlong >= 1) && distBarleycorn > 1) {
            System.out.print(Math.round(distBarleycorn) + " barleycorns");
        }
    }
}