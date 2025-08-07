class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        double avarage = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        avarage = sum/arr.length;
        return avarage;
    }
}