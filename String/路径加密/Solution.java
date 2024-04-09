// 假定一段路径记作字符串 path，其中以 "." 作为分隔符。现需将路径加密，加密方法为将 path 中的分隔符替换为空格 " "，请返回加密后的字符串。

// 示例 1：

// 输入：path = "a.aef.qerf.bb"

// 输出："a aef qerf bb"


//Solution 1: 创建一个Stringuilder根据path往里面添加，如果遇到'.',就换成空格,最后返回
class Solution {
    public String pathEncryption(String path) {
        StringBuilder  sb = new StringBuilder();

        for(int i=0; i<path.length();i++){
            
            if(path.charAt(i) == '.'){
                sb.append(" ");
            } else{
                sb.append(path.charAt(i));
            }
        }

        return sb.toString();
  }
}

