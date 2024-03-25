package Domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieItemTest {

    @Test
    void shouldInitFields() {
            MovieItem movie = new MovieItem(11, 1,"bread",2000);
            Assertions.assertEquals(11, movie.getId());
            Assertions.assertEquals(1, movie.getMovieId());
            Assertions.assertEquals("bread", movie.getMovieName());
            Assertions.assertEquals(2000, movie.getYear());
    }

    @Test
    void shouldSetFields() {
        MovieItem movie = new MovieItem(11, 1,"bread",2000);
        movie.setId(12);
        movie.setMovieId(121212);
        movie.setMovieName("BestMovieEver");
        movie.setYear(2001);

        Assertions.assertEquals(12, movie.getId());
        Assertions.assertEquals(121212, movie.getMovieId());
        Assertions.assertEquals("BestMovieEver", movie.getMovieName());
        Assertions.assertEquals(2001, movie.getYear());

    }
}