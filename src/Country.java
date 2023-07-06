public class Country {
    private String name_country;
    private String name_continent;
    private long number_inhabitants;
    private int telephone_code;
    private  String capital_Cities;
    private String [] name_cities;

    public Country(){

    }
    public Country(String name_country, String name_continent, long number_inhabitants, int telephone_code, String capital_Cities){
        name_cities=new String[]{"Москва","Саратов","Казань"};
        setName_country(name_country);
        setName_continent(name_continent);
        setNumber_inhabitants(number_inhabitants);
        setTelephone_code(telephone_code);
        setCapital_Cities(capital_Cities);

    }

    public void setName_country(String name_country){
        this.name_country=name_country;
    }
    public String getName_country(){
        if (this.name_country==null)
            return "not filled";
        else
            return name_country;
    }
    public void setName_continent(String name_continent){
        this.name_continent=name_continent;
    }
    public String getName_continent(){
        if (this.name_continent==null)
            return "not filled";
        else
            return name_continent;
    }
    public void setNumber_inhabitants(long number_inhabitants){
        this.number_inhabitants=number_inhabitants;
    }
    public long getNumber_inhabitants(){

        return number_inhabitants;
    }
    public void setTelephone_code(int telephone_code){
        this.telephone_code=telephone_code;
    }
    public int getTelephone_code(){

        return telephone_code;
    }
    public void setCapital_Cities(String capital_Cities){
        this.capital_Cities=capital_Cities;
    }
    public String getCapital_Cities(){
        if (this.capital_Cities==null)
            return "not filled";
        else
        return capital_Cities;
    }

    public void setName_cities(String cities) {
        int lengh = this.name_cities.length;
        String [] temp = new String[lengh+1];
        for (int i=0;i<lengh;i++)
        {
            temp[i]=this.name_cities[i];
        }
        this.name_cities=null;
        this.name_cities=new String[lengh+1];
        temp[lengh]=cities;
        for (int i=0;i<lengh+1;i++){
            this.name_cities[i]=temp[i];
        }


    }

    public void getName_cities() {
        for (int i=0;i<name_cities.length;i++){
            System.out.print(name_cities[i]+" ");
        }


    }
    @Override
    public String toString(){
        return "name_country "+getName_country()+"\nname_continent "+getName_continent()+"\nnumber_inhabitants "+getNumber_inhabitants()+"\ntelephone_code "+getTelephone_code()+"\ncapital_Cities "+getCapital_Cities();

    }
}
