
public class SellAndBuy {

	public static void main(String[] args) {
		 int dataSet[]={1, 5, 2, 3, 7, 6, 4, 5};
		 int localMin=0;
		 int localMax=0;;
		 int profitSum=0;
		 for(int i=0;i<dataSet.length-1;i++)
		 {
			  if(dataSet[i]<dataSet[i+1]&&localMin==0) {
				  localMin=dataSet[i]; 
				  System.out.println(localMin);
				
			 }
			  if(dataSet[i]>=dataSet[i+1]&&localMin!=0) {
				  localMax=dataSet[i]; 
				  System.out.println(localMax);
				  profitSum = profitSum+localMax-localMin;
				  System.out.println("profit "+(localMax-localMin));
				  localMin=0;
				
			 }
			  if(i==dataSet.length-2) {
				  if(localMin!=0) {
					  localMax=dataSet[i+1];
					  System.out.println(localMax);
					  System.out.println("profit "+(localMax-localMin));
					  profitSum = profitSum+localMax-localMin;
				  }
			  }
			  
		 }
		 System.out.println("total profit "+profitSum);

	}

}
