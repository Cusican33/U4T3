public class ArrayManipulator {

    // instance variables
    private int[] nums;
    private String[] words;

    public ArrayManipulator(int[] nums, int howManyStrings)
    {
        this.nums = nums;
        this.words = new String[howManyStrings];
    }

    public int getNumsMiddleIndex()
    {
        if (nums.length % 2 == 0) return (nums.length / 2) - 1;
        else return nums.length / 2;
    }

    public double getNumsAverage() { return ((double) nums[0] + (double) nums[getNumsMiddleIndex()] + (double) nums[nums.length - 1]) / 3; }

    public boolean sameLengths() { return nums.length == words.length; }

    public boolean updateWordsListAt(int idx, String newValue)
    {
        boolean done = false;
        if (idx > words.length - 1) { return false; }
        else
        {
            for (int i = words.length - 1; i >= 0; i--)
            {
                if (idx == i)
                {
                    words[i] = newValue;
                    done = true;
                }
                else if (!done) words[i] = words[i - 1];
            }
            return true;
        }
    }

    public int howLongLastWord()
    {
        if (words[words.length - 1] == null) return 0;
        else return words[words.length - 1].length();
    }

    public int getNumAt(int idx) { return nums[idx]; }

    public String getWordAt(int idx) { return words[idx]; }
}
