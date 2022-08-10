package aug;

//使用String类的indexOf（）方法在字符串中查找zi字符串出现的位置，
// 如果存在返回字符串出现的位置（第一位为0），如不存在返回-1

public class FindString {
    public static void main(String[] args){
        String strOrig = "google runoob taobao";
        int intIndex = strOrig.indexOf("runoob");
        if(intIndex == -1){
            System.out.println("没有找到字符串");
        }else{
            System.out.println("字符串的位置"+intIndex);
        }
    }
}
