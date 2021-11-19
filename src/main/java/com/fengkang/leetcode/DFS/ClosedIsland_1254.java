package com.fengkang.leetcode.DFS;

public class ClosedIsland_1254 {
	// 定义上下左右操作数组，左，上，右，下
	int[] dx = {0, -1, 0, 1};
	int[] dy = {-1, 0, 1, 0};
	int ans = 0;
	
	/**
	 * 找到边界上的那些0,找到他们关联的0,将它们标记为1
	 *
	 * @param board
	 */
	public int closedIsland(int[][] board) {
		int length = board.length;
		int width = board[0].length;
		for (int j = 0; j < width; j++) {
			dfs(0, j, board, length, width);
			dfs(length - 1, j, board, length, width);
		}
		
		for (int i = 0; i < length; i++) {
			dfs(i, 0, board, length, width);
			dfs(i, width - 1, board, length, width);
		}
		
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (board[i][j] == 0) {
					ans++;
					dfs(i, j, board, length, width);
				}
			}
		}
		return ans;
	}
	
	// 将所有的联通了0的位置，标记为1
	void dfs(int i, int j, int[][] grid, int length, int width) {
		if(i < 0 || i>= length || j < 0 || j >= width || grid[i][j] != 0) {
			return;
		}
		grid[i][j] = 1;
		for (int k = 0; k < dx.length; k++) {
			dfs(i + dx[k], j + dy[k], grid, length, width);
		}
	}
	
	
	public static void main(String[] args) {
		ClosedIsland_1254 o = new ClosedIsland_1254();
		int[][] grid = new int[][]
				               {
						               {0,0,1,0,0},
						               {0,1,0,1,0},
						               {0,1,1,1,0}
				               };
		o.closedIsland(grid);
		
	}
	
}
