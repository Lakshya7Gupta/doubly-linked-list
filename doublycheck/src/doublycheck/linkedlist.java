package doublycheck;





public class linkedlist {
	
	public class node{
		int data;
		node prev;
		node next;
		public node(int data,node prev,node next) {
			// TODO Auto-generated constructor stub
			this.data=data;
			this.next=next;
			this.prev=prev;
		}
	}
	
	
	node head;
	
	public linkedlist() {
		// TODO Auto-generated constructor stub
		this.head=null;
	}
	
	public void add(int data){
		node p=new node(data,null,null);
		if(head==null){
			p.next=null;
			p.prev=null;
			head=p;
			return;
		}
		p.next=head;
		p.prev=null;
		head=p;
		return;
	}
	
	public void addAt(int item,int pos){
		if(pos==1){
			this.add(item);
			return;
		}
		node p=new node(item,null,null);
		node temp=head;
		int ctr=0;
		while(ctr<pos-1){
			temp=temp.next;
			ctr++;
		}
		temp.next.prev=p;
		p.next=temp.next;
		p.prev=temp;
		temp.next=p;
		
		return;
	}
	
	public void insertafter(int data,int dataatposition){
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public void display(){
		node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"=>");
			temp=temp.next;
		}
		System.out.println();
		return;
	}

}
