package students;


public class SpecializationLogic {
    public String DateOfBirth;

    public SpecializationLogic() {
    }


    public boolean isLeapYear() {

        String[] values = DateOfBirth.split("\\.");
        int year = Integer.parseInt(values[2]);

        return year % 4 == 0;
    }

    public String getZodiacSign() {

        String[] values = DateOfBirth.split("\\.");
        int day = Integer.parseInt(values[0]);
        int month = Integer.parseInt(values[1]);

        String zodiacSign = "";

        if (month == 1) {
            if (day > 20) {
                zodiacSign = "Vodnar";
            } else {
                zodiacSign = "Kozoroh";
            }
        } else if (month == 2) {
            if (day > 20) {
                zodiacSign = "Ryba";
            } else {
                zodiacSign = "Vodnar";
            }
        } else if (month == 3) {
            if (day > 20) {
                zodiacSign = "Beran";
            } else {
                zodiacSign = "Ryba";
            }
        } else if (month == 4) {
            if (day > 20) {
                zodiacSign = "Byk";
            } else {
                zodiacSign = "Beran";
            }
        } else if (month == 5) {
            if (day > 20) {
                zodiacSign = "Blizenec";
            } else {
                zodiacSign = "Byk";
            }
        } else if (month == 6) {
            if (day > 21) {
                zodiacSign = "Rak";
            } else {
                zodiacSign = "Blizenec";
            }
        } else if (month == 7) {
            if (day > 22) {
                zodiacSign = "Lev";
            } else {
                zodiacSign = "Rak";
            }
        } else if (month == 8) {
            if (day > 22) {
                zodiacSign = "Panna";
            } else {
                zodiacSign = "Lev";
            }
        } else if (month == 9) {
            if (day > 22) {
                zodiacSign = "Vahy";
            } else {
                zodiacSign = "Panna";
            }
        } else if (month == 10) {
            if (day > 23) {
                zodiacSign = "Styr";
            } else {
                zodiacSign = "Vahy";
            }
        } else if (month == 11) {
            if (day > 22) {
                zodiacSign = "Strelec";
            } else {
                zodiacSign = "Styr";
            }
        } else if (month == 12) {
            if (day > 21) {
                zodiacSign = "Kozoroh";
            } else {
                zodiacSign = "Vodnar";
            }
        }
        return zodiacSign;
    }
}
