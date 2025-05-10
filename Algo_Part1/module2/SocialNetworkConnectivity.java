//Given a social network containing nn members and a log file containing mm timestamps at which times pairs of members formed friendships, design an algorithm to determine the earliest time at which all members are connected (i.e., every member is a friend of a friend of a friend ... of a friend). Assume that the log file is sorted by timestamp and that friendship is an equivalence relation. The running time of your algorithm should be mlog⁡nmlogn or better and use extra space proportional to nn.

package module2;

public class SocialNetworkConnectivity {

	public static void main(String[] args) {
//		int logs[][] = new int[][]{
//		{1,0,1},
//		{2,0,1},
//		{3,2,4},
//		{4,0,3},
//		{5,0,3},
//		{6,1,3},
//		{7,1,2}
//	};
		
		int logs[][] = new int[][]{
			{1,0,1},
			{2,1,2},
			{3,1,2},
			{4,0,3},
			{5,0,3},
			{6,1,3},
			{7,1,3},
			{8,2,4}
		};
	int n = 5;
	int connects=n;
	SocNetDSU d = new SocNetDSU(n);
		for(int i=0;i<logs.length;i++) {
			if(!d.isConnected(logs[i][2], logs[i][1])) {
				d.union(logs[i][2], logs[i][1]);
				connects--;
				if(connects==1) {
					System.out.println(logs[i][0]);
					break;
				}
			}
			
		}
		
	}

}

class SocNetDSU{
	private int[] parent,rank;
	public SocNetDSU(int n) {
		parent=new int[n];
		rank=new int[n];
		for(int i=0;i<n;i++) {
			rank[i]=0;
			parent[i]=i;
		}
	}
	
	public void union(int x,int y) {
		int px=find(x);
		int py=find(y);
		if(px==py) {
			return;
		}
		if(rank[px]<rank[py]) {
			parent[py]=px;
		}else {
			parent[px]=py;
			if(rank[px]==rank[py]) {
				rank[px]++;
			}
		}
	}
	
	public int find(int x) {
		if(x==parent[x]) {
			return x;
		}else {
			parent[x]=find(parent[x]);
		}
		return parent[x];
	}
	
	public boolean isConnected(int x,int y) {
		return find(x)==find(y);
	}
}
