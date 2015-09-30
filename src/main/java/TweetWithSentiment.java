/**
 * Created by hastimal on 9/28/2015.
 */
public class TweetWithSentiment {

    private String line;
    private String cssClass;
    private String lang;

    public TweetWithSentiment() {
    }

    public TweetWithSentiment(String line, String cssClass) {
        super();
        this.line = line;
        this.cssClass = cssClass;
        this.lang =lang;
    }

    public String getLine() {
        return line;
    }

    public String getCssClass() {
        return cssClass;
    }

    @Override
    public String toString() {
        return "TweetWithSentiment [line=" + line + ", cssClass=" + cssClass + "]";
    }

}
