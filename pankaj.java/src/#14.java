//String method
class pankaj14{
    public static void main(String []args){
        String name = "Harry";
        System.out.println(name);

        System.out.println("1} length Method");
        System.out.println(name.length());
        int value = name.length();
        System.out.println(value);

        System.out.println("2} toLowerCase Method");
        System.out.println(name.toLowerCase());
        String LString = name.toLowerCase();
        System.out.println(LString);

        System.out.println("3} toUpperCase Method");
        System.out.println(name.toUpperCase());
        String UString = name.toUpperCase();
        System.out.println(UString);

        System.out.println("4} trim Method");
        String name0 = "   Pankaj";
        System.out.println(name0.trim());
        String trim1 = name0.trim();
        System.out.println(trim1);

        System.out.println("5} Replace Method");
        System.out.println(name.replace('r','p'));
        String Replace = name.replace('r','p');
        System.out.println(Replace);

        System.out.println("6} startsWith Method");
        System.out.println(name.startsWith("H"));
        System.out.println(name.startsWith("ry"));

        System.out.println("7} endsWith Method");
        System.out.println(name.endsWith("H"));
        System.out.println(name.endsWith("ry"));

        System.out.println("8} charAt Method");
        System.out.println(name.charAt(4));


    }
}