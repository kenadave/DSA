package assignments.practice.module2;

//AI verified
public class LargestUnion {

	public static void main(String[] args) {
		DSULargest uf = new DSULargest(10);
        uf.union(0, 1);
        uf.union(1, 2);
        uf.union(3, 4);
        uf.union(4, 9);

        System.out.println(uf.find(0)); // Output: 2
        System.out.println(uf.find(1)); // Output: 2
        System.out.println(uf.find(2)); // Output: 2
        System.out.println(uf.find(3)); // Output: 9
        System.out.println(uf.find(9)); // Output: 9
        System.out.println(uf.connected(0, 2)); //Output: true
        System.out.println(uf.connected(0, 3)); //Output: false

        uf.union(2,9);
        System.out.println(uf.find(0)); //Output: 9
        System.out.println(uf.find(3)); //Output: 9
        System.out.println(uf.connected(0, 3)); //Output: true

	}

}
class DSULargest{
	
	private int[] parent;
	private int[] rank;
	private int[] max;
	DSULargest(int n){
		parent = new int[n];
		rank = new int[n];
		max = new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
			rank[i]=1;
			max[i]=i;
		}
	}
	
	public void union(int x,int y) {
		int px=findParent(x);
		int py=findParent(y);
		if(px==py) {
			return;
		}
		if(rank[px]<rank[py]) {
			parent[px]=py;
			max[py]=Math.max(max[px], max[py]);
		}else {
			parent[px]=px;
			rank[px]++;
			max[px]=Math.max(max[px], max[py]);
			if(rank[px]==rank[py]) {
				rank[px]++;
			}
		}
	}

	public int find(int y) {
		return this.max[findParent(y)];
	}
	
	private int findParent(int x) {
		if(x==parent[x]) {
			return parent[x];
		}else {
			parent[x]=find(parent[x]);
		}
		return parent[x];
	}
	
	public boolean connected(int x,int y) {
		return find(x)==find(y);
	}
}
