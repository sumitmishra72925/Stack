package Stack;

public class Stack {
	 int [] stack;
	 int top;
	public Stack(){
		this(5);
	}
	
	public Stack (int n){
	
		this.stack=new int [n];
		this.top=-1;
	
	}
	
	 
	public void push(int data) {
		if (this.top == this.stack.length-1) {
			System.out.println("OVERFLOW STACK IS FULL");
		}
		
			this.top = this.top + 1;
			this.stack[this.top]=data;
			
	
		}

	public int pop() {
	
		if (this.top == -1) {
			System.out.println("UNDERFOW, STACK IS EMPTY");
		}  
			int rv=this.stack[this.top];
			this.stack[this.top]=0;
			this.top =this.top - 1;
		
		return rv;
	}

	public int peek() {
		if (this.top == -1) {
			System.out.println("STACK IS EMPTY");
		}
		return this.stack[top];
	}
	public void show(){
		for(int val:stack){
			System.out.print(val+" ");
		}
		System.out.println();
	}
	public boolean Isempty(){
		if(top==-1)
			return true;
		else
			return false;
	}
	
	

}
