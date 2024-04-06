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

