package ticktack;



public class WinningCombinations {
    
    private Cell[] cell = new Cell[3]; //temporary array of cells to store a particular combination...
                                                  //on the game board
    private Cell endCell;
    private int j = 0;
    private boolean isFull = false;
    private int freeCells = 0;
    
    public WinningCombinations(Cell cell1, Cell cell2, Cell cell3) {
        cell[0] = cell1;
        cell[1] = cell2;
        cell[2] = cell3;
    }

    public boolean checkingWhetherOneMoveToWin(int x_o){
        for (int i = 0; i < 3; i++) {       // counting number of free cells
            if (!cell[i].isClicked()) {
                freeCells++;
            }
        }
        
        if((freeCells == 1) && (cell[0].getStatus() == x_o || cell[1].getStatus() == x_o)){
            if((cell[0].getStatus() == cell[1].getStatus()) || (cell[0].getStatus() == cell[2].getStatus()) || (cell[1].getStatus() == cell[2].getStatus())){
                freeCells = 0;
                return true; //yes one move to win
            }
            else{
                freeCells = 0;
                return false; //no not one move to win
            }
        }

        else{
            freeCells = 0;
            return false;    // no not one move to win
        }
    }
    
    public boolean hasWin(){
        if((cell[0].getStatus() == -1) &&(cell[1].getStatus() == -1) &&(cell[2].getStatus() == -1)){
            return false;
        }
        if(cell.length != 0 && (cell[0].getStatus() == cell[1].getStatus()) &&(cell[1].getStatus() == cell[2].getStatus()) ){
            return true;   //won the game
        }
        else{
            return false;
        } 
    }
    
    public int whoWon(){
        return cell[0].getStatus();    //send the symbol
    }
    
    public Cell[] corners(){
        Cell[] c = new Cell[2];
        if(isAnEndPoint(cell[0])){
            c[0] = cell[0];
        }
        else{
            c[0] = new Cell();
        }
        if(isAnEndPoint(cell[1])){
            c[1] = cell[1];
        }
        else{
            c[1] = new Cell();
        }
        
        return c; 
    }

    public int sum(){
        int t = 0;
        for (int i = 0; i < 3; i++) {
            t += cell[i].getStatus();
        }
        return t;
    }
    
    /* Is the possibleWin is single */
    public boolean isSingle(){
        if((sum() != -3)){
            if (((cell[0].getStatus() == -1 && cell[1].getStatus() == -1) || (cell[0].getStatus() == -1 && cell[2].getStatus() == -1) || (cell[1].getStatus() == -1 && cell[2].getStatus() == -1))) {
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
            if(!cell[i].isClicked()){
                endCell = cell[i];
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
        Cell[] c = {cell[0], cell[2]};
        return c;
    }
    
}