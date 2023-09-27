public class Converter {
    //initializing variables used in the class
    int distYards;
    int distFeet;
    double distInches;

    //method for converting the units
    public void convert(double distMetres) {
        this.distInches = Math.round((distMetres * 39.37008));
        this.distYards = (int)(distInches / 36);
        this.distInches = this.distInches - (distYards * 36);
        this.distFeet = (int)(this.distInches/12);
        this.distInches = (this.distInches - distFeet * 12);
    }

    //method for printing
    public void print() {
        if (distYards == 1) {
            System.out.print(distYards + " yard");
        }
        else if (distYards > 1)  {
            System.out.print(distYards + " yards");
        }
        
        if (distFeet == 1 && distInches >= 1) {
            System.out.print(", " + distFeet + " foot");
        }
        else if (distFeet > 1 && distInches >= 1) {
            System.out.print(", " + distFeet + " feet");
        }
        else if (distFeet > 1 && distInches <= 0) {
            System.out.print(" and " + distFeet + " feet");
        }
        else if (distFeet == 1 && distInches <= 0) {
            System.out.print(" and " + distFeet + " foot");
        }

        if (distInches == 1) {
            System.out.print(" and " + Math.round(distInches) + " inch");
        }
        else if (distInches > 1) {
            System.out.print(" and " + Math.round(distInches) + " inches");
        }
    }

}