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

    private Trapezoid trapezoid = new Trapezoid(10,6,5,7,9);

    @Test
    public void whenBaseFirst_10_BaseSecond_6_ThenArea_40() {
        assertEquals(trapezoid.getArea(),40, 0.001 );
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_SideFirst_7_SideSecond_9_ThenPerimeter_32() {
        assertEquals(trapezoid.getPerimeter(),32, 0.001 );
    }

    @Test
    public void whenSideFirst_7_SideSecond_9_ThenTrapezoidIsNotIsosceles() {
        assertEquals(trapezoid.isIsosceles(), false);
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_SideFirst_7_SideSecond_9_Height_5_ThenTrapezoidIsNotRightAngled() {
        assertEquals(trapezoid.isRightAngled(), false);
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_ThenMidSegment_8() {
        assertEquals(trapezoid.getMidSegment(),8, 0.001 );
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_SideFirst_7_SideSecond_9_Height_5_ThenTrapezoidIsNotEquilateral() {
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
    public void whenBaseFirst_10_BaseSecond_6_SideFirst_7_SideSecond_9_ThenAngleBetweenSides_106() {
        assertEquals(trapezoid.getAngleBetweenSides(),106.60154959902025, 0.001 );
    }

    @Test
    public void whenBaseFirst_10_BaseSecond_6_SideFirst_7_SideSecond_9_ThenTrapezoidIsCyclic() {
        assertEquals(trapezoid.isCyclic() ,true);
    }
}