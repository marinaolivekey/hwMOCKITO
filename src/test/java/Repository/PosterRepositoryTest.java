package Repository;

import Domain.MovieItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PosterRepositoryTest {

    MovieItem movie1 = new MovieItem(11, 1, "bread", 2000);
    MovieItem movie2 = new MovieItem(22, 222, "булкa", 2020);
    MovieItem movie3 = new MovieItem(33, 3, "kartoфель", 1999);
    MovieItem movie4 = new MovieItem(44, 888, "best", 1956);
    MovieItem movie5 = new MovieItem(55, 242, "god", 1956);
    MovieItem movie6 = new MovieItem(66, 677, "father", 1956);
    MovieItem movie7 = new MovieItem(77, 112, "second ", 1975);

    @Test
    void shouldAddMovie() {
        PosterRepository repo = new PosterRepository();
        repo.addMovie(movie1);
        repo.addMovie(movie3);
        repo.addMovie(movie5);

        MovieItem[] expected = {movie1, movie3, movie5};
        MovieItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        PosterRepository repo = new PosterRepository();
        repo.addMovie(movie1);
        repo.addMovie(movie3);
        repo.addMovie(movie7);

        MovieItem[] expected = {movie1, movie3, movie7};
        MovieItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLast() {
        PosterRepository repo = new PosterRepository();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);

        MovieItem[] expected = {movie7, movie6, movie5, movie4, movie3};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastIfEqualsLimit() {
        PosterRepository repo = new PosterRepository();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);


        MovieItem[] expected = {movie5, movie4, movie3, movie2, movie1};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastIfLessLimit() {
        PosterRepository repo = new PosterRepository();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);


        MovieItem[] expected = {movie4, movie3, movie2, movie1};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldfindLastIfNewLimit() {
        PosterRepository repo = new PosterRepository(6);
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);

        MovieItem[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldfindLastIfLessNewLimit() {
        PosterRepository repo = new PosterRepository(6);
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);


        MovieItem[] expected = {movie5, movie4, movie3, movie2, movie1};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}