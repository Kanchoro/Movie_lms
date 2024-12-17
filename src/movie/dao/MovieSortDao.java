package movie.dao;

import movie.models.Movie;

import java.util.LinkedList;

public interface MovieSortDao {
    LinkedList<Movie> sortMovieByName(LinkedList<Movie> ascOrDesc);
    LinkedList<Movie>  sortByYear(LinkedList<Movie> ascOrDesc);
    LinkedList<Movie>  sortByProducer(LinkedList<Movie>  nameOrLastName);
}
