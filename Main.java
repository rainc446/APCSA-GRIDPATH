public class Main {
    public static void main(String Args[]){
        int [][] nums = {
            {12, 3, 4, 13, 5},
            {11, 21, 2, 14 ,16},
            {7, 8, 9, 15, 0},
            {10, 17, 20, 19, 1},
            {18, 22, 30, 25, 6}
        };
        GridPath grid = new GridPath(nums);

        //Test cases for part a)
        System.out.println(grid.getNextLoc(0,0));
        System.out.println(grid.getNextLoc(1,3));
        System.out.println(grid.getNextLoc(2, 4));
        System.out.println(grid.getNextLoc(4, 3));
        int [][] numsTwo = {
                {12, 30, 40, 25, 5},
                {11, 3, 22, 15 ,43},
                {7, 2, 9, 4, 0},
                {8, 33, 18, 6, 1},
        };
        GridPath gridTwo = new GridPath(numsTwo);
        System.out.println(gridTwo.sumPath(1,1));

        //test cases for part b)

    }
}
