package BooksByAuthors;

import java.util.ArrayList;
import java.util.List;

public class BookStorage {

    public static List<String> getCoelhoBook(){
        List<String> coelhoBook = new ArrayList<>();
        coelhoBook.add(String.valueOf(new Book("The Alchemist",1988)));
        coelhoBook.add(String.valueOf(new Book("The Winner Stands Alone",2008)));
        coelhoBook.add(String.valueOf(new Book("The Devil and Miss Prym",2000)));
        coelhoBook.add(String.valueOf(new Book("Eleven Minutes",2003)));
        coelhoBook.add(String.valueOf(new Book("Brida",1990)));
        return coelhoBook;
    }

    public static List<String> getTolkienBook(){
        List<String> toelkiebBook = new ArrayList<>();
        toelkiebBook.add(String.valueOf(new Book("The Lord of the Rings",1954)));
        toelkiebBook.add(String.valueOf(new Book("The Hobbit",1937)));
        toelkiebBook.add(String.valueOf(new Book("The Silmarillion",1977)));
        toelkiebBook.add(String.valueOf(new Book("The History of Middle-earth",1983)));
        toelkiebBook.add(String.valueOf(new Book("Unfinished Tales of Númenor and Middle-earth",1980)));
        return toelkiebBook;
    }

    public static List<String> getHemingwayBook(){
        List<String> hemingwayBook = new ArrayList<>();
        hemingwayBook.add(String.valueOf(new Book("The Torrents of Spring",1926)));
        hemingwayBook.add(String.valueOf(new Book("The Sun Also Rises",1926)));
        hemingwayBook.add(String.valueOf(new Book("A Farewell to Arms",1929)));
        hemingwayBook.add(String.valueOf(new Book("Winner Take Nothing",1933)));
        hemingwayBook.add(String.valueOf(new Book("To Have and Have Not",1937)));
        return hemingwayBook;
    }

    public static List<String> getStephenKingBook(){
        List<String> stephenKingBook = new ArrayList<>();
        stephenKingBook.add(String.valueOf(new Book("Carrie",1974)));
        stephenKingBook.add(String.valueOf(new Book("Salem's Lot",1975)));
        stephenKingBook.add(String.valueOf(new Book("The Shininge",1977)));
        stephenKingBook.add(String.valueOf(new Book("Rage",1977)));
        stephenKingBook.add(String.valueOf(new Book("The Stand",1978)));
        return stephenKingBook;
    }

}
