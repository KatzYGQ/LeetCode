// 某公司门禁密码使用动态口令技术。初始密码为字符串 password，密码更新均遵循以下步骤：

// 设定一个正整数目标值 target
// 将 password 前 target 个字符按原顺序移动至字符串末尾
// 请返回更新后的密码字符串。


// 示例 1：
// 输入: password = "s3cur1tyC0d3", target = 4
// 输出: "r1tyC0d3s3cu"
  
// 示例 2：
// 输入: password = "lrloseumgh", target = 6
// 输出: "umghlrlose"

//Solution 1: 创建一个字符串用来获取需要移动至末尾的前target个字符
           2: 创建一个StringBuilder来获取移除了前target后的字符串，然后把它加入到这个SB里
class Solution {
    public String dynamicPassword(String password, int target) {
            String newString="";
            StringBuilder sb=new StringBuilder();
            newString+=password.substring(0,target);
            for(int i=target;i<password.length(); i++){
                sb.append(password.charAt(i));
            }

           sb.append(newString);
           return sb.toString();
    }
}
