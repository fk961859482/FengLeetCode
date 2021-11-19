package DFS;

public class SquareOfIslands_105 {
	
	int ans = 0;
	// 定义上下左右操作数组，左，上，右，下
	int[] dx = {0, -1, 0, 1};
	int[] dy = {-1, 0, 1, 0};
	
	public int maxAreaOfIsland(int[][] grid) {
		int length = grid.length;
		int width = grid[0].length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (grid[i][j] == 1) {
					ans = Math.max(ans, dfs(i, j, grid, length, width));
				}
			}
		}
		return ans;
	}
	
	int dfs(int i, int j, int[][] grid, int length, int width) {
		if (i >= length || i < 0 || j >= width || j < 0 || grid[i][j] == 0) {
			return 0;
		}
		int count = 1;
		grid[i][j] = 0;
		for (int k = 0; k < dx.length; k++) {
            count +=  dfs(i + dx[k], j + dy[k], grid, length, width);
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		SquareOfIslands_105 o = new SquareOfIslands_105();
		int[][] grid = new int[][]
				               {
						
//						               {1, 1, 0, 0, 0},
//						               {1, 1, 0, 0, 0},
//						               {0, 0, 0, 1, 1},
//						               {0, 0, 0, 1, 1}
						               {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
						               {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
						               {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
						               {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
						               {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
						               {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
						               {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
						               {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
					
				               };
		o.maxAreaOfIsland(grid);
		System.out.println("hello");
	}
}
