package ticktack;




public class Person extends Player{

    public Person(String userName, int symbol) {
        super(userName, symbol);
    }
    
    public void play(Table table, int inputX, int inputY){
        table.selectTheCell(inputX, inputY, getUserSymbol());
    }
    
}
