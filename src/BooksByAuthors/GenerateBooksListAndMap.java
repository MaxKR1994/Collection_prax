package BooksByAuthors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GenerateBooksListAndMap {

    public static Map<String, List<String>> getBookStorageMap(){
        Map<String,List<String>> bookStorageMap = new HashMap<>();
        bookStorageMap.put("Paulo Coelho", BookStorage.getCoelhoBook());
        bookStorageMap.put("John Ronald Reuel Tolkien", BookStorage.getTolkienBook());
        bookStorageMap.put("Ernest Miller Hemingway", BookStorage.getHemingwayBook());
        bookStorageMap.put("Stephen King", BookStorage.getStephenKingBook());
        return bookStorageMap;
    }

    public static List<String> getBooksByAuthor (String authorName, Map<String,List<String>> bookStorageMap){
        return bookStorageMap.get(authorName);
    }

    public static void getLibraryRules(){
        System.out.println("      Wellcome to our little library!      ");
        System.out.println("Below you see the list of available authors");
        System.out.println("___________________________________________");
        System.out.println(getBookStorageMap().keySet());
        System.out.println("___________________________________________");
    }

    public static void start (){
        System.out.println("Enter the author`s name to see a list of available books by that author: ");
        Scanner sc = new Scanner(System.in);
        String authorName = sc.nextLine();
        sc.close();
        System.out.println(GenerateBooksListAndMap.getBooksByAuthor(authorName,GenerateBooksListAndMap.getBookStorageMap()));
    }

}
