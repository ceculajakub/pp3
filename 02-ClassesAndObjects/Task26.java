
public class Task26 {
    public static void main(String[] args) 
    {
        Book firstBook = new Book();
        Book secondBook = new Book();

        firstBook.title = "Java fundamentals";
        firstBook.author = "Unknown";
        firstBook.pagesCount = 15000;
        firstBook.starsScore = 2.5f;
        firstBook.isTranslatedToPolish = false;

        secondBook.title = "Train";
        secondBook.author = "Unknown";
        secondBook.pagesCount = 35;
        secondBook.starsScore = 4.5f;
        secondBook.isTranslatedToPolish = true;


        firstBook.displayTitleAndAuthor();
        firstBook.displayPagesCountAndEstimatedReadTime();
        firstBook.displayTranslationStatus();
        firstBook.changeTranslationStatus(true);
        firstBook.displayTranslationStatus();

        secondBook.displayTitleAndAuthor();
        secondBook.displayPagesCountAndEstimatedReadTime();
        secondBook.displayTranslationStatus();
        secondBook.changeTranslationStatus(false);
        secondBook.displayTranslationStatus();
    }
}
