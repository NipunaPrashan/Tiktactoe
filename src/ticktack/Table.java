package ticktack;

public class Table {

    private Cell[][] grid = new Cell[3][3];             //creating the grid
    private Cell[] edge = new Cell[4];
    private Cell[] temp = new Cell[4];
    private Cell midCell;
    private WinningCombinations[] winArray = new WinningCombinations[8];
    private int no_cellClicked = 0;

    public Table() {                                   //initialize the table
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }

        for (int i = 0; i < 3; i++) {
            winArray[i] = new WinningCombinations(grid[i][0], grid[i][1], grid[i][2]);  // [0 , 0, 0]
        }
        for (int i = 3; i < 6; i++) {
            winArray[i] = new WinningCombinations(grid[0][i - 3], grid[1][i - 3], grid[2][i - 3]);  // [0     ]
                                                                                                    // [0     ]
                                                                                                    // [0     ]
        }
        winArray[6] = new WinningCombinations(grid[0][0], grid[1][1], grid[2][2]);                  // [0     ]
                                                                                                    // [  0   ]
                                                                                                    // [     0]
        
        winArray[7] = new WinningCombinations(grid[0][2], grid[1][1], grid[2][0]);                  // [     0]
                                                                                                    // [  0   ]
                                                                                                    // [0     ] 

        int st = 0, i=0;

//        for (int i = 0; i < 3; i += 2) {
//            for (int j = 0; j < 3; j += 2) {
//                edge[st] = grid[i][j];
//                st++;
//            }
//        }
        
        while (i<=2){
        
            for (int j = 0; j < 3; j += 2){
                edge[st] = grid[i][j];
                st++;
            }
            i +=2;
       
        }

        temp[0] = grid[0][1];          //temp means the cells without edge cells and the middle cell.  
        temp[1] = grid[1][0];           //temp means the cells without edge cells and the middle cell.
        temp[2] = grid[1][2];           //temp means the cells without edge cells and the middle cell.
        temp[3] = grid[2][1];           //temp means the cells without edge cells and the middle cell.

        midCell = grid[1][1];          //this is the center cell
    }

    public void selectTheCell(int x, int y, int status) {      //User or Machine (X/0)
        if (!grid[x][y].isClicked()) {               
            grid[x][y].setStatus(status);
            grid[x][y].setIsClicked(true);
            no_cellClicked++;                                  // the sum of clicked
        }
    }

    public WinningCombinations[] getWinArray() {
        return winArray;
    }

    public boolean isCentreFree() {                             // find the middle one is not clicked
        if (midCell.isClicked()) {
            return false;
        } else {
            return true;
        }
    }

    public WinningCombinations[] singlestates(int status) {
        int[] TheStatus = {-1, -1};
        WinningCombinations[] a = new WinningCombinations[8];
        WinningCombinations[] b = new WinningCombinations[8];
        int i = 0, j = 0;

        for (int k = 0; k < 8; k++) {
            if (winArray[k].isSingle() && winArray[k].sum() == -2) {
                TheStatus[0] = 0;
                a[i] = winArray[k];
                i++;

            } else if (winArray[k].isSingle() && winArray[k].sum() == -1) {
                TheStatus[1] = 1;
                b[j] = winArray[k];
                j++;
            }
        }

        if (TheStatus[0] == status) {
            return a;
        }
        if (TheStatus[1] == status) {
            return b;
        }
        return null;

    }

    public Cell oneMoveLeftToWin(int status) {               //return the last cell and one move to win
        for (int i = 0; i < 8; i++) {
            if (winArray[i].checkingWhetherOneMoveToWin(status)) {
                return winArray[i].getEndCell();
            }
        }
        return null;
    }

    public boolean isCornerFound(Cell cell) {
        for (int i = 0; i < 4; i++) {
            if (cell.getX() == edge[i].getX() && cell.getY() == edge[i].getY()) {   
                return true;
            }  // find a corner has come
        }
        return false;
    }

    public boolean isTheCellClicked(int x, int y) {
        return grid[x][y].isClicked();                     // is the cell clicked
    }
    public void setTheCellClicked(int x, int y) {
         grid[x][y].setIsClicked(true);                    // is the cell clicked
    }

    public boolean isTableFull() {                         // is the table full
        if (no_cellClicked > 8) {
            return true;
        } else {
            return false;
        }

    }
}