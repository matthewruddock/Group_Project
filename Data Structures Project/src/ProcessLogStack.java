//Done by Matthew Ruddock - 1700241
public class ProcessLogStack {

private ProcessLogNode top;
	
	public boolean isEmpty() {
		if (top==null) {
			return true;
		}else {
			return false;
		}
	}//end is empty
	
	public boolean isFull() {
		ProcessLogNode temp=new ProcessLogNode();
		if(temp==null) {
			return true;
		}else {
			temp=null;//delete temp
			return false;
		}
    	
    } 	
	
	 public boolean push(VisitorRequest data) {
	    	if (isFull()) {
	    		System.out.println("Stack Is Full");
	    		return false;
	    	}else {
	    		ProcessLogNode nextItem = new ProcessLogNode();
	    		nextItem.setData(data);
	    		if (isEmpty()) {
	    			top = nextItem;
	    		}else {
	    			nextItem.setNext(top);
	    			top = nextItem;
	    		}
	    	}   return true;
	    }// end add to front
	
	 public VisitorRequest pop() {
		 if (!isEmpty()) {
			 VisitorRequest data = top.getData();
			 top = top.getNext();
			 return data;
		 }
    	
		 return null;
	 } // end delete from front
	 
	 public VisitorRequest stackTop() {
		 return top.getData();
	 }
	 
	 public int Count(ProcessLogStack stack) {
		 ProcessLogStack temp = new ProcessLogStack();
		 int count = 0;
		 while(!stack.isEmpty()) {
			 temp.push(stack.pop());
			 count++;
		 }
		 while(!temp.isEmpty()) {
			 stack.push(temp.pop());
		 }
		 return count;
	 }
	 
	 public void display() {
		 ProcessLogStack temp = new ProcessLogStack();
		 while(!isEmpty()) {
			 temp.push(pop());
			 temp.top.getData().display();
		 }
		 while(!temp.isEmpty()) {
			 push(temp.pop());
		 }
	 }
	 
	 public void destroy() {
		 while(pop()!=null);
	 }
}
