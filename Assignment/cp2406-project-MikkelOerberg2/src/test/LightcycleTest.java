package test;

import Tron.Lightcycle;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LightcycleTest {

    private final Lightcycle CYCLE_TEST = new Lightcycle("name", "red", 5, Lightcycle.UP, false);

    @org.junit.jupiter.api.Test
    void speedUp() {
        CYCLE_TEST.speedUp();
        assertEquals(6, CYCLE_TEST.getSpeed());
        CYCLE_TEST.speedUp();
        assertEquals(7, CYCLE_TEST.getSpeed());
        CYCLE_TEST.speedUp();
        assertEquals(8, CYCLE_TEST.getSpeed());
        CYCLE_TEST.speedUp();
        assertEquals(9, CYCLE_TEST.getSpeed());
        CYCLE_TEST.speedUp();
        assertEquals(10, CYCLE_TEST.getSpeed());
        CYCLE_TEST.speedUp();
        assertEquals(10, CYCLE_TEST.getSpeed());
    }

    @org.junit.jupiter.api.Test
    void speedDown() {
        CYCLE_TEST.speedDown();
        assertEquals(4, CYCLE_TEST.getSpeed());
        CYCLE_TEST.speedDown();
        assertEquals(3, CYCLE_TEST.getSpeed());
        CYCLE_TEST.speedDown();
        assertEquals(2, CYCLE_TEST.getSpeed());
        CYCLE_TEST.speedDown();
        assertEquals(1, CYCLE_TEST.getSpeed());
        CYCLE_TEST.speedDown();
        assertEquals(1, CYCLE_TEST.getSpeed());
    }

    @org.junit.jupiter.api.Test
    void turnClockwise() {
        CYCLE_TEST.turnClockwise();
        assertEquals(Lightcycle.RIGHT, CYCLE_TEST.getDir());
        CYCLE_TEST.turnClockwise();
        assertEquals(Lightcycle.DOWN, CYCLE_TEST.getDir());
        CYCLE_TEST.turnClockwise();
        assertEquals(Lightcycle.LEFT, CYCLE_TEST.getDir());
        CYCLE_TEST.turnClockwise();
        assertEquals(Lightcycle.UP, CYCLE_TEST.getDir());
    }

    @org.junit.jupiter.api.Test
    void turnAnticlockwise() {
        CYCLE_TEST.turnAnticlockwise();
        assertEquals(Lightcycle.LEFT, CYCLE_TEST.getDir());
        CYCLE_TEST.turnAnticlockwise();
        assertEquals(Lightcycle.DOWN, CYCLE_TEST.getDir());
        CYCLE_TEST.turnAnticlockwise();
        assertEquals(Lightcycle.RIGHT, CYCLE_TEST.getDir());
        CYCLE_TEST.turnAnticlockwise();
        assertEquals(Lightcycle.UP, CYCLE_TEST.getDir());
    }
}
