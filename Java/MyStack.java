import java.util.LinkedList;
public class MyStack<E> {
	
	LinkedList<E> list = new LinkedList<>();
	
void push(E e)
{
	list.add(e);
}
E pop() throws Exception {
	if(list.isEmpty())
	{
		throw new Exception("Poppping from an Empty Stack.");

	}
	else {
	E popped = list.pop();
	return popped;
}
	}
void peek() {
	list.peek();
	
}
}
