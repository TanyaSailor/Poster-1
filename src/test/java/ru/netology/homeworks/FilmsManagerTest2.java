package ru.netology.homeworks;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest2 {

    @Test
    public void shouldGetFindLast() {
        FilmsManager manager = new FilmsManager();

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");

        manager.findLast();

        String[] expected = {"film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetFindLastMaxLimit() {
        FilmsManager manager = new FilmsManager();

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");

        manager.findLast();

        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetFindLastAboveMaxLimit() {
        FilmsManager manager = new FilmsManager();

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");

        manager.findLast();

        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetFindLastUnderMaxLimit() {
        FilmsManager manager = new FilmsManager();

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");


        manager.findLast();

        String[] expected = {"film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}

