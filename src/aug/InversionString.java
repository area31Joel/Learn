package aug;

//使用Java的反转函数reverse（）将字符串反转

public class InversionString {
    public static void main(String[] args){
        String string = "runoob";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("字符串反转前："+string);
        System.out.println("字符串反转后："+reverse);
    }
}
