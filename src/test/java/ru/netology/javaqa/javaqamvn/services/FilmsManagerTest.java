package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    @Test
    public void DisplayOneFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");


        String[] expected = {"Film I" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void DisplayZeroFilms() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void DisplayNineFilms() {
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

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void DisplayTenFilms() {
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

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void DisplayElevenFilms() {
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
        manager.addFilm("Film XI");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X", "Film XI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void DisplayingSevenMoviesWithALimit() {
        FilmsManager manager = new FilmsManager(7);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void DisplayingMoviesWithALimitOfLessThanSeven() {
        FilmsManager manager = new FilmsManager(7);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void DisplayingMoviesWithALimitOfMoreThanSeven() {
        FilmsManager manager = new FilmsManager(7);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII","Film VIII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void DisplayingOneMovieWithALimitOfSeven() {
        FilmsManager manager = new FilmsManager(7);

        manager.addFilm("Film I");


        String[] expected = {"Film I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void WithoutAMovieWithALimitOfSeven() {
        FilmsManager manager = new FilmsManager(7);


        String[] expected = { };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

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

    @Test
    public void DisplaysAllMoviesInReverseOrder() {
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

        String[] expected = {"Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void DisplaysSingleMoviesInReverseOrder() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void UnlimitedWithZeroValue() {
        FilmsManager manager = new FilmsManager();


        String[] expected = { };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void DisplayingFiveMoviesInReverseOrder() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");



        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void WhenThereIsMoreThanALimitOfTenWithoutALimit() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film XII");
        manager.addFilm("Film XI");
        manager.addFilm("Film X");
        manager.addFilm("Film IX");
        manager.addFilm("Film VIII");
        manager.addFilm("Film VII");
        manager.addFilm("Film VI");
        manager.addFilm("Film V");
        manager.addFilm("Film IV");
        manager.addFilm("Film III");
        manager.addFilm("Film II");
        manager.addFilm("Film I");


        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenTheLimitOfFilmsIsEleven() {
        FilmsManager manager = new FilmsManager(11);

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
        manager.addFilm("Film XI");


        String[] expected = {"Film XI", "Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenTheMovieIsTenAndTheLimitIsEleven() {
        FilmsManager manager = new FilmsManager(11);

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


    @Test
    public void WhenTheMovieIsOneAndTheLimitIsEleven() {
        FilmsManager manager = new FilmsManager(11);

        manager.addFilm("Film I");


        String[] expected = {"Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void WhenTheMovieIsZeroAndTheLimitIsEleven() {
        FilmsManager manager = new FilmsManager(11);


        String[] expected = { };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenTheMovieIsFamiliesAndTheLimitIsEleven() {
        FilmsManager manager = new FilmsManager(11);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");


        String[] expected = {"Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenThereIsMoreThanALimitWithALimitOfEleven() {
        FilmsManager manager = new FilmsManager(11);

        manager.addFilm("Film XII");
        manager.addFilm("Film XI");
        manager.addFilm("Film X");
        manager.addFilm("Film IX");
        manager.addFilm("Film VIII");
        manager.addFilm("Film VII");
        manager.addFilm("Film VI");
        manager.addFilm("Film V");
        manager.addFilm("Film IV");
        manager.addFilm("Film III");
        manager.addFilm("Film II");
        manager.addFilm("Film I");


        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X","Film XI"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
