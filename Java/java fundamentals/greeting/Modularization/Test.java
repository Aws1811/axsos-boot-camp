public class Test {
    public static void main(String[] args){
        // Print the capitals of Brazil and Croatia
        /="operator from-rainbow">/ Print the countries where Jerusalem and Abu Dhabi are the capitals
        // You will need to create an instance of 'Capitals'
        // Your code here
        // This should be your output
        /*
        What is the capital of Brazil?
        The capital of Brazil is Brasilia.
        Jerusalem is the capital of which country?
        Jerusalem is the capital of Palestine.
        What is the capital of Croatia?
        I don't know the capital of Croatia.
        Abu Dhabi is the capital of which country?
        I don't know that city.
        */
    }
}

public class Test {
    public static void main(String[] args){
        // Print the capitals of Brazil and Croatia
        // Print the countries where Jerusalem and Abu Dhabi are the capitals

        Capitals capitals = new Capitals();

        capitals.getCapital("Brazil");
        System.out.println(capitals.getCountry("Jerusalem"));
        capitals.getCapital("Croatia");
        System.out.println(capitals.getCountry("Abu Dhabi"));
    }
}