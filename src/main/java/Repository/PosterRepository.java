package Repository;

import Domain.MovieItem;

public class PosterRepository {
    MovieItem[] posterLine = new MovieItem[0];
    private int limitShowPosters = 5;

    public PosterRepository() {
    }

    public PosterRepository(int newLimit) {
        limitShowPosters = newLimit;
    }

    public void addMovie(MovieItem newMovie) {
        MovieItem[] tmp = new MovieItem[posterLine.length + 1];
        for (int i = 0; i < posterLine.length; i++) {
            tmp[i] = posterLine[i];
        }
        tmp[tmp.length - 1] = newMovie;
        posterLine = tmp;
    }

    public MovieItem[] findAll() {
        return posterLine;
    }


    public MovieItem[] findLast() {
        int resultLength;

        if (posterLine.length <= limitShowPosters) {
            resultLength = posterLine.length;
        } else {
            resultLength = limitShowPosters;
        }
        MovieItem[] result = new MovieItem[resultLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = posterLine[posterLine.length - 1 - i];
        }
        return result;

    }


}
