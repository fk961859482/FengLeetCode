package com.fengkang.leetcode.DFS;

public class SurroundAread_130 {
	
	// 定义上下左右操作数组，左，上，右，下
	int[] dx = {0, -1, 0, 1};
	int[] dy = {-1, 0, 1, 0};
	
	/**
	 * 找到边界上的那些'O',找到他们关联的'O',将它们标记为A，之后将A都还原为'O';
	 * 其他未关联的'O'，用'X'覆盖
	 * @param board
	 */
	public void solve(char[][] board) {
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
				if (board[i][j] == 'O') {
					board[i][j] = 'X';
				}
				if (board[i][j] == 'A') {
					board[i][j] = 'O';
				}
			}
		}
	}
	
	// 将(i, j)位置及其上下左右的'O'都设置为'A'
	void dfs(int i, int j, char[][] grid, int length, int width) {
		if(i < 0 || i>= length || j < 0 || j >= width || grid[i][j] != 'O') {
			return;
		}
		if(grid[i][j] == 'O') {
			grid[i][j] = 'A';
		}
		for (int k = 0; k < dx.length; k++) {
			dfs(i + dx[k], j + dy[k], grid, length, width);
		}
	}
	
	
}
