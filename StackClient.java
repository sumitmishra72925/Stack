package Stack;

public class StackClient {

	public static void main(String[] args) {
		Stack st= new Stack();
		System.out.println(st.Isempty());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		st.show();
		st.pop();
		st.show();
		System.out.println(st.peek());
		
		
		
	}

}
