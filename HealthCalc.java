package HealthCalc;

import java.util.Scanner;

public class HealthCalc {

    private double mass;
    private double height;
    private double age;
    private int activity;
    private int plans;
    private String gender;

    // <<<< Getters and setters >>>>

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        if (mass > 300) throw new IllegalArgumentException("Enter the weight up to 300 kg. ");
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if ((height < 100) || (height > 250))
            throw new IllegalArgumentException("The height could be from 100 cm to 250 cm. ");
        this.height = height / 100;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if (age < 0) throw new IllegalArgumentException("The age cannot be a negative number.");
        this.age = age;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public int getPlans() {
        return plans;
    }

    public void setPlans(int plans) {
        this.plans = plans;
    }

    public double getBMIResult() {
        return BMIResult;
    }

    public void setBMIResult(double BMIResult) {
        this.BMIResult = BMIResult;
    }

    public double getResultTMR() {
        return resultTMR;
    }

    public void setResultTMR(double resultTMR) {
        this.resultTMR = (int) resultTMR;
    }

    public int getResultBMR() {
        return resultBMR;
    }

    public void setResultBMR(int resultBMR) {
        this.resultBMR = resultBMR;
    }

    public int getCalorieCalculator() {
        return caloriesCalculator;
    }

    public void setCalorieCalculator(int calorieCalculator) {
        caloriesCalculator = calorieCalculator;
    }

    public double getPutOnWeight() {
        return putOnWeight;
    }

    public void setPutOnWeight(double putOnWeight) {
        this.putOnWeight = putOnWeight;
    }

    public double getLostOnWeight() {
        return lostOnWeight;
    }

    public void setLostOnWeight(double lostOnWeight) {
        this.lostOnWeight = lostOnWeight;
    }

    public int getCaloriesCalculator() {
        return caloriesCalculator;
    }

    public void setCaloriesCalculator(int caloriesCalculator) {
        this.caloriesCalculator = caloriesCalculator;
    }

    public double getDoubleResultWater() {
        return doubleResultWater;
    }

    public void setDoubleResultWater(double doubleResultWater) {
        this.doubleResultWater = doubleResultWater;
    }

    public int getResultProteinKcal() {
        return resultProteinKcal;
    }

    public void setResultProteinKcal(int resultProteinKcal) {
        this.resultProteinKcal = resultProteinKcal;
    }

    public int getResultFatGrams() {
        return resultFatGrams;
    }

    public void setResultFatGrams(int resultFatGrams) {
        this.resultFatGrams = resultFatGrams;
    }

    public int getResultCarbsKcal() {
        return resultCarbsKcal;
    }

    public void setResultCarbsKcal(int resultCarbsKcal) {
        this.resultCarbsKcal = resultCarbsKcal;
    }

    // <<<< Get data >>>>>

    protected void getData() {
        Scanner index = new Scanner(System.in);

        System.out.println("What is your gender, male of female? (M/F)");
        gender = index.nextLine();

        System.out.println("How old are you?: ");
        setAge(Double.parseDouble(index.nextLine()));

        System.out.println("Enter your mass [kg]: ");
        setMass(Double.parseDouble(index.nextLine()));

        System.out.println("Enter your height [cm]: ");
        setHeight(Double.parseDouble(index.nextLine()));

        System.out.println("Enter your activity level:"
                + "\n" + "1. Sedentary: little or no exercise."
                + "\n" + "2. Lightly active - exercise 1-3 times/week."
                + "\n" + "3. Moderately active - exercise 4-5 times/week."
                + "\n" + "4. Very active - intense exercise 6-7 times/week."
                + "\n" + "5. Super active - very intense exercise daily, or physical job.");

        activity = Integer.parseInt(index.nextLine());

        System.out.println("What are you going to do?:"
                + "\n" + "1. I want to gain weight."
                + "\n" + "2. I want to keep my weight."
                + "\n" + "3. I want to lose my weight.");

        plans = Integer.parseInt(index.nextLine());
    }

    // <<<< BMI >>>>>

    protected void BMIDescription() {
        System.out.println("\n" + "<<<< BMI >>>>>" + "\n" + "Body Mass Index (BMI) is a simple dietary calculator " +
                "indicating the ratio of weight to height.");
    }

    private double BMIResult;
    private double putOnWeight;
    private double lostOnWeight;

    private int range1 = 0;
    private int range2 = 15;
    private int range3 = 16;
    private double range4 = 18.5;
    private int range5 = 25;
    private int range6 = 30;
    private int range7 = 35;
    private int range8 = 40;

