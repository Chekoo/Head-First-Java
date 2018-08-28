/**
 * FileName: Movie
 * Author:   cheko
 * Date:     8/28/18 10:51 PM
 * Description:
 * History:
 */
package C1;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cheko
 * @create 8/28/18
 * @since 1.0.0
 */
class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie.");
    }
}

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
    }
}