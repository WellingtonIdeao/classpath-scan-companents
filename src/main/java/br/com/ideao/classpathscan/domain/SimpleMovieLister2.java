package br.com.ideao.classpathscan.domain;

import jakarta.inject.Inject;
import org.springframework.stereotype.Component;

@Component
public class SimpleMovieLister2 {

    private MovieFinder movieFinder;

    @Inject
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return "SimpleMovieLister2{" +
                "movieFinder=" + movieFinder +
                '}';
    }
}