    private String category1 = "very severely underweight";
    private String category2 = "severely underweight";
    private String category3 = "underweight";
    private String category4 = "healthy weight";
    private String category5 = "overweight";
    private String category6 = "moderately obese";
    private String category7 = "severely obese";
    private String category8 = "very severely obese";

    private String index1 = "low";
    private String index2 = "normal";
    private String index3 = "high";


    private String risk1 = " - as a moderate risk";
    private String risk2 = " - as a high risk";

    String text1 = "You are ";
    String text2 = " - the result of your Body Mass Index is ";
    String text3 = "In the near future you can have problems with ";


    String healthRisks1 = "nutritional deficiency, osteoporosis, anemia, skin problems, hair problems," +
            "teeth problems";
    String healthRisks2 = "heart disease, high blood pressure, stroke, diabetes";

    protected void verySeverelyUnderweightRangesDescription() {
        System.out.println(text1 + category1 + text2 + index1 + "." + "\n" + text3 + healthRisks1 + ".");
    }

    protected void severelyUnderweightRangesDescription() {
        System.out.println(text1 + category2 + text2 + index1 + "\n" + text3 + healthRisks1 + ".");
    }

    protected void underweightRangesDescription() {
        System.out.println(text1 + category3 + text2 + index1 + "\n" + text3 + healthRisks1 + ".");
    }

    protected void normalRangesDescription() {
        System.out.println(text1 + category4 + text2 + index2 + ".");
    }

    protected void overweightRangesDescription() {
        System.out.println(text1 + category5 + text2 + index3 + "\n" + text3 + healthRisks2 + risk1 + ".");
    }

    protected void obeseIRangesDescription() {
        System.out.println(text1 + category6 + text2 + index3 + "\n" + text3 + healthRisks2 + risk1 + ".");
    }

    protected void obeseIIRangesDescription() {
        System.out.println(text1 + category7 + text2 + index3 + "\n" + text3 + healthRisks2 + risk2 + ".");
    }

    protected void obeseIIIRangesDescription() {
        System.out.println(text1 + category8 + text2 + index3 + "\n" + text3 + healthRisks2 + risk2 + ".");
    }

    protected double countBMI(double mass, double height) {
        BMIResult = mass / (height * height);
        System.out.format("\n" + "Your BMI is " + "%.2f%n", BMIResult);
        return (int) BMIResult;
    }

    protected void rangeBMI() {
        if (BMIResult > range1 && BMIResult < range2) {
            verySeverelyUnderweightRangesDescription();
        } else if (BMIResult > range2 && BMIResult < range3) {
            severelyUnderweightRangesDescription();
        } else if (BMIResult > range3 && BMIResult < range4) {
            underweightRangesDescription();
        } else if (BMIResult > range4 && BMIResult < range5) {
            normalRangesDescription();
        } else if (BMIResult > range5 && BMIResult < range6) {
            overweightRangesDescription();
        } else if (BMIResult > range6 && BMIResult < range7) {
            obeseIRangesDescription();
        } else if (BMIResult > range7 && BMIResult < range8) {
            obeseIIRangesDescription();
        } else if (BMIResult > range8) {
            obeseIIIRangesDescription();
        } else {
            System.out.println("Invalid value");
        }
    }

    protected double countHowMuchKilosDoIhaveToPutOnWeight(double height, double mass) {
        if (BMIResult < range4) {
            putOnWeight = (range4 * height * height) - mass;
            int IntPutOnWeight = (int) putOnWeight;
            System.out.format("If you want your BMI to be normal, you need to put on weight at least " + IntPutOnWeight + " kg.");
        } else System.out.println();
        return putOnWeight;
    }

    protected double countHowMuchKilosDoIhaveToLoseOnWeight(double height, double mass) {
        if (BMIResult > range5) {
            lostOnWeight = mass - (range5 * height * height);
            int IntLostOnWeight = (int) lostOnWeight;
            System.out.format("You should lost on weight at least " + IntLostOnWeight + " kg." + "\n");
        } else System.out.println();
        return lostOnWeight;
    }

