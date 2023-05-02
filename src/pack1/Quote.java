package pack1;

public class Quote {
    private final int ID;
    private final  String author;
    private  final String quote;


    public Quote(int ID,String author,String quote) {
this.author=author;
this.quote=quote;
this.ID=ID;

    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public int getID(){
         return ID;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }
public String toString(){
        return ID+" "+author+" "+quote;
    }
    private boolean favourite;

    public boolean isFavourite() {
        return favourite;
    }
}
