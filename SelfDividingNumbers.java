// Leetcode Problem, "Self Dividing Numbers" : https://leetcode.com/submissions/detail/182086626/
// Three solutions

// Automatically places values 1-9 in list and checks if any value has a 0. If so it is skipped.
// Get each individual integer by taking i % 10 and checking if it is divisible by i. Slowest
// solution(beats 15.95% of submissions).
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> nums = new ArrayList<>();
      for (int i = left; i <= right; i++) {
        if (i <= 9) {
          nums.add(i);
          continue;
        }

        String curr = Integer.toString(i);

        if (curr.contains("0")) {
          continue;
        } else {
          int val = i;
          while (val > 0) {
            int temp = val % 10;
            val /= 10;
            if (i % temp != 0) {
              break;
            } else if(val == 0) {
              nums.add(i);
            }
          }
        }
      }
      return nums;
	}
}

// Automatically places values 1-9 in list and checks if any value has a 0. If so it is skipped.
// Takes each character of the string "curr" to see if i is divisible by it. Second slowest
// solution(beats 19.23% of submissions).
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> nums = new ArrayList<>();
      for (int i = left; i <= right; i++) {
        if(i <= 9) {
          nums.add(i);
          continue;
        }

        String curr = Integer.toString(i);

        if(curr.contains("0")) {
          continue;
        } else {
          boolean divisible = true;
          for(int j = 0; j < curr.length(); j++) {
            int indNum = Integer.valueOf(Character.getNumericValue(curr.charAt(j)));
            if(i % indNum != 0) {
              divisible = false;
            }
          }
          if(divisible) {
            nums.add(i);
          }
        }
      }
      return nums;
	}
}

// As long as val > 0, keeps checking if it there is a zero in the number, or if i is not divisible
// by each individual integer. Fastest solution(beats 89.53% of solutions).
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> nums = new ArrayList<>();
      for (int i = left; i <= right; i++) {
        int val = i;
        while (val > 0) {
          if (val % 10 == 0 || i % ( val % 10 ) != 0) {
            break;
          } 
                  val /= 10;
          if(val == 0) {
            nums.add(i);
              }
              }
          }
          return nums;
    }
}
