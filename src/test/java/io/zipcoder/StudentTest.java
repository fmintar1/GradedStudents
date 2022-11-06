package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.*;

public class StudentTest {

    String firstName = "Freddy";
    String lastName = "Mintarja";
    Double[] examScores = {90.5};
    Student student = new Student(firstName, lastName, examScores);

//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
    @Test
    public void getFirstNameTest() {
        student.setFirstName("Freddy");
        Assert.assertEquals(firstName, student.getFirstName());
    }
}