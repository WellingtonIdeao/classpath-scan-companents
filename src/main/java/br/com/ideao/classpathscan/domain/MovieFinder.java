package br.com.ideao.classpathscan.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieFinder {

    private String name;

    public MovieFinder(@Value("${moviefinder.name:movieDefault}") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MovieFinder{" +
                "name='" + name + '\'' +
                '}';
    }
}
