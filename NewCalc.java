package HealthCalc;


public class NewCalc {
    public static void main(String[] args) {
        HealthCalc obj = new HealthCalc();
        obj.getData();

        // BMI
        obj.BMIDescription();
        obj.countBMI(obj.getMass(), obj.getHeight());
        obj.rangeBMI();
        obj.countHowMuchKilosDoIhaveToLoseOnWeight(obj.getHeight(), obj.getMass());
        obj.countHowMuchKilosDoIhaveToPutOnWeight(obj.getHeight(), obj.getMass());
        obj.causesUnderweight();
        obj.treatmentUnderweight();
        obj.causesOverweight();
        obj.treatmentOverweight();

        // BMR
        obj.BMRDescription();
        obj.countBMR(obj.getGender(), obj.getHeight(), obj.getMass(), obj.getAge());

        // TMR
        obj.TMRDescription();
        obj.countTMR(obj.getResultBMR(), obj.getActivity());

        // Calorie Calculator
        obj.CalorieDescription();
        obj.caloriesCalculator(obj.getResultTMR(), obj.getPlans());

        // Water Calc
        obj.WaterDescription();
        obj.countWater(obj.getMass());

        // Nutrients
        obj.nutrientsDescription();
        obj.countProtein(obj.getMass());
        obj.countFat(obj.getCalorieCalculator());
        obj.countCarbs(obj.getCalorieCalculator());
        obj.yourNutrients();
    }
}
