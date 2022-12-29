package hashing;

/*
Given a list of tickets, find itinerary in order using the given list.

Example:

Input:
"Chennai" -> "Bangalore"
"Bombay" -> "Delhi"
"Goa"    -> "Chennai"
"Delhi"  -> "Goa"

Output:
Bombay->Delhi, Delhi->Goa, Goa->Chennai, Chennai->Banglore,
It may be assumed that the input list of tickets is not cyclic and there is one ticket from every city except the final destination.

 */

import java.util.HashMap;
import java.util.Map;

public class FindItineraryDetails {

    public static void findingItinerary(HashMap<String,String> mainMap){
        Map<String, String> reverseMap = new HashMap<>();
        String startPoint = null;

        //creating reverse Map
        for(String key: mainMap.keySet()){
            reverseMap.put(mainMap.get(key), key);
        }

        //finding the start point
        for(String key: mainMap.keySet()){
            if(!reverseMap.containsKey(key)){
                startPoint = key;
            }
        }

        if (startPoint == null) {
            System.out.println("Invalid Input");
            return;
        }

        String to = mainMap.get(startPoint);
        while (to != null) {
            System.out.print(startPoint+ "->" + to + ", ");
            startPoint = to;
            to = mainMap.get(to);
        }
    }


    public static void main(String[] args) {

        HashMap<String,String> mainMain = new HashMap<>();
        mainMain.put("Chennai","Bangalore");
        mainMain.put("Bombay","Delhi");
        mainMain.put("Goa","Chennai");
        mainMain.put("Delhi","Goa");
        findingItinerary(mainMain);

    }
}
