public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] o1 = getO();
        String[] o2 = getO();
        String[] p = getP();
        String[] s = getS();

        String[] banner = new String[5];
        for (int i = 0; i < 5; i++) {
            banner[i] = String.join("  ", o1[i], o2[i], p[i], s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    static String[] getO() {
        return new String[] {" *** ", "*   *", "*   *", "*   *", " *** "};
    }

    static String[] getP() {
        return new String[] {"****", "*   *", "****", "*   ", "*   "};
    }

    static String[] getS() {
        return new String[] {" *** ", "*    ", " *** ", "    *", " *** "};
    }
}
