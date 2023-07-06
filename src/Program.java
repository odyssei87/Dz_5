

public class Program {
    public static void main(String [] args){
        Person person = new Person("Roman", "23.12.1987","+79999999999","Rus","Saratov","Hcolzunova");
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println("---------------------------------------------------");
        City city = new City("Saratov","Saratov obl","Rus",156000000,410000,+7);
        System.out.println(city);
        System.out.println("---------------------------------------------------");
        Country country = new Country("Evropa","Evraziya",150000000,+7,"Moskov");
        System.out.println(country);
        country.setName_cities("sdsdfs");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++=");
        System.out.println(country);
        country.getName_cities();






    }
}

