/**
 * OOPSBannerApp
 *
 * UC4: Refactored using String array and loop
 *
 * @author Laasya
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

                String.join("    ",
                        " ***** ",
                        " ***** ",
                        " ***** ",
                        " ***** "),

                String.join("    ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*      "),

                String.join("    ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*      "),

                String.join("    ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        " ***** "),

                String.join("    ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "      *"),

                String.join("    ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "      *"),

                String.join("    ",
                        " ***** ",
                        " ***** ",
                        "*      ",
                        " ***** ")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
