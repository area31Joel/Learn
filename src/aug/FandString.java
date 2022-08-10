package aug;

//通过字符串函数strOrig。lastIndexOf（Stringname）
// 来查找子字符串Stringname在strOrig出现的位置。

public class FandString {
    public static void main(String[] args){
        String strOrig = "Hello world ,Hello Runoob";
        int lastIndex = strOrig.lastIndexOf("Runoob");
        if(lastIndex == -1){
            System.out.println("没有找到字符串 Runoob");
        }else {
            System.out.println("Runoob 字符串最后出现的位置："+ lastIndex);
        }
    }
}
