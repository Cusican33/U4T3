import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] heights = new int[3];
        System.out.println(Arrays.toString(heights));
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        System.out.println(Arrays.toString(heights) + "\n");

        boolean[] bools = {true, false, true, false, true, false};
        bools[0] = bools[3];
        System.out.println(bools[0]);
        System.out.println(bools[5] + "\n");

        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;
        System.out.println(Arrays.toString(alphabeticalNames) + "\n");

        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
        System.out.println(Arrays.toString(array3) + "\n");

        String[] animals = new String[4];
        System.out.println(Arrays.toString(animals));
        animals[0] = "snake";
        animals[1] = "lizard";
        animals[2] = "bird";
        animals[3] = "fish";
        System.out.println(Arrays.toString(animals));
    }
}
