package ru.netology.homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void shouldAddFilm() {
        FilmsManager manager = new FilmsManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");

        manager.findAll();

        String[] expected = {"film1", "film2", "film3", "film4", "film5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldGetFindLastAddAtAboveLimit() {
        FilmsManager manager = new FilmsManager(5);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");

        manager.findLast();

        String[] expected = {"film6", "film5", "film4", "film3", "film2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFindLastAddAtMaxLimit() {
        FilmsManager manager = new FilmsManager(3);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");

        manager.findLast();

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetFindLastAddAtUnderLimit() {
        FilmsManager manager = new FilmsManager(5);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");


        manager.findLast();

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
