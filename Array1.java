public class Array1{
	public static void main(String[] args){
		
		int []x={10,20,30,40,50,60,70,80};
		int result=0;
		for(int i= 0;i<x.length;i++){
			for(int j=0;j<=x[i].length;j++){
				result=result+x[i][j];
				
			}
		}
		System.out.println("result:"+result);
	}
}