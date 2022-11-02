class stack{

	//Instance variables
	int top,s[] = new int[100];

	//Construtor
	stack(){
		top = -1;
	}

	void push(int e){
		if(top == 99)
			System.out.println("Stack Full");
		else
			s[++top] = e;

	}

	void pop(){
		if(top<0){
			System.out.println("Stack Is Empty");
		}
		else{
		int del = s[top];
		top--;
		System.out.println("POPPED = "+ del);
		}
	}

	void display(){
		for(int i=top;i>=0;i--){
			System.out.println(s[i]);
		}

	}

}

class stackop{
	public static void main(String[] args){
		stack st = new stack();
		System.out.println("PUSHING");
		st.push(11);
		System.out.println("PUSHING");
		st.push(19);
		System.out.println("PUSHING");
		st.push(20);
		System.out.println("DISPLAYING");
		st.display();
		System.out.println("POPPING");
		st.pop();
		System.out.println("DISPLAYING");
		st.display();
	}
}
