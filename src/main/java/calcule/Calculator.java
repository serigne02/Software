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

    public int minElement(int [] liste) {
		int c =liste[0];
		for(int i=0;i<=liste.length-1;i++) 
		{
			c=min(c,liste[i]);
		}
		return c;
	}

    public int maxElement(int []liste) {
		int m=liste[0];
		for(int i=0;i<=liste.length-1;i++) 
		{
			
			m=max(m,liste[i]);
		}
		return m;
	}


}
