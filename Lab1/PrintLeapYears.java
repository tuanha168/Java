public class PrintLeapYears {
    public static void main(String[] args) {
        int startyear = 999;
        int endyear = 2010;
        int leapyears = 0;
        for (int i = startyear; i <= endyear; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                leapyears++;
            }
        }
        System.out.print(leapyears);
    }
}