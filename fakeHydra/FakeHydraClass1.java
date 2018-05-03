package edu.fake.ssec.FakeHydraGitSubModule.fakeHydra;

public class FakeHydraClass1 {
//comment for demo
    public void printer (String message){
        System.out.print(message);
    }
    public int adder (int num1, int num2){
        return num1 + num2;
    }
    public double [] columnSums(double[][] data){
        int numRows = data.length;
        int numCols = data[0].length;
        double [] resultSums = new double [numCols];

        for(int col=0; col < numCols; col++){

            for (int row= 0; row < numRows; row++) {
                resultSums[col] += data[row][col];
            }
        }
        return resultSums;
    }
}
