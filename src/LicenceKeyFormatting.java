public class LicenceKeyFormatting {

    public static void main(String[] args) {
        String input =  "2-5g-3-J";
        String input1 = "5F3Z-2e-9-w";
        System.out.println(licenseKeyFormatting(input1, 4));
    }

    public static String licenseKeyFormatting(String s, int k) {
        System.out.println("Input: "+ s);
        String withoutDash = s.replaceAll("-", "");  // 25g3J

        if (k >= withoutDash.length()) {
            return withoutDash.toUpperCase();
        }
        int firstGroupLength = withoutDash.length()%k;  // 1
        int segments = (withoutDash.length()/k) + firstGroupLength; // 3

        StringBuilder sb = new StringBuilder(withoutDash.substring(0, firstGroupLength));

        for (int i = 0; i < segments; i++) {
            System.out.println(sb);
            int beginIndex = i*k + firstGroupLength;
            int endIndex = beginIndex + k;
            if (endIndex < withoutDash.length() + 1) {
                    if (sb.length() > 0) {
                        sb.append("-");
                    }
                    sb.append(withoutDash, beginIndex, endIndex);
            }
        }
        return sb.toString().toUpperCase();
    }
}
