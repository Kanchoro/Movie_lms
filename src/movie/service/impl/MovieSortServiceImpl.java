package movie.service.impl;

import movie.dao.impl.MovieSortDaoImpl;
import movie.models.Movie;
import movie.service.MovieSortService;

import java.util.LinkedList;

public class MovieSortServiceImpl implements MovieSortService {
    private final MovieSortDaoImpl movieSortServiceDao;

    public MovieSortServiceImpl(MovieSortDaoImpl movieSortServiceDao) {
        this.movieSortServiceDao = movieSortServiceDao;
    }


    @Override
    public LinkedList<Movie> sortMovieByName(LinkedList<Movie> ascOrDesc) {
        return movieSortServiceDao.sortMovieByName(ascOrDesc);
    }


    @Override
    public LinkedList<Movie> sortByYear(LinkedList<Movie> ascOrDesc) {
        return movieSortServiceDao.sortByYear(ascOrDesc);
    }

    @Override
    public LinkedList<Movie> sortByProducer(LinkedList<Movie> nameOrLastName) {
        return movieSortServiceDao.sortByProducer(nameOrLastName);
    }
}
