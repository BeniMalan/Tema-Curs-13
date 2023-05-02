package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class QuoteService {
    QuoteService() {
        this.myList = myList;
    }

    List<Quote> myList = new ArrayList<>();

    public List<Quote> readQuotes(String filepath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filepath));
        int ID=1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] token = line.split("\\~");
             {
                myList.add(new Quote(ID, token[0], token[1]));
                ID++;
            }
        }
        return myList;

    }

    public List<String> getAllQuotes() throws FileNotFoundException {
        List<String> myListOfquotes = new ArrayList<>();
        for (Quote q : myList) {
            myListOfquotes.add(q.getQuote());
        }
        return myListOfquotes;
    }


    public List<Quote> getQuotesForAuthor(String autor) {
        List<Quote> quoteFromAuthor = new ArrayList<>();
        for (Quote q : myList) {
            if (q.getAuthor().equals(autor)) {
                quoteFromAuthor.add(new Quote(q.getID(), q.getAuthor(), q.getQuote()));
            }
        }
        return quoteFromAuthor;
    }

    public Set<String> getAuthor() {
        HashSet<String> authors = new HashSet<>();
        for (Quote q : myList) {
            authors.add(q.getAuthor());
        }
        return authors;
    }

    public void setFavourite(int id) {
        for (Quote q : myList) {
            if (q.getID() == id) {
                q.setFavourite(true);
            }
        }
    }

    public List<Quote> getFavourites() {
            List<Quote> favouriteQuotes = new ArrayList<>();
            for (Quote q : myList) {
                if (q.isFavourite()==true) {
                    favouriteQuotes.add(q);
                }
            }
            return favouriteQuotes;
        }


    public String getRandomQuote(){
        String quote=null;
        Random random=new Random();
       int nr= random.nextInt(100)+1;
        System.out.println(nr);
       for(Quote q:myList){
           if(q.getID()==nr){
              quote= q.getQuote();
           }
       }
       return quote;
    }
}


