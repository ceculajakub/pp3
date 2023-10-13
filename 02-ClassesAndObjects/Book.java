
public class Book 
{
    public String title;   
    public String author;   
    public int pagesCount;   
    public float starsScore;   
    public boolean isTranslatedToPolish;
    public final int avgPageReadTime = 2;


    public void displayTitleAndAuthor()
    {
        System.out.println(title + " " + author);
    }

    public void displayPagesCountAndEstimatedReadTime()
    {
        System.out.println("Pages count: " + pagesCount + " estimated read time: " + pagesCount * avgPageReadTime/60 +"h " + " stars score: " + starsScore);
    }

    public void changeTranslationStatus(boolean status)
    {
        isTranslatedToPolish = status;
    }

    public void displayTranslationStatus()
    {
        System.out.println(isTranslatedToPolish);
    }
}
