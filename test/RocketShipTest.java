import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RocketShipTest
{
    private static StringStream solutionStream = new StringStream();
    private static StringStream studentStream = new StringStream();
    private static int part1Score = 0;
    private static int part2Score = 0;

    @BeforeClass
    public static void testBegin()
    {
        System.out.println("\nRocketShip Tests:\n");
    }   //testBegin

    @AfterClass
    public static void testEnd()
    {
        System.out.printf("\nPart 1 total score = %d\n", part1Score);
        System.out.printf("Part 2 total score = %d\n", part2Score);
    }   //testEnd

    @Test
    public void part1IllegalSizes()
    {
        System.out.print("Part 1 - Test illegal size: ");

        solutionStream.setEnabled(true);
        RocketShipSample.drawRocket(0);
        RocketShipSample.drawRocket(-1);
        RocketShipSample.drawRocket(-6);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.drawRocket(0);
        RocketShip.drawRocket(-1);
        RocketShip.drawRocket(-6);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part1IllegalSizes

    @Test
    public void part1Size1()
    {
        System.out.print("Part 1 - Test size 1: ");

        solutionStream.setEnabled(true);
        RocketShipSample.drawRocket(1);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.drawRocket(1);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part1Size1

    @Test
    public void part1OddSizes()
    {
        System.out.print("Part 1 - Test odd sizes: ");

        solutionStream.setEnabled(true);
        RocketShipSample.drawRocket(3);
        RocketShipSample.drawRocket(5);
        RocketShipSample.drawRocket(7);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.drawRocket(3);
        RocketShip.drawRocket(5);
        RocketShip.drawRocket(7);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part1OddSizes

    @Test
    public void part1EvenSizes()
    {
        System.out.print("Part 1 - Test even sizes: ");

        solutionStream.setEnabled(true);
        RocketShipSample.drawRocket(2);
        RocketShipSample.drawRocket(4);
        RocketShipSample.drawRocket(6);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.drawRocket(2);
        RocketShip.drawRocket(4);
        RocketShip.drawRocket(6);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part1EvenSizes

    @Test
    public void part2OddSizeOddOffset()
    {
        System.out.print("Part 2 - Test odd size/odd offset: ");

        solutionStream.setEnabled(true);
        RocketShipSample.drawRocket(3, 7);
        RocketShipSample.drawRocket(5, 3);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.drawRocket(3, 7);
        RocketShip.drawRocket(5, 3);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2OddSizeOddOfset

    @Test
    public void part2OddSizeEvenOffset()
    {
        System.out.print("Part 2 - Test odd size/even offset: ");

        solutionStream.setEnabled(true);
        RocketShipSample.drawRocket(3, 6);
        RocketShipSample.drawRocket(5, 2);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.drawRocket(3, 6);
        RocketShip.drawRocket(5, 2);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2OddSizeEvenOffset

    @Test
    public void part2EvenSizeOddOffset()
    {
        System.out.print("Part 2 - Test even size/odd offset: ");

        solutionStream.setEnabled(true);
        RocketShipSample.drawRocket(2, 9);
        RocketShipSample.drawRocket(4, 5);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.drawRocket(2, 9);
        RocketShip.drawRocket(4, 5);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2EvenSizeOddOffset

    @Test
    public void part2EvenSizeEvenOffset()
    {
        System.out.print("Part 2 - Test even size/even offset: ");

        solutionStream.setEnabled(true);
        RocketShipSample.drawRocket(2, 8);
        RocketShipSample.drawRocket(4, 4);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.drawRocket(2, 8);
        RocketShip.drawRocket(4, 4);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2EvenSizeEvenOffset

    @Test
    public void part2rocketLaunchSequential()
    {
        System.out.print("Part 2 - Test rocketLaunch sequential: ");

        solutionStream.setEnabled(true);
        RocketShipSample.rocketLaunch(1, 3, 1);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.rocketLaunch(1, 3, 1);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2rocketLaunchSequential

    @Test
    public void part2rocketLaunchOddSizes()
    {
        System.out.print("Part 2 - Test rocketLaunch odd sizes: ");

        solutionStream.setEnabled(true);
        RocketShipSample.rocketLaunch(1, 9, 2);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.rocketLaunch(1, 9, 2);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2rocketLaunchOddSizes

    @Test
    public void part2rocketLaunchEvenSizes()
    {
        System.out.print("Part 2 - Test rocketLaunch even sizes: ");

        solutionStream.setEnabled(true);
        RocketShipSample.rocketLaunch(2, 10, 2);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.rocketLaunch(2, 10, 2);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2rocketLaunchEvenSizes

    @Test
    public void part2rocketLaunchRandom()
    {
        int max = (int)(Math.random()*20) + 1;
        int step = (int)(Math.random()*4) + 1;

        System.out.printf("Part 2 - Test rocketLaunch(1, %d, %d): ", max, step);

        solutionStream.setEnabled(true);
        RocketShipSample.rocketLaunch(1, max, step);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        RocketShip.rocketLaunch(1, max, step);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2rocketLaunchRandom

}   //class RocketShipTest
