package OperationOnHTMLElements.Utilities;

import java.util.ArrayList;

public class Util {
    static ArrayList<String> cities = new ArrayList<>(){{
        add("Mumbai");
        add("Delhi");
        add("Bangalore");
        add("Hyderabad");
        add("Ahmedabad");
        add("Chennai");
        add("Kolkata");
        add("Surat");
        add("Pune");
        add("Jaipur");
        add("Lucknow");
        add("Kanpur");
        add("Nagpur");
        add("Indore");
        add("Thane");
        add("Bhopal");
        add("Visakhapatnam");
        add("Pimpri-Chinchwad");
        add("Patna");
        add("Vadodara");
        add("Ghaziabad");
        // Add more cities as needed
    }};

    public static ArrayList<String> getThreeCities()
    {
        ArrayList<String> threeCities = new ArrayList<>();
        int r = (int) (Math.random() * (15 - 1)) + 1;
        for (int i=r;i<r+3;i++)
        {
            threeCities.add(cities.get(i))  ;
        }
        return threeCities;
    }
}
