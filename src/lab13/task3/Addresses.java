package lab13.task3;

import java.util.StringTokenizer;

public class Addresses {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String housing;
    private String apartmentNumber;

    public void setAddressWithSplit(String fullAddress){
        country = fullAddress.split(",")[0];
        region = fullAddress.split(",")[1].substring(1);
        city = fullAddress.split(",")[2].substring(1);
        street = fullAddress.split(",")[3].substring(1);
        house = fullAddress.split(",")[4].substring(1);
        housing = fullAddress.split(",")[5].substring(1);
        apartmentNumber = fullAddress.split(",")[6].substring(1);
    }

    public void setAddressWithToken(String fullAddress){
        StringTokenizer tokenizer = new StringTokenizer(fullAddress, ".,;");
        country = tokenizer.nextToken();
        region = tokenizer.nextToken().substring(1);
        city = tokenizer.nextToken().substring(1);
        street = tokenizer.nextToken().substring(1);
        house = tokenizer.nextToken().substring(1);
        housing = tokenizer.nextToken().substring(1);
        apartmentNumber = tokenizer.nextToken().substring(1);
    }

    public void printFields(){
        System.out.println("Country: " + country);
        System.out.println("Region: " + region);
        System.out.println("City: " + city);
        System.out.println("Street: " + street);
        System.out.println("House: " + house);
        System.out.println("Housing: " + housing);
        System.out.println("Apartment number: " + apartmentNumber);
    }
}
