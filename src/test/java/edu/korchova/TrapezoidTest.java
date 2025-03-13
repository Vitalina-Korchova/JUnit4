package edu.korchova;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
    @author Віталіна
    @project JUnit4
    @class TrapezoidTest
    @version 1.0.0
    @since 13.03.2025 - 17-30
*/

public class TrapezoidTest {

    private Trapezoid trapezoid = new Trapezoid(10,6,5,7,7);

    @Test
    public void whenBaseFirst_10_BaseSecond_6_ThenArea_40() {
        assertEquals(trapezoid.getArea(),40, 0.001 );
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_SideFirst_7_SideSecond_7_ThenPerimeter_30() {
        assertEquals(trapezoid.getPerimeter(),30, 0.001 );
    }

    @Test
    public void whenSideFirst_7_SideSecond_7_ThenTrapezoidIsIsosceles() {
        assertEquals(trapezoid.isIsosceles(), true);
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_SideFirst_7_SideSecond_7_Height_5_ThenTrapezoidIsRightAngled() {
        assertEquals(trapezoid.isRightAngled(), false);
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_ThenMidSegment_8() {
        assertEquals(trapezoid.getMidSegment(),8, 0.001 );
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_SideFirst_7_SideSecond_7_Height_5_ThenTrapezoidIsEquilateral() {
        assertEquals(trapezoid.isEquilateral(), false);
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_Height_5_ThenDiagonal_6() {
        assertEquals(trapezoid.getDiagonal(),6.4031242374328485, 0.001 );
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_Height_5_ThenBaseAngle_minus1() {  //має повернути -1, бо трапеція не прямокутна
        assertEquals(trapezoid.getBaseAngle(),-1, 0.001 );
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_SideFirst_7_SideSecond_7_ThenAngleBetweenSides_73() {
        assertEquals(trapezoid.getAngleBetweenSides(),73.39845040097977, 0.001 );
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_SideFirst_7_SideSecond_7_ThenDiagonalAngle_60() {
        assertEquals(trapezoid.getDiagonalAngle(),73.39845040097977, 0.001 );
    }
}