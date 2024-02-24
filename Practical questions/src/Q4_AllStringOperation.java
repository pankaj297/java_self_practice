import javax.lang.model.element.NestingKind;

//Q4 Write a java program to demonstrate use of all String operations
//ex-1
class StringMethods{
    public static void main(String [] args){

        String a1 = "Pankaj";
        System.out.println(a1.length());

        String a2 = "Pankaj";
        System.out.println(a2.charAt(3));

        String a3 = "Pankaj";
        System.out.println(a3.startsWith("Pa"));
        System.out.println(a3.startsWith("kj"));

        String a4 = "Pankaj";
        System.out.println(a4.endsWith("pa"));
        System.out.println(a4.endsWith("aj"));

        String a5 = "Pankaj";
        System.out.println(a5.toUpperCase());
        System.out.println(a5.toLowerCase());

        String a6 = "Happy";
        System.out.println(a6.replace('p','r'));

        String a7 = "  Pankaj";
        System.out.println(a7);
        System.out.println(a7.trim());
    }
}
//ex-2
class StringMethod1{
    public static void main(String [] args){
        String s1 = "Java";
        System.out.println("String = "+s1);

        int length = s1.length();
        System.out.println("s1 length = "+length);

        System.out.println("s1 toUpperCase latter = "+s1.toUpperCase());

        System.out.println("S1 toLowerCase latter = "+s1.toLowerCase());

        System.out.println("s1 indexOf('e') = "+s1.indexOf('e'));
        System.out.println("s1 indexOf('v') = "+s1.indexOf('v'));

        String s2 = "python";
        System.out.println("String = "+s2);
        System.out.println("s2 equals = "+s2.equals(s2));
        System.out.println("s2 equals = "+s2.concat(s2));

        System.out.println("Starts With j = "+s2.startsWith("p"));
        System.out.println("ends With a = "+s2.endsWith("a"));

    }
}

//ex-3


















