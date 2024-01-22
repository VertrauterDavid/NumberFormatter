package net.vertrauterdavid;

import java.text.DecimalFormat;

public class NumberFormatter {

    public static String numberToString(double d) {
        for (Format format : Format.values()) {
            if (d >= (double) format.getRangeMin() && d <= (double) format.getRangeMax()) {
                double calculatedBalance = d / (double) format.getDivide();
                DecimalFormat df = new DecimalFormat("#.##");
                return df.format(calculatedBalance) + format.getFormat();
            }
        }
        return String.valueOf((long) d);
    }

    public static double stringToNumber(String s) {
        try {
            for (Format format : Format.values()) {
                if (s.toUpperCase().endsWith(format.getFormat().toUpperCase())) {
                    return Double.parseDouble(s.substring(0, s.length() - 1)) * format.getDivide();
                }
            }
            return Double.parseDouble(s);
        } catch (NumberFormatException ignored) { }
        return -1;
    }

}
