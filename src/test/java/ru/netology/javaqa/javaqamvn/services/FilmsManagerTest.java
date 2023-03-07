package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    @Test
    public void DisplayingAllMovies() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");


        String[] expected = {"Film I", "Film II", "Film III" };
        String[] actual = manager.findAll();

    }

    @Test
    public void DisplayingASingleMovie() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");


        String[] expected = {"Film I" };
        String[] actual = manager.findAll();

    }
    @Test
    public void DoesNotDisplayAnything() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");


        String[] expected = { };
        String[] actual = manager.findAll();

    }

    @Test
    public void DisplaysTwoMovies() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");


        String[] expected = {"Film I", "Film III"};
        String[] actual = manager.findAll();

    }

    @Test
    public void DisplaysMoviesInReverseOrder() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");
        manager.addFilm("Film IX");
        manager.addFilm("Film X");


        String[] expected = {"Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
