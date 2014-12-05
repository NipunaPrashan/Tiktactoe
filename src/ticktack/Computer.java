package ticktack;




public class Computer extends Player{

    public Computer(String name, int symbol) {
        super(name, symbol);
    }
    
    public int[] chose(Table table){
        
        System.out.println("Computer's turn...");
                Cell lastMove = table.oneMoveLeftToWin(getUserSymbol());
                System.out.println("current player's last move: " + lastMove);
                Cell oppLastMove = table.oneMoveLeftToWin(getOpponent().getUserSymbol());
                System.out.println("opponent's last move: " + oppLastMove);
                int x = 0, y = 0;
                
                
                if(lastMove != null){   //aquire the last cell and win
                    x = lastMove.getX();
                    y = lastMove.getY();
                    table.selectTheCell(x, y, 0);
                }
                
                else if(oppLastMove != null){ ////aquire the last cell and block opponent from winning
                    x = oppLastMove.getX();
                    y = oppLastMove.getY();
                    table.selectTheCell(x, y, 0);
                }
                
                else if(table.isCentreFree()){    //aquring the middle cell
                    System.out.println("Free: ");
                    x = 1;
                    y = 1;
                    table.selectTheCell(x, y, 0);
                }
                
                else if(table.singlestates(getOpponent().getUserSymbol()) != null && table.singlestates(getOpponent().getUserSymbol()).length != 0){ // if the opponent has a PossibleWin block with a single occupied cell, fill a coner in that block or a middle cell
                    WinningCombinations[] wayToGo = table.singlestates(1);
                    Cell[] corners;
                    Cell corner = null;
                    int i;
                    for (i = 0; wayToGo[i] != null && i < wayToGo.length ; i++) {
                        corners = wayToGo[i].corners();
                        
                        if(corners[0].getX() == 3 && corners[1].getX() == 3){ //when it is not a corner cell
                            continue;
                        }
                        int j ;
                        for (j = 0; j < 2; j++) {
                            if (!corners[j].isClicked() && corners[j].getX() != 3) {
                                System.out.println("corner ekak..." + corners[j].getX() + "," + corners[j].getY());
                                corner = corners[j];
                                break;
                            }
                        }
                        if( j < 2){
                            break;
                        }
                    }
                    
                    if(i == wayToGo.length || wayToGo[i] == null){ //when there is no line to fill
                        for (int j = 0; j < wayToGo.length; j++) {
                            Cell[] twoEnds = wayToGo[j].getTwoEnds();
                            int k;
                            for (k = 0; k < 2; k++) {
                                if(!twoEnds[k].isClicked()){
                                    corner = twoEnds[k];
                                    break;
                                }
                            }
                            if(k < 2){
                                break;
                            }
                        }
                    }
                    x = corner.getX();
                    y = corner.getY();
                    System.out.println("Current player->  x:" + x + "y:" + y);
                    table.selectTheCell(x, y, 0);
                }
                else if(table.singlestates(0) != null){
                    WinningCombinations[] wayToGo = table.singlestates(1);
                    Cell[] corners;
                    Cell corner = null;
                    int i;
                    for (i = 0; wayToGo[i] != null && i < wayToGo.length; i++) {
                        corners = wayToGo[i].corners();
                        
                        if(corners[0].getX() == 3 && corners[1].getX() == 3){ //if the cell is not an edge
                            continue;
                        }
                        int j ;
                        for (j = 0; j < 2; j++) {
                            if (corners[j].getX() != 3) {
                                corner = corners[j];
                                break;
                            }
                        }
                        if( j < 2){
                            break;
                        }
                    }
                    
                    if(i == wayToGo.length || wayToGo[i] == null){ //If there is no edge to fill
                        for (int j = 0; j < wayToGo.length; j++) {
                            Cell[] twoEnds = wayToGo[j].getTwoEnds();
                            int k;
                            for (k = 0; k < 2; k++) {
                                if(!twoEnds[k].isClicked()){
                                    corner = twoEnds[k];
                                    break;
                                }
                            }
                            if(k < 2){
                                break;
                            }
                        }
                    }
                    x = corner.getX();
                    y = corner.getY();
                    table.selectTheCell(x, y, 0);
                }
                int[] choosed = {x, y};
                System.out.println("Machine select: " + x + " " + y);
            
            
            return choosed;
    }
    
    public void play(Table table, int inputX, int inputY){
        table.selectTheCell(inputX, inputY, getUserSymbol());
    }
}
