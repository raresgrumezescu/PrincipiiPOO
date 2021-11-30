package laborator3;

class Graph {
	int[][] mat;
	int INF = 9500;
	int n;
	
	public Graph(int noduri) {
		this.n = noduri;
		this.mat = new int[n + 1][n + 1];
	}
	
	int getSize() {
		return this.n;
	}
	
	void addArc(int v, int w, int cost) {
		this.mat[v][w] = cost;
	}
	
	boolean isArc(int v, int w) {
		if (this.mat[v][w] == 0) return false;
		else return true;
	}
	
	public void String () {
		int dim = this.n;
		int i, j;
		for (i = 1; i <= dim; i++) {
			for (j = 1; j <= dim; j++) {
				if (this.mat[i][j] != 0) {
					System.out.printf (i + " -> " + j + " cost: " + this.mat[i][j] + "\n");
				}
			}
		}
	}
	
	int[][] floydWarshall() {
		int result[][];
		result = new int[n+1][n+1];
		int k, i, j;
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= n; j++) {
				if(i == j) {
					result[i][j] = 0;
				} else if(isArc(i, j)) {
					result[i][j] = mat[i][j];
				} else {
					result[i][j] = INF;
				}
			}
		}
		for(k = 1; k <= n; k++) {
			for(i = 1; i <= n; i++) {
				for(j = 1; j <= n; j++) {
					int dist;
					dist = result[i][k] + result[k][j];
					if(result[i][j] > dist) {
						result[i][j] = dist;
					}
				}
			}
		}
		return result;
	}
	
	public  static void main(String[] args) {
		//System.out.println ("ftfkhjk");
		Graph g = new Graph(8);
		/*g.addArc(1, 3, 2);
		g.addArc(1, 2, 3);
		g.addArc(2, 4, 6);
		g.addArc(2, 3, 2);*/
		g.addArc(1, 7, 15);
		g.addArc(1, 5, 1);
		g.addArc(2, 3, 5);
		g.addArc(3, 4, 6);
		g.addArc(3, 6, 7);
		g.addArc(4, 5, 2);
		g.addArc(5, 6, 3);
		g.addArc(5, 7, 2);
		g.addArc(6, 1, 6);
		g.addArc(8, 5, 2);
		g.addArc(8, 6, 4);
		System.out.println(g);
		System.out.println("Floyd-Warshall");
		int [][] my_matrix = g.floydWarshall();
		System.out.println("distanta minima dintre nodurile 3 si 7 este "+ my_matrix[3][7]);
		
		g.String();
	}
}
