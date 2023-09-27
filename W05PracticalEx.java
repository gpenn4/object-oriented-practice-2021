import java.util.Scanner;

public class W05PracticalEx {
    public static void main(String[] args) {
       
        Scanner reader = new Scanner(System.in); //initializing Scanner

        //outputs text prompting the reader to choose which conversion they desire
        System.out.println("Write 'first' if you would like to convert from metres to yards, feet, and inches and 'second' if you would like to convert to furlongs, chains, and barleycorns.");
        String userChoice = reader.next(); //sets variable for the user response

        //switch expression to set conditions for each user choice
        switch(userChoice) {
            case "first":
            case "FIRST":
            case "First":
                System.out.println("Enter distance in metres.");
                int distMetres = reader.nextInt();
                if (distMetres == 1) {
                    System.out.println(Math.round(distMetres) + " metre in yards, feet and inches is:" );
                }
                else if  (distMetres > 1) {
                    System.out.println(Math.round(distMetres)  + " metres in yards, feet and inches is:");
                 }
                else if (distMetres < 1) {
                    System.out.println("Invalid input.");
                }
                Converter newConverter = new Converter();
                newConverter.convert(distMetres);
                newConverter.print();
                 break;
            case "second":
            case "SECOND":
            case "Second":
                System.out.println("Enter distance in metres.");
                int distMetres2 = reader.nextInt();
                if (distMetres2 == 1) {
                    System.out.println(Math.round(distMetres2) + " metre in furlongs, chains and barleycorns is:" );
                }
                else if (distMetres2 > 1) {
                    System.out.println(Math.round(distMetres2)  + " metres in furlongs, chains and barleycorn is:");
                 }
                 else if (distMetres2 < 1) {
                     System.out.println("Invalid input.");
                 }

                ConverterEx newConverterEx = new ConverterEx();
                newConverterEx.convertEx(distMetres2);
                newConverterEx.printEx();
                 break;
            default:
                System.out.println("Invalid input");

        }

    }
}