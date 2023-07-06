class Person{

    String name;
    private String address;
    private String phone;
    private String date;
    private String country;
    private String city;

    public Person(){

    }
    public Person(String name, String date,String phone, String country, String city, String address){
        setName(name);
        setDate(date);
        setPhone(phone);
        setCountry(country);
        setCity(city);
        setAddress(address);

    }
    public String getName(){
        if (this.name==null)
            return "not filled";
        else
            return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPhone(){
        if (this.phone==null)
            return "not filled";
        else
            return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getDate(){
        if (this.date==null)
            return "not filled";
        else
            return this.date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getCountry(){
        if (this.country==null)
            return "not filled";
        else
            return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCity(){
        if (this.city==null)
            return "not filled";
        else
            return this.city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getAddress(){
        if (this.address==null)
            return "not filled";
        else
            return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Name\t\t"+getName()+"\nBirthday\t"+getDate()+"\nPhone\t\t"+ getPhone()+"\nCountry\t\t"+getCountry()+"\nCity\t\t"+getCity()+"\nAddress\t\t"+getAddress();
    }

}
