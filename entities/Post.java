package entities;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Post {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comment = new ArrayList<>();

    // CONSTRUTORES
    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public Date getMoment() {
        return moment;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Integer likes() {
        return likes;
    }

    public void addComment(Comment comment) {
        this.comment.add(comment);
    }
    public void removeComment(Comment comment) {
        this.comment.remove(comment);
    }
    // ENCAPSULAMENTO

    // METODOS
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n " + title + "\n");
        sb.append(" " + likes + " Likes - " + sdf.format(moment) + "\n");
        sb.append(" " + content + "\n");
        sb.append(" Comments:");
        for (Comment c : comment) {sb.append(c);}
        return sb.toString();
    }
    // METODOS


}
