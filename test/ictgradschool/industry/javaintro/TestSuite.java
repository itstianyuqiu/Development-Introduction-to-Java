package ictgradschool.industry.javaintro;

import ictgradschool.industry.javaintro.ex03.TestExerciseThree;
import ictgradschool.industry.javaintro.ex04.TestExerciseFour;
import ictgradschool.industry.javaintro.ex05.TestExerciseFive;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestExerciseThree.class,
        TestExerciseFour.class,
        TestExerciseFive.class
})
public class TestSuite { }