    protected void causesUnderweight() {
        if (BMIResult < range4) {
            System.out.println("\n" + "There are a variety of reasons why you may be " +
                    category3 + ". " + "Causes of being " + category3 + " include: ");

            String[] causesUnderweight = new String[6];
            {
                causesUnderweight[0] = "family history";
                causesUnderweight[1] = "high metabolism";
                causesUnderweight[2] = "frequent physical activity";
                causesUnderweight[3] = "psychical illness";
                causesUnderweight[4] = "chronic disease";
                causesUnderweight[5] = "mental illness";
            }
            for (String causesU : causesUnderweight) {

                if (BMIResult < range4) {
                    System.out.println("\n" + "- " + causesU + ",");
                }
            }
        }
    }

    protected void treatmentUnderweight() {
        if (BMIResult < range4) {

            System.out.println("\n" + "A doctor can help you identify the cause of your " + index1 + " BMI and recommend " +
                    "a treatment plan that allows you to gain weight healthfully." + "You should gain weight by following a healthful diet that " +
                    "incorporates nutritious calorie-dense foods." + "During the visit doctor may recommend you to try " +
                    "a specific diet for weight gain or refer to a dietitian, " + "who can help you to develop a diet plan " +
                    "that works for you. " + "Quick tips to you: ");

            String[] tipsUnderweight = new String[4];
            {
                tipsUnderweight[0] = "add snacks";
                tipsUnderweight[1] = "eat several small meals during all day";
                tipsUnderweight[2] = "incorporate additional food";
                tipsUnderweight[3] = "avoid empty calories";
            }

            for (String tipsU : tipsUnderweight) {

                if (BMIResult < range4) {
                    System.out.println("\n" + "- " + tipsU + ",");
                }
            }
        }
    }

    protected void causesOverweight() {
        if (BMIResult > range5) {

            System.out.println("\n" + "There are a variety of reasons why you may be " + category5 + ". "
                    + "Causes of being " + category5 + " include: ");

            String[] causesOverweight = new String[7];
            {
                causesOverweight[0] = "eating too much - large amounts of processed or fast food";
                causesOverweight[1] = "drinking to much sugar drinks and alcohol";
                causesOverweight[2] = "eating out a lot";
                causesOverweight[3] = "eating larger portions that you need";
                causesOverweight[4] = "lack of physical activity";
                causesOverweight[5] = "genetics";
                causesOverweight[6] = "medical reasons";
            }

            for (String causesO : causesOverweight) {
                if (BMIResult > range5) {
                    System.out.println("\n" + "- " + causesO + ",");
                }
            }
        }
    }

    protected void treatmentOverweight() {
        if (BMIResult > range5) {
            System.out.println("A doctor can help you identify the cause of your " + index3 + " BMI and recommend " +
                    "a treatment plan that allows you to lose weight healthfully." + "During the visit doctor may recommend you to try " +
                    "a specific diet for weight lose or refer to a dietitian," + "who can help you to develop a diet plan " +
                    "that works for you." + "Quick tips to you: ");

            String tipsOverweight[] = new String[4];

            {
                tipsOverweight[0] = "emphasize fruits, vegetables, whole grains and fat-free or low-fat milk and dairy products";
                tipsOverweight[1] = "include lean meats, poultry, fish, beans, eggs and nuts";
                tipsOverweight[2] = "eat a diet low in saturated fats: trans fats, cholesterol, salt (sodium), and added sugars";
                tipsOverweight[3] = "drink more water instead of sugary drinks";
            }
            for (String tipsO : tipsOverweight) {

                if (BMIResult > range5) {
                    System.out.println("\n" + "- " + tipsO + ",");
                }
            }
        }
    }

    // <<<< BMR >>>>>

    protected void BMRDescription() {
        System.out.println("\n" + "<<<< BMR >>>>>" + "\n" + "Basal Metabolic Rate (BMR) is the number of calories required " +
                "to keep your body functioning at rest. ");
    }

    private int resultBMR;

    protected double countBMR(String gender, double height, double mass, double age) {

        if (gender.equals("F") || gender.equals("f")) {
            resultBMR = (int) ((int) ((9.99 * mass) + (625 * height)) - (4.92 * age) - 161);
            System.out.println(" The  amount of calories that would you burn if you were asleep all day is "
                    + resultBMR + " kcal.");

        } else if (gender.equals("M") || gender.equals("m")) {
            resultBMR = (int) ((int) ((9.9 * mass) + (625 * height)) - (4.92 * age) + 5);
            System.out.println("The  amount of calories that would you burn if you were asleep all day is "
                    + resultBMR + " kcal.");
        }

        return resultBMR;
    }


    protected void TMRDescription() {
        System.out.println("\n" + "<<<< TMR >>>>>" + "\n" + "Total Metabolic Rate (TMR) is the number of calories required " +
                "to keep your body functioning including physical activities.");
    }

