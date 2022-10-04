package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public  class Principal {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment();
        Comment c2 = new Comment();


        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                            "Traveling to new Zealand",
                            "I'm going to visit this wonderful country!",
                            12);
        
        post1.addComment(c1);
        post1.addComment(c2);
                
        System.out.println(post1);

    }

}