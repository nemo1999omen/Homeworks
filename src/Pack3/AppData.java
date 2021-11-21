package Pack3;

public class AppData {
    public String[] header = {"Value1;", "Value2;", "Value3;"};
    public int[][] data = {{100,200,300},{100,200,300},{100,200,300}};

    public AppData (){

    }
    public void save (int[][] newData){
        for(int i=0; i<data.length;i++){
            for(int j=0; j<data.length;j++){
                this.data[i][j] = newData[i][j];
            }
        }
    }
}
