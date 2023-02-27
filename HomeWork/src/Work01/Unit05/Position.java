package Work01.Unit05;

public class Position {
    int row;
    int col;
    public Position(){
        this(0,0);
    }
    public Position(int row, int col){
        this.row = row;
        this.col = col;
    }
    public Position(String data){
        String[] pos = data.split("[ ]+");
        row = Integer.parseInt(pos[0]) + 1;
        col = Integer.parseInt(pos[1]) + 1;
    }

    @Override
    public String toString(){
        return "(" + row + "," + col + ")";
    }
}
