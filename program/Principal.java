package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public  class Principal {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice tripe");
        Comment c2 = new Comment("Wow that's awesome!");
        Comment c3 = new Comment("Good Nigth");
        Comment c4 = new Comment("May the force be with you");

        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                            "Traveling to new Zealand",
                            "I'm going to visit this wonderful country!",
                            12);
        Post post2 = new Post(sdf.parse("20/07/2018 23:14:19"), 
                            "Good night guys",
                            "See you tomorrow",
                            5);
                

        post1.addComment(c1);
        post1.addComment(c2);
        post2.addComment(c3);
        post2.addComment(c4);
                
        System.out.println(post1);
        System.out.println(post2);


    }

}