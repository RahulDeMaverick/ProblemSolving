class Solution {
    public int reverse(int num) {
				// check given number is greater than max value and less than min value
				//		if yes then return 0
        if(num >= Integer.MAX_VALUE || num<= Integer.MIN_VALUE) return 0;
				//declare a long variable
        long  reversed = 0;
				// iterate till num reaches 0
        while(num != 0) {
						// get the last digit in the nums
            long digit = num % 10;
            //reversed last digit by multiplying with ten and adding the last digit
            reversed = reversed * 10 + digit;
            // remove the last digit
            num /= 10;
        }
        //check if reversed is greater than max value or reversed is less than min value then return 0
    if(reversed >= Integer.MAX_VALUE || reversed <= Integer.MIN_VALUE) return 0;
    return (int)reversed;
    }
}