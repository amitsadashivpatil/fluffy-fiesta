class Answer {   
	public static int[] answer(int h, int[] q) { 

	        // Your code goes here.
	        int N=(int)Math.pow(2, h)-1;
        	int l=q.length;
        	int p[]=new int[l];
        
        	for(int k=0; k<l; k++){ //For every query
        	        if(q[k]==N){
                		p[k]=-1;
                		continue;
            		}
            		
            		int currentHeight=h;
            		int parent=N;
            		int BE=(int)Math.pow(2, currentHeight)-2;
            		int Left=(int)Math.pow(2, h-1)-1;
            		int Right=N-1;
            		
            		
            		while(q[k]!=Left && q[k]!=Right && currentHeight<=h){
            			if(q[k]<Left){
            				parent=Left;
            			}
            			if(q[k]>Left && q[k]<Right){
            				parent=Right;
            			}
            			currentHeight--;
            			BE=(int)Math.pow(2, currentHeight)-2;
            			Left=parent-(int)(BE/2)-1;
            			Right=parent-1;
            		}
            		p[k]=parent;
            		
		}
		for(int x:p){
			System.out.println(x);
		}
		
      		return p;
    	}	
        public static void main(String args[]){
        	int q[]={19, 14, 28};
        	Answer.answer(5, q);        

        }
}
