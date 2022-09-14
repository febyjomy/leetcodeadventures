class Solution {
    // public char[] digits = {'I' , 'V' , 'X' , 'L' , 'C' , 'D' , 'M'};
    // public int[] digitVal = {1 , 5 , 10 , 50 , 100 , 500 , 1000};
    public int romanToInt(String s) {
        int val = 0;

        for (int i = 0; i < s.length(); i++) {
            try {
                if (s.charAt(i) == 'I') {
                    if (s.charAt(i + 1) == 'V') {
                        val += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        val += 9;
                        i++;
                    } else {
                        val += 1;
                    }
                } else if (s.charAt(i) == 'X') {
                    if (s.charAt(i + 1) == 'L') {
                        val += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        val += 90;
                        i++;
                    } else {
                        val += 10;
                    }
                } else if (s.charAt(i) == 'C') {
                    if (s.charAt(i + 1) == 'D') {
                        val += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        val += 900;
                        i++;
                    } else {
                        val += 100;
                    }
                } else if (s.charAt(i) == 'V') {
                    val += 5;
                } else if (s.charAt(i) == 'L') {
                    val += 50;
                } else if (s.charAt(i) == 'D') {
                    val += 500;
                } else if (s.charAt(i) == 'M') {
                    val += 1000;
                }
            } catch (Exception e) {
                if (s.charAt(i) == 'I') {
                    val += 1;
                } else if (s.charAt(i) == 'X') {
                    val += 10;
                } else if (s.charAt(i) == 'C') {
                    val += 100;
                }
                break;
            }
        }
        return val;
    }
}
