package entities;

public class Comment {
    
    private String text;

    // CONSTRUTOR
    public Comment (String text) {
        this.text = text;
    }
    // CONSTRUTOR

    // ENCAPSULAMENTO 
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    // ENCAPSULAMENTO

    // METODOS
    public String toString() {
        return "\n " + text;
    }

}
