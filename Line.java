package game;

public class Line{
    private GameBean.GameState[] lineDatas;
    private int lineIndex;
    
    public Line(GameBean.GameState[] lineDatas, int lineIndex){
        this.lineDatas = lineDatas;
        this.lineIndex = lineIndex;
    }

    public GameBean.GameState[] getDatas() {
        return lineDatas;
    }

    public int getIndex() {
        return lineIndex;
    }
}
