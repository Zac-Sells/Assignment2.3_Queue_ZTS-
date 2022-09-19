package linkedList;

public class Queue<T> {
	GenericLinkedList<String> Queue = new GenericLinkedList<String>();
	
	public String EnQueue(GenericNode<T> aNode){
		Queue.addNode((GenericNode<String>) aNode);
		return null;
	}
	public void Dequeue() {
		
	}
}
