package session6;

public class StringExamples {
    public static void main(String[] args) {
//        stringPool();
//        stringOperators();
//        stringMethods();
        sb();
    }

    public static void stringPool() {
        String str1 = "Hello world";
        String str2 = "Hello world";
        String str3 = new String("Hello world");
        String str4 = new String("Hello world");
        String str5 = new String("Hello");

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 location: " + System.identityHashCode(str1));
        System.out.println("str2 location: " + System.identityHashCode(str2));

        System.out.println("str3 == str4: " + (str3 == str4));
        System.out.println("str3 location: " + System.identityHashCode(str3));
        System.out.println("str4 location: " + System.identityHashCode(str4));
        System.out.println("str3 equals str4? : " + str3.equals(str4));

        str2 = "hello world";
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 location: " + System.identityHashCode(str1));
        System.out.println("str2 location: " + System.identityHashCode(str2));
    }

    public static void stringOperators() {
        String code1 = "PROD123";
        String code2 = new String("PROD123");
        String code3 = "PROD123";
        String code4 = "PROD";

        code4 = code4 + 12;  //code4 += 12;
        System.out.println(" valoare lui code4 " + code4);
        System.out.println("comparam code1 cu code4 : " + (code1 == code4));
        System.out.println("compaeram code1 cu code3 : " + (code1 == code3));
        System.out.println("comparam code1 cu code2 : " + (code1 == code2));

        System.out.println(code1 + 123 + true + "final de string");
        System.out.println(123 + 17 + " inceput " + code4 + 123 + " final");
    }

    public static void stringMethods() {
        String str1 = "Hello world";
        String str2 = "hello world";

        System.out.println("str1 == str2 :" + (str1 == str2));
        System.out.println("str1 equals str2 :" + str1.equals(str2));
        System.out.println("str1 equlas ignore str2 : " + str1.equalsIgnoreCase(str2));
        System.out.println("dimensiunea lui str1 : " + str1.length());
        System.out.println("caracterul de pe pozitia 2: " + str1.charAt(2));
        System.out.println("indexul lui o : " + str1.indexOf('o'));
        System.out.println("substring din str1 : " + str1.substring(1, 4));
        System.out.println("subctring din str1 : " + str1.substring(3));
        System.out.println("lowercase str1 : " + str1.toLowerCase());
        System.out.println("uppercase str1 : " + str1.toUpperCase());

        System.out.println("starts with H? " + str1.startsWith("H"));
        System.out.println("starts with Hell? " + str1.startsWith("Hell"));
        System.out.println("starts with Ha? " + str1.startsWith("Ha"));
        System.out.println("ends with ld? " + str1.endsWith("ld"));

        String str3 = "Hello world";
        System.out.println("mijlocul lui str3 : " + str3.length() / 2);
        int pozitieMijloc = str3.length() / 2;
        String mijlocStr3 = str3.substring((pozitieMijloc - 1), (pozitieMijloc + 2));
        System.out.println("substring: " + mijlocStr3);

        String str4 = "Mar cel";
        System.out.println("split str4 : " + str4.split(" ")[0]);
        System.out.println("split str4 : " + str4.split(" ")[1]);

        String str5 = "  Hello  ";
        System.out.println("trim str5 : " + str5.trim());
    }

    public static void sb(){
        StringBuilder sb = new StringBuilder("Hello world");
        System.out.println(sb);
        System.out.println("locatia lui sb: " + System.identityHashCode(sb));
        sb.append(", java");
        System.out.println(sb);
        System.out.println("locatia lui sb: " + System.identityHashCode(sb));

        sb.insert(6, "and ");
        System.out.println(sb);

        String[] names = {"Marcel", "Marcela", "Ion"};
        StringBuilder sbNames = new StringBuilder();
        for (String name : names){
            sbNames.append(name).append(", ");
        }
        System.out.println(sbNames);
    }

}