    private int resultTMR;

    protected double countTMR(int resultBMR, int activity) {
        if (activity == 1) {
            resultTMR = (int) (resultBMR * 1.2);
            System.out.println("The estimation of the number of calories required per day based on your current " +
                    "activity level is: " + resultTMR + " kcal.");
        } else if (activity == 2) {
            resultTMR = (int) (resultBMR * 1.3);
            System.out.println("The estimation of the number of calories required per day based on your current " +
                    "activity level is: " + resultTMR + " kcal.");
        } else if (activity == 3) {
            resultTMR = (int) (resultBMR * 1.5);
            System.out.println("The estimation of the number of calories required per day based on your current " +
                    "activity level is: " + resultTMR + " kcal.");
        } else if (activity == 4) {
            resultTMR = (int) (resultBMR * 1.7);
            System.out.println("The estimation of the number of calories required per day based on your current " +
                    "activity level is: " + resultTMR + " kcal.");
        } else if (activity == 5) {
            resultTMR = (int) (resultBMR * 1.9);
            System.out.println("The estimation of the number of calories required per day based on your current " +
                    "activity level is: " + resultTMR + " kcal.");
        }
        return resultTMR;
    }

    protected void CalorieDescription() {
        System.out.println("\n" + "<<<< CALORIES CALCULATOR >>>>>" + "\n" + "Calories Calculator is given the result of calories required " +
                "to keep your body in good shape taking into your healthy goals. ");
    }

    private int caloriesCalculator;

    protected double caloriesCalculator(double resultTMR, int plans) {
        if (plans == 1) {
            caloriesCalculator = (int) resultTMR + 500;
            System.out.println("To gain the weight you need to consume " + caloriesCalculator + " kcal a day.");
        } else if (plans == 2) {
            caloriesCalculator = (int) resultTMR;
            System.out.println("To keep the weight you need to consume " + caloriesCalculator + " kcal a day.");
        } else if (plans == 3) {
            caloriesCalculator = (int) resultTMR - 500;
            System.out.println("To lose the weight you need to consume " + caloriesCalculator + " kcal a day.");
        }
        return caloriesCalculator;
    }

    // <<<< Water Calc >>>>>

    protected void WaterDescription() {
        System.out.println("\n" + "<<<< WATER CALCULATOR >>>>>" + "\n" + "The calculator will show your hydration level based on the information you give about yourself " +
                "and your daily drinking habits.");
    }

    private double doubleResultWater;

    protected double countWater(double mass) {
        doubleResultWater = mass * 35;
        int resultWater = (int) doubleResultWater;
        System.out.format("Your need drink at least " + resultWater + " ml water everyday.");
        return resultWater;
    }

    // <<<< Nutrients >>>>

    private double dResultProtein;
    private double dResultFat;
    private int dResultCarbs;
    private int resultProteinKcal;
    private int resultFatKcal;
    private int resultCarbsKcal;
    private int resultProteinGrams;
    private int resultFatGrams;
    private int resultCarbsGrams;

    protected void nutrientsDescription() {
        System.out.println("\n" + "<<<< NUTRIENTS DESCRIPTION >>>>>" + "\n" + "Every diet should consist of three " +
                "nutrients: proteins, fats and carbohydrates. Here's how to balance these nutrients in your" +
                " healthy diet.");
    }

    protected double countProtein(double mass) {
        dResultProtein = mass * 2;
        resultProteinKcal = (int) dResultProtein;
        resultProteinGrams = resultProteinKcal * 4;
        return resultProteinKcal;
    }


    protected double countFat(int caloriesCalculator) {
        dResultFat = caloriesCalculator / 5;
        resultFatKcal = (int) dResultFat;
        resultFatGrams = resultFatKcal / 9;
        return resultFatKcal;
    }


    protected double countCarbs(int caloriesCalculator) {
        dResultCarbs = (int) (caloriesCalculator - (dResultProtein + dResultFat));
        resultCarbsKcal = dResultCarbs;
        resultCarbsGrams = resultCarbsKcal / 4;
        return resultCarbsKcal;
    }

    protected void yourNutrients() {

        System.out.println("You should eat: " + resultProteinGrams + " grams of proteins " + "(" + resultProteinKcal + " kcal), "
                + resultFatGrams + " grams of fats " + "(" + resultFatKcal + " kcal) and " + resultCarbsGrams +
                " grams of carbohydrates " + "(" + resultCarbsKcal + " kcal).");
    }
}


