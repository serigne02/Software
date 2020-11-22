package calcule;

public class Calculator {

    public int sum(int a, int b){
        return a+b;
    }

    public int minus(int a, int b){
        return  a-b;
    }

    public int divide(int a, int b){
        if(b==0) throw new IllegalArgumentException("impossible ");
        return a/b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int min(int a, int b){
      return   Math.min(a,b);
    }

    public int max(int a, int b){
        return Math.max(a,b);
    }

    public int minElement(int[] list){
        int x=list[0];
        for(int i=1; i< list.length;i++){
            x=min(x,list[i]);
        }
        return x;
    }

    public int maxElement(int [] list){
        int y=list[0];
        for (int j : list) {
            y = max(y, j);
        }
        return y;
    }


}
