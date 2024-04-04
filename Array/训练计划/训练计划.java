class Solution {
    public int[] trainingPlan(int[] actions) {
        int i = 0;
        int j = actions.length - 1;

        while (i < j) {
            while (i < j && (actions[i] % 2 == 1)) {
                i++;
            }
            while (i < j && (actions[j] % 2 == 0)) {
                j--;
            }

            if (i < j) { // Only swap if i < j
                int temp = actions[i];
                actions[i] = actions[j];
                actions[j] = temp;
            }
        }

        return actions;
    }
}
