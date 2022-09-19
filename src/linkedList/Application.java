package linkedList;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue Q1 = new Queue();
		GenericNode Bill = new GenericNode();
		GenericNode Alice = new GenericNode();
		GenericNode Bob = new GenericNode();
		Q1.EnQueue(Bill);
		Q1.EnQueue(Alice);		
		Q1.EnQueue(Bob);
		
		//Dequeue
		
		GenericNode Jane = new GenericNode();
		Q1.EnQueue(Jane);
		GenericNode Hamad = new GenericNode();
		Q1.EnQueue(Hamad);
		
		//Dequeue
		//Dequeue
		
		GenericNode Jim = new GenericNode();
		Q1.EnQueue(Jim);
		
		//Dequeue
		//Dequeue
	}

}
