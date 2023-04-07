package game;

public class Cell{
    private int cellLine;
    private int cellCol;
    private GameBean.GameState state;

    public Cell(GameBean.GameState state, int cellLine, int cellCol) {
        this.state= state;
        this.cellLine = cellLine;
        this.cellCol = cellCol;
    }

    public GameBean.GameState getState(){
        return this.state;
    }

    public int getLine() {
        return this.cellLine;
    }

    public int getCol() {
        return this.cellCol;
    }
}
