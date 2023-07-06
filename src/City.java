public class City {
    String name;
    private String region_name;
    private String name_country;
    private long number_inhabitants;
    private int postcode;
    private int telephone_code;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        if (this.name==null)
            return "not filled";
        else
        return name;
    }
    public void setRegion_name(String region_name){
        this.region_name=region_name;
    }
    public String getRegion_name(){
        if (this.region_name==null)
            return "not filled";
        else
            return region_name;
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
    public void setNumber_inhabitants(long number_inhabitants){
        this.number_inhabitants=number_inhabitants;
    }
    public long getNumber_inhabitants(){

            return number_inhabitants;
    }
    public void setPostcode(int postcode){
        this.postcode=postcode;
    }
    public int getPostcode(){

            return postcode;
    }
    public void setTelephone_code(int telephone_code){
        this.telephone_code=telephone_code;
    }
    public int getTelephone_code(){

            return telephone_code;
    }
    public City(){


    }
    public City(String name, String region_name, String name_country, long number_inhabitants, int postcode, int telephone_code){
        setName(name);
        setRegion_name(region_name);
        setName_country(name_country);
        setNumber_inhabitants(number_inhabitants);
        setPostcode(postcode);
        setTelephone_code(telephone_code);

    }

    @Override
    public String toString(){
        return "Name\t\t\t\t\t"+getName()+"\nRegion Name\t\t\t\t"+getRegion_name()+"\nName Country\t\t\t"+getName_country()+"\nNumber Inhabitants\t\t"+getNumber_inhabitants()+"\nPostcode\t\t\t\t"+getPostcode()+"\nTelephone Code\t\t\t"+getTelephone_code();
    }
}
