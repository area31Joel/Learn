package aug;

//使用java String类的replace方法来替换字符串中的字符

public class SubstitutionString {
    public static void main(String[] args){
        String str = "Hello World! Hello World! Hello World!";
        System.out.println(str.replace('H','W'));
        System.out.println(str.replaceFirst("He","Wa"));
        System.out.println(str.replaceAll("He","Ha"));
    }
}
