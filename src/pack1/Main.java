package pack1;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] arg) throws FileNotFoundException {
        String filepath = "Files/quotes.txt";
        QuoteService quoteServices = new QuoteService();
      List<Quote>list=quoteServices.readQuotes(filepath);
        System.out.println(list);
        List<String>list2=quoteServices.getAllQuotes();
        System.out.println(list2);
        List<Quote>list3=quoteServices.getQuotesForAuthor("Nora Roberts");
        System.out.println(list3);
        Set<String>list4=quoteServices.getAuthor();
        System.out.println(list4);

        System.out.println("Set favourite quote:");
        quoteServices.setFavourite(4);

        System.out.println("\nFavourite quote:");
        List<Quote> favouriteQuotes = quoteServices.getFavourites();
        System.out.println(favouriteQuotes);
        String quoteRandom= quoteServices.getRandomQuote();
        System.out.println(quoteRandom);
        }
    }


