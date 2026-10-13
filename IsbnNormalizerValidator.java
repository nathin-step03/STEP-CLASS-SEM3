public class IsbnNormalizerValidator {
    static String normalizeCode(String raw){String s=raw.trim();return s.length()<3?s.toUpperCase():s.substring(0,3).toUpperCase()+s.substring(3);}
    static String validateAndFormat(String code){if(code.length()!=13)return "Invalid: code must be exactly 13 characters";for(int i=0;i<3;i++)if(!Character.isLetter(code.charAt(i)))return "Invalid: publisher code must be 3 letters";for(int i=3;i<13;i++)if(!Character.isDigit(code.charAt(i)))return "Invalid: code body must contain 10 digits";return new StringBuilder().append("[").append(code,0,3).append("] YEAR: 20").append(code,3,5).append(" | CATALOG: ").append(code,7,13).toString();}
    public static void main(String[] args){String c=normalizeCode(" pen2026004251 ");System.out.println(validateAndFormat(c));}
}
