public class GridPath {
    /**
     * Initialized in the constructor with distinct values that never change
     */
    private int[][] grid;
    private int colMax;
    private int rowMax;

    public GridPath(int[][] values)
    {
        grid = values;
        colMax = grid[0].length-1;
        rowMax = grid.length-1;
    }

    /**
     * Returns the Location representing a neighbor of the grid element at row and col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in grid.
     * row and col do not specify the element in the last row and last column of grid.
     */
    public Location getNextLoc(int row, int col) {
        /* to be implemented in part (a) */


        Location start = new Location(row, col);
        Location toRight = new Location(row, col+1);
        Location toBottom = new Location(row+1, col);

        if(row == rowMax && col == colMax)
        {
            return start;
        }
        else if (col == colMax){
            return toBottom;
        }
        else if (row == rowMax)
        {
            return toRight;
        }

        else if (grid[toRight.getRow()][toRight.getCol()] < grid[toBottom.getRow()][toBottom.getCol()]){
            return toRight;
        }
        else
        {
            return toBottom;
        }

    }

    /**
     * Computes and returns the sum of all values on a path through grid, as described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in grid.
     * row and col do not specify the element in the last row and last column of grid.
     */
    public int sumPath(int row, int col) {
        /* to be implemented in part (b) */
        int sum = grid[row][col];
        int nextRowVal = row;
        int nextColVal = col;

        while (!(nextRowVal == rowMax) &&  !(nextRowVal > colMax))
        {

            Location nextPos = getNextLoc(nextRowVal, nextColVal);
            nextRowVal = nextPos.getRow();
            nextColVal = nextPos.getCol();
            sum += grid[nextRowVal][nextColVal];
        }
        return sum;
    }



}
