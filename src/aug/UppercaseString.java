package aug;

//使用String toUpperCase（）方法将字符串从小写转为大写

public class UppercaseString {
    public static void main(String[] args){
        String str = "string runoob";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符："+str);
        System.out.println("转换为大写："+strUpper);
    }
}
