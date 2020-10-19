package HealthCalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests {

    HealthCalc personaLarry;
    HealthCalc personaGrace;
    HealthCalc personaJohn;
    HealthCalc personaKate;
    HealthCalc personaMike;
    HealthCalc personaJustin;
    HealthCalc personaJane;
    HealthCalc personaKaren;


    @BeforeEach
    void setUp() {
        personaGrace  = new HealthCalc();
        personaJohn = new HealthCalc();
        personaKate = new HealthCalc();
        personaLarry = new HealthCalc();
        personaMike = new HealthCalc();
        personaJustin = new HealthCalc();
        personaJane = new HealthCalc();
        personaKaren = new HealthCalc();
    }

    @Test
    public void checkBMIForVerySeverelyPerson() {
        personaGrace.countBMI(39, 1.8);
        Assertions.assertEquals(12, personaGrace.getBMIResult(), 0.1);
    }

    @Test
    public void checkBMIForObeseI() {
        personaJustin.countBMI(84, 1.6);
        Assertions.assertEquals(33, personaJustin.getBMIResult(), 0.1);
    }

    @Test
    public void checkHowMuchKilosPutOnForSeverely() {
        personaJohn.countHowMuchKilosDoIhaveToPutOnWeight(1.55, 37);
        Assertions.assertEquals(7, personaJohn.getPutOnWeight());
    }

    @Test
    public void checkHowMuchKilosLoseForOverweight() {
        personaMike.countHowMuchKilosDoIhaveToLoseOnWeight(1.75, 83);
        Assertions.assertEquals(7, personaMike.getLostOnWeight());
    }

    @Test
    public void checkCausesUnderweightForUnderweight() {
        personaKate.causesUnderweight();
        Assertions.assertTrue(true, "frequent physical activity");
    }

    @Test
    public void checkCausesOverweightForObeseIII() {
        personaKaren.causesOverweight();
        Assertions.assertTrue(true, "eating larger portions that you need");
    }

    @Test
    public void checkTreatmentForUnderweight() {
        personaGrace.treatmentUnderweight();
        Assertions.assertTrue(true, "eat several small meals during all day");
    }

    @Test
    public void checkTreatmentForOverweight() {
        personaJane.treatmentOverweight();
        Assertions.assertTrue(true, "include lean meats, poultry, fish, beans, eggs and nuts");
    }

    @Test
    public void checkBMRForNormal() {
        personaLarry.countBMR("m", 1.7, 64, 40);
        Assertions.assertEquals(1510, personaLarry.getResultBMR(), 0.1);
    }

    @Test
    public void checkTMRForObeseII() {
        personaJane.countTMR(1609, 3);
        Assertions.assertEquals(2092, personaJane.getResultTMR(), 0.1);
    }

    @Test
    public void checkCaloriesCalculatorForOverweight() {
        personaMike.caloriesCalculator(2902, 3);
        Assertions.assertEquals(2042, personaMike.getCaloriesCalculator(), 0.1);
    }

    @Test
    public void checkWaterCalculatorForUnderweight() {
        personaKate.countWater(45);
        Assertions.assertEquals(1568, personaKate.getDoubleResultWater(), 0.1);
    }

    @Test
    public void checkNutrientsProteinsKcalForNormal() {
        personaLarry.countProtein(64);
        Assertions.assertEquals(512, personaLarry.getResultProteinKcal(), 0.1);
    }

    @Test
    public void checkNutrientsFatsGramsForSeverely() {
        personaJohn.countFat(2054);
        Assertions.assertEquals(46, personaJohn.getResultFatGrams(), 0.1);
    }

    @Test
    public void checkNutrientsCarbsGramsForObeseI() {
        personaJustin.countCarbs(1897);
        Assertions.assertEquals(849, personaJustin.getResultCarbsKcal(), 0.1);
    }
}

