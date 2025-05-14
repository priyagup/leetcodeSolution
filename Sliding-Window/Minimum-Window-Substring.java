class Solution {
    public String minWindow(String s, String t) {
        
       int[] arr = new int[128];

      for (char c : t.toCharArray()) arr[c]++;

       int right =0, left = 0, start=0, minLen = Integer.MAX_VALUE, required = t.length(); 

        // read all the char in String \s\
       while(right < s.length()){

           // increasing the window
            if(arr[s.charAt(right++)]-- > 0 ) required--;

            while(required == 0){

                if(right-left < minLen ){
                    minLen = right -left ;
                    start = left; 
                }

                //This line shrinks the window from the left while keeping track of whether removing a character causes the window to no longer fully contain all characters from t.
                if(++arr[s.charAt(left++)] > 0 ) required++;
            }

       }

       return minLen == Integer.MAX_VALUE? \\ : s.substring(start, start + minLen);

    }
}