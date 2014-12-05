package ticktack;



public class WinningCombinations {
    
    private Cell[] cellCombination = new Cell[3]; //temporary array of cells to store a particular combination...
                                                  //on the game board
    private Cell endCell;
    private int j = 0;
    private boolean isFull = false;
    private int freeCells = 0;
    
    public WinningCombinations(Cell cell1, Cell cell2, Cell cell3) {
        cellCombination[0] = cell1;
        cellCombination[1] = cell2;
        cellCombination[2] = cell3;
    }

    public boolean oneMoveToWin(int x_o){
        for (int i = 0; i < 3; i++) {       // counting number of free cells
            if (!cellCombination[i].isClicked()) {
                freeCells++;
            }
        }
        
        if((freeCells == 1) && (cellCombination[0].getStatus() == x_o || cellCombination[1].getStatus() == x_o)){
            if((cellCombination[0].getStatus() == cellCombination[1].getStatus()) || (cellCombination[0].getStatus() == cellCombination[2].getStatus()) || (cellCombination[1].getStatus() == cellCombination[2].getStatus())){
                freeCells = 0;
                return true;
            }
            else{
                freeCells = 0;
                return false;
            }
        }

        else{
            freeCells = 0;
            return false;
        }
    }
    
    public boolean win(){
        if((cellCombination[0].getStatus() == -1) &&(cellCombination[1].getStatus() == -1) &&(cellCombination[2].getStatus() == -1)){
            return false;
        }
        if(cellCombination.length != 0 && (cellCombination[0].getStatus() == cellCombination[1].getStatus()) &&(cellCombination[1].getStatus() == cellCombination[2].getStatus()) ){
            return true;
        }
        else{
            return false;
        } 
    }
    
    public int whoWon(){
        return cellCombination[0].getStatus();
    }
    
    public Cell[] corners(){
        Cell[] c = new Cell[2];
        if(isAnEndPoint(cellCombination[0])){
            c[0] = cellCombination[0];
        }
        else{
            c[0] = new Cell();
        }
        if(isAnEndPoint(cellCombination[1])){
            c[1] = cellCombination[1];
        }
        else{
            c[1] = new Cell();
        }
        
        return c; 
    }

    public int sum(){
        int t = 0;
        for (int i = 0; i < 3; i++) {
            t += cellCombination[i].getStatus();
        }
        return t;
    }
    
    /* Is the possibleWin is single */
    public boolean isSingle(){
        if((sum() != -3)){
            if (((cellCombination[0].getStatus() == -1 && cellCombination[1].getStatus() == -1) || (cellCombination[0].getStatus() == -1 && cellCombination[2].getStatus() == -1) || (cellCombination[1].getStatus() == -1 && cellCombination[2].getStatus() == -1))) {
                return true;
            }
            else{
                return false;
            }
            
        }
        else{
            return false;
        } 
    }

    public Cell getEndCell() {
        for (int i = 0; i < 3; i++) {
            if(!cellCombination[i].isClicked()){
                endCell = cellCombination[i];
            }
        }
        return endCell;
    }
    
    public boolean isAnEndPoint(Cell cell){
        for (int k = 0; k < 3; k += 2) {
            for (int l = 0; l < 3; l += 2) {
                if(cell.getX() == k && cell.getY() == l){
                    return true;
                }
                
            }
        }
        return false;
    }
    
    public Cell[] getTwoEnds(){
        Cell[] c = {cellCombination[0], cellCombination[2]};
        return c;
    }
    
}