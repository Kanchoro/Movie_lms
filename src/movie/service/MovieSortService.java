package movie.service;

import movie.models.Movie;

import java.util.LinkedList;

public interface MovieSortService {
    LinkedList<Movie> sortMovieByName(LinkedList<Movie> ascOrDesc);

    LinkedList<Movie> sortByYear(LinkedList<Movie> ascOrDesc);

    LinkedList<Movie> sortByProducer(LinkedList<Movie> nameOrLastName);
}
