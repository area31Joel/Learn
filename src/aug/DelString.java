package aug;

//通过字符串函数substring（）函数来删除字符串中的一个字符，
// 将功能封装在removeCharAt函数中。

public class DelString {
    public static void main(String[] args){
        String str = "this is Java";
        System.out.println(removeCharAt(str,3));
    }

    private static String removeCharAt(String s, int pos) {
        return s.substring(0,pos) + s.substring(pos + 1);
    }
}
