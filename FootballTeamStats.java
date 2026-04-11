import java.util.Random;

class FootballTeamStats {

    public int[] generateHeights(int size) {

        int[] heights = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150–250
        }

        return heights;
    }

    public int findSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    public double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public int findMin(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }

    public int findMax(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {

        FootballTeamStats obj = new FootballTeamStats();

        int[] heights = obj.generateHeights(11);

        System.out.println("Player Heights:");
        for (int h : heights)
            System.out.print(h + " ");

        System.out.println("\nMean Height = " + obj.findMean(heights));
        System.out.println("Shortest = " + obj.findMin(heights));
        System.out.println("Tallest = " + obj.findMax(heights));
    }
}