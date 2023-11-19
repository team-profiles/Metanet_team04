    class Solution {
        public boolean isPalindrome(int x) {

            String a = Integer.toString(x);

            String[] arr = a.split("");
            String[] revarr = new String[arr.length];
            int n = 0;
            String b = "";


            for (int i = arr.length-1; i >= 0; i--) {
                revarr[n++] = arr[i];
            }

            for (int i = 0; i < revarr.length; i++) {
                b += revarr[i];
            }

            if (a.equals(b)) {
                return true;
            } else {
                return false;
            }

        }
    }
