// 设备中存有 n 个文件，文件 id 记于数组 documents。若文件 id 相同，则定义为该文件存在副本。请返回任一存在副本的文件 id。

// 示例 1：

// 输入：documents = [2, 5, 3, 0, 5, 0]
// 输出：0 或 5


//Solution 1 迭代遍历

// class Solution {
//     public int findRepeatDocument(int[] documents) {
        

//         for(int i=0; i< documents.length-1; i++){
//             int pre=i;
//             int next=pre+1;
//             while(next<=documents.length-1){
//                 if(documents[pre] == documents[next]){
//                     return documents[pre];
//                 }
//                 next++;
//             }
//             next=pre+1;
//         }

//         return 0;
//     }
// }

//Solution 2: 哈希表
class Solution {
    public int findRepeatDocument(int[] documents) {
        Set<Integer> hmap = new HashSet<>();
        for(int doc : documents) {
            if(hmap.contains(doc)) return doc;
            hmap.add(doc);
        }
        return -1;
    }
}

