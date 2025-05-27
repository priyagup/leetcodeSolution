class Solution {
    public boolean isHappy(int n) {
        int slow = n; 
        int fast = getNext(n);
        while(fast != 1 && slow != fast ) // we are checking two things 1. work until fast is not 1 and 2. no cycle should be present slow != fast
        {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast ==1;
    }

    public int getNext(int num ){
        int total =0; 
        while (num > 0){
            int digit = num % 10;
            total += digit * digit;
            num /= 10;
        }
        return total;
    }
}