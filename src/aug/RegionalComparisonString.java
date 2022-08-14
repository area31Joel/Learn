package aug;

//使用regionMatches（）方法测试两个字符串区域是否相等。

public class RegionalComparisonString {
    public static void main(String[] args){
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";

        //将first_str字符串从第11个字符“M”开始和second_str字符串的第12个字符“M”开始逐个比较，共比较9对字符，由于字符串区分大小写，所以结果为false。
        boolean match1 = first_str.regionMatches(11, second_str, 12, 9);

        //设置第一个参数为true，则表示忽略大小写区别，所以返回true。
        boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9);
        System.out.println("区分大小写返回值：" + match1);
        System.out.println("不区分大小写返回值：" + match2);
    }
}
