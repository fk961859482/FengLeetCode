package DFS;

public class NumberOfIslands_200 {
    int ans = 0;
    // 定义上下左右操作数组，左，上，右，下
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};

    public int numIslands(char[][] grid) {
        int length = grid.length;
        int width = grid[0].length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    dfs(i, j, grid, length, width);
                }
            }
        }
        return ans;
    }

    void dfs(int i, int j, char[][] grid, int length, int width) {
        if (i < length && i >=0 && j < width && j >=0 && grid[i][j] == '1') {
            grid[i][j] = '0';
            for (int k = 0; k < dx.length; k++) {
                dfs(i + dx[k], j + dy[k], grid, width, length);
            }
        }
    }

    public static void main(String[] args) {
        NumberOfIslands_200 o = new NumberOfIslands_200();
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        o.numIslands(grid);
        System.out.println("hello");
    }
}
