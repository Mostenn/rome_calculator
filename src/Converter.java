import static java.util.Objects.isNull;

public class Converter {

    // "I" "V" "X" "L" "C" "D" "M"


    private String romeString(int arabDigit, String romeDigit, String mRomeDigit, String nextRomeDigit) {
        String romeStr = "";
        if (arabDigit == 1) {
            romeStr = romeDigit;
        } else if (arabDigit == 5) {
            romeStr = mRomeDigit;
        } else if (arabDigit == 10) {
            romeStr = nextRomeDigit;
        } else if (arabDigit == 4) {
            romeStr = romeDigit + mRomeDigit;
        } else if (arabDigit == 9) {
            romeStr = romeDigit + nextRomeDigit;
        } else if (arabDigit < 4) {
            for (int i = 0; i < arabDigit; i++) {
                romeStr = romeStr + romeDigit;
            }
        } else if (arabDigit > 6) {
            for (int i = 5; i < arabDigit; i++) {
                romeStr = romeDigit + romeStr;
            }
            romeStr = mRomeDigit + romeStr;
        }

        return romeStr;
    }

    public String Converter(String arab) {
        String rome = "";
        String unitsStr = "";
        String dozensStr = "";
        String hundredsStr = "";
        String thousandsStr = "";

        int arabLength = arab.toCharArray().length;

        if (arabLength == 4) {
            int units = Integer.valueOf(String.valueOf(arab.charAt(3)));
            int dozens = Integer.valueOf(String.valueOf(arab.charAt(2)));
            int hundreds = Integer.valueOf(String.valueOf(arab.charAt(1)));
            int thousands = Integer.valueOf(String.valueOf(arab.charAt(0)));

            unitsStr = romeString(units, "I", "V", "X");
            dozensStr = romeString(dozens, "X", "L", "C");
            hundredsStr = romeString(hundreds, "C", "D", "M");
            thousandsStr = romeString(thousands, "M", "", "");
        } else if (arabLength == 3) {
            int units = Integer.valueOf(String.valueOf(arab.charAt(2)));
            int dozens = Integer.valueOf(String.valueOf(arab.charAt(1)));
            int hundreds = Integer.valueOf(String.valueOf(arab.charAt(0)));

            unitsStr = romeString(units, "I", "V", "X");
            dozensStr = romeString(dozens, "X", "L", "C");
            hundredsStr = romeString(hundreds, "C", "D", "M");
        } else if (arabLength == 2) {
            int units = Integer.valueOf(String.valueOf(arab.charAt(1)));
            int dozens = Integer.valueOf(String.valueOf(String.valueOf(arab.charAt(0))));

            unitsStr = romeString(units, "I", "V", "X");
            dozensStr = romeString(dozens, "X", "L", "C");
        } else if (arabLength == 1) {
            int units = Integer.valueOf(String.valueOf(arab.charAt(0)));
            unitsStr = romeString(units, "I", "V", "X");
        }

        rome = thousandsStr + hundredsStr + dozensStr + unitsStr;


        return rome;
    }


}
