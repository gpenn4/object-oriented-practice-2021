import java.util.Scanner;

public class W05Practical {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); //initializing Scanner
        System.out.println("Enter distance in metres"); //prompts the user to enter a distance in metres
        double distMetres = reader.nextInt(); //sets metre variable to the user input
        
        //if statement to check that the user input is valid
        if (distMetres == 1) {
            System.out.println(Math.round(distMetres) + " metre in yards, feet and inches is:" );
        }
        else if  (distMetres > 1) {
            System.out.println(Math.round(distMetres)  + " metres in yards, feet and inches is:");
        }
        else {
            System.out.println("Invalid input!");
        }

        Converter newConverter = new Converter(); //initialzing Converter class

        newConverter.convert(distMetres); //invoking convert method
        newConverter.print(); //invoking print method

        int x = 2;
        int res = 0;
        switch (x) {
            
        }
    }
}
