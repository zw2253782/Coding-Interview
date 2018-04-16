class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> temp = new ArrayList<>();
        while ((i < nums1.length) && (j < nums2.length)) {
            if (nums1[i] == nums2[j]) {
                temp.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i] > nums2[j]) {
                j++;
            }else {
                i++;
            }
        }
        int[] answer = new int[temp.size()];
        for (int k = 0; k < temp.size(); k++) {
            answer[k] = temp.get(k);
        }
        return answer;
    }
}
