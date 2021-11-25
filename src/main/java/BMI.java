

public class BMI {
    private String firstname;
    private String lastname;
    private int bodyHeight;
    private double bodyWeight;
    private char gender;

    public BMI(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public double calculateBMI(){
        double bmi = bodyWeight/Math.pow((bodyHeight*1.0/100),2);
        return Math.round(bmi*100)/100.0;
    }
    public int calculateBMICategory() {
        double bmi2 = calculateBMI();
        switch (gender) {
            case 'M':
                if (bmi2 < 16.00) {
                    return -2;
                } else if (bmi2 >= 16.00 && bmi2 <= 18.4) {
                    return -1;
                } else if (bmi2 >= 18.5 && bmi2 <= 24.9) {
                    return 0;
                } else if (bmi2 >= 25.0 && bmi2 <= 34.9) {
                    return 1;
                } else if (bmi2 >=35){
                    return 2;
                }
                break;
            case 'W':
                if (bmi2 < 15.00) {
                    return -2;
                } else if (bmi2 >= 15.00 && bmi2 <= 17.4) {
                    return -1;
                } else if (bmi2 >= 17.5 && bmi2 <= 23.9) {
                    return 0;
                } else if (bmi2 >= 24.0 && bmi2 <= 33.9) {
                    return 1;
                } else if(bmi2>=34) {
                    return 2;
                }
                break;}
        return 0;
    }
    public String getBMICategoryName(){
        int cat =this.calculateBMICategory();
        if(cat == -2){
            return "Sehr starkes Untergewich";}
        else if(cat == -1){
            return "Untergewicht";}
        else if(cat ==0){
        return "Normalgewicht";}
        else if(cat ==-1){
            return "Übergewicht";}
            else{
                return "Sehr starkes Übergewicht";}
            }
        }
