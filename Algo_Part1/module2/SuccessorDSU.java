package assignments.practice.module2;


//AI verified
public class SuccessorDSU {

	public static void main(String[] args) {
		SubClassSuccessorDSU dus = new SubClassSuccessorDSU(10);
		dus.successor(3);
		dus.remove(3);
		dus.successor(3);
		dus.remove(4);
		dus.successor(3);
		dus.remove(5);
		dus.successor(3);
		System.out.println("Try Removing again");
		dus.remove(3);
		dus.successor(3);
	}

}

class SubClassSuccessorDSU {
	private int n;
	private int[] parent;
	public SubClassSuccessorDSU(int n) {
		this.n=n;
		parent=new int[n+1];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		parent[n]=n;
	}
	
	public int find(int x) {
		if(x>=n)return -1;
		if(parent[x]==x) {
			return x;
		}else {
			parent[x]=find(parent[x]);
		}
		return parent[x];
	}
	
	public int successor(int x) {
		return find(x);
	}
	
	public void remove(int x) {
		if(x<n && x>=0) {
			parent[x]=find(x+1);
		}
	}
}
