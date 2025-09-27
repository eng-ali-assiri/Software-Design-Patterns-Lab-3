interface DocumentTemplate extends Cloneable {
    DocumentTemplate clone();
    void setTitle(String t);
    String getTitle();
}

class ArticleTemplate implements DocumentTemplate {
    private String title, layout, style, content;

    public ArticleTemplate(String title, String layout, String style, String content) {
        this.title = title; this.layout = layout; this.style = style; this.content = content;
    }

    private ArticleTemplate(ArticleTemplate other) {
        this(other.title, other.layout, other.style, other.content);
    }

    @Override public ArticleTemplate clone() { return new ArticleTemplate(this); }
    @Override public void setTitle(String t) { this.title = t; }
    @Override public String getTitle() { return title; }

    @Override public String toString() {
        return "Article{title=" + title + ", layout=" + layout + ", style=" + style + "}";
    }
}

public class PublishingDemo {
    public static void main(String[] args) {
        ArticleTemplate base = new ArticleTemplate("Tech Trends", "two-column", "modern", "body...");
        
        ArticleTemplate a1 = base.clone();  
        a1.setTitle("Healthy Eating Habits");
        
        ArticleTemplate a2 = base.clone();  
        a2.setTitle("The Future of Space Travel");
        
        System.out.println(a1);
        System.out.println(a2);
    }
}
