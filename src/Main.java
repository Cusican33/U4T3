import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] heights = new int[3]; // #1
        System.out.println(Arrays.toString(heights));
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        System.out.println(Arrays.toString(heights) + "\n");

        boolean[] bools = {true, false, true, false, true, false}; // #2
        bools[0] = bools[3];
        System.out.println(bools[0]);
        System.out.println(bools[5] + "\n");

        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"}; // #3
        String temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;
        System.out.println(Arrays.toString(alphabeticalNames) + "\n");

        double[] array1 = {7.5, 10.0}; // #4
        double[] array2 = {8.2, 14.8};
        double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
        System.out.println(Arrays.toString(array3) + "\n");

        String[] animals = new String[4]; // #5
        System.out.println(Arrays.toString(animals));
        animals[0] = "snake";
        animals[1] = "lizard";
        animals[2] = "bird";
        animals[3] = "fish";
        System.out.println(Arrays.toString(animals) + "\n");

        //System.out.println(animals[4]);  // #6

        Dog dog1 = new Dog("Sparky", 4); // #7
        Dog dog2 = new Dog("Toby", 7);
        Dog dog3 = new Dog("Fiona", 12);
        Dog[] dogs = {dog1, dog2, dog3};
        System.out.println(dogs[0].getName() + " " + dogs[1].getName() + " " + dogs[2].getName() + "\n");

        int[] ints1 = {2, 4, 6, 8, 10}; // #8
        int[] ints2 = ints1;
        ints2[3] = 15;
        System.out.println(ints1[3]);
        System.out.println(ints2[3] + "\n");

        String[] myStrs = {"hi", "bye", "what", "purple"}; // #9
        int arrLen = myStrs.length;
        int strLen = myStrs[3].length();
        System.out.println(arrLen + strLen);
        String str = myStrs[2].substring(1, 3);
        System.out.println(str + "\n");

        System.out.println();

        int[] nums1 = {5, 8, 9, 10, 4};
        int numStr1 = 5;
        ArrayManipulator manipulator = new ArrayManipulator(nums1, numStr1);
        System.out.println("------------");
        System.out.println(manipulator.getNumsMiddleIndex());
        System.out.println(manipulator.getNumsAverage());
        System.out.println(manipulator.sameLengths());
        System.out.println(manipulator.getNumAt(3));
        System.out.println(manipulator.getWordAt(3));
        System.out.println(manipulator.updateWordsListAt(3, "hello"));
        System.out.println(manipulator.getWordAt(3));
        System.out.println(manipulator.howLongLastWord());
        System.out.println(manipulator.updateWordsListAt(4, "updated"));
        System.out.println(manipulator.howLongLastWord());




        int[] nums2 = {2, 5, 7, 9};
        int numStr2 = 6;
        System.out.println("------------");
        manipulator = new ArrayManipulator(nums2, numStr2);
        System.out.println(manipulator.getNumsMiddleIndex());
        System.out.println(manipulator.getNumsAverage());
        System.out.println(manipulator.sameLengths());
        System.out.println(manipulator.getNumAt(3));
        System.out.println(manipulator.updateWordsListAt(6, "not valid"));
        System.out.println(manipulator.howLongLastWord());
        System.out.println(manipulator.updateWordsListAt(5, "valid"));
        System.out.println(manipulator.howLongLastWord());

    }
}
