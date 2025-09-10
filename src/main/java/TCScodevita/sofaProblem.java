import java.util.*;

public class sofaProblem {
    // Directions for straight movement (up, down, left, right)
    static int[][] straightDirections = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    // Directions for turns (relative to the sofa's orientation)
    static int[][] leftDownTurn = { { 1, 0 }, { 0, -1 } };
    static int[][] leftUpTurn = { { -1, 0 }, { 0, -1 } };
    static int[][] rightDownTurn = { { 0, 1 }, { 1, 0 } };
    static int[][] rightUpTurn = { { 0, 1 }, { -1, 0 } };

    static int minSteps = Integer.MAX_VALUE;

    // Check if a position is within bounds and not an obstacle
    static boolean checkBounds(int x, int y, char[][] grid) {
        return x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] != 'H';
    }

    // DFS to find the minimum steps to move the sofa to the target
    static void dfs(char[][] grid, int x1, int y1, int x2, int y2, int tx1, int ty1, int tx2, int ty2,
            Set<String> visited, int steps) {
        // If the sofa reaches the target position
        if (x1 == tx1 && y1 == ty1 && x2 == tx2 && y2 == ty2) {
            minSteps = Math.min(minSteps, steps);
            return;
        }

        // Check if the current positions are valid and not visited
        if (!checkBounds(x1, y1, grid) || !checkBounds(x2, y2, grid)) {
            return;
        }

        // Create a unique key for the current state
        String state = x1 + "," + y1 + "," + x2 + "," + y2;
        if (visited.contains(state)) {
            return;
        }
        System.out.println(state);
        // Mark the current state as visited
        visited.add(state);

        // Straight movements
        for (int[] dir : straightDirections) {
            int nx1 = x1 + dir[0], ny1 = y1 + dir[1];
            int nx2 = x2 + dir[0], ny2 = y2 + dir[1];
            dfs(grid, nx1, ny1, nx2, ny2, tx1, ty1, tx2, ty2, visited, steps + 1);
        }

        // Left turns
        dfs(grid, x1 + leftDownTurn[0][0], y1 + leftDownTurn[0][1],
                x2 + leftDownTurn[1][0], y2 + leftDownTurn[1][1], tx1, ty1, tx2, ty2, visited, steps + 1);
        dfs(grid, x1 + leftUpTurn[0][0], y1 + leftUpTurn[0][1],
                x2 + leftUpTurn[1][0], y2 + leftUpTurn[1][1], tx1, ty1, tx2, ty2, visited, steps + 1);

        // Right turns
        dfs(grid, x1 + rightDownTurn[0][0], y1 + rightDownTurn[0][1],
                x2 + rightDownTurn[1][0], y2 + rightDownTurn[1][1], tx1, ty1, tx2, ty2, visited, steps + 1);
        dfs(grid, x1 + rightUpTurn[0][0], y1 + rightUpTurn[0][1],
                x2 + rightUpTurn[1][0], y2 + rightUpTurn[1][1], tx1, ty1, tx2, ty2, visited, steps + 1);

        // Backtrack: remove the current state from visited
        visited.remove(state);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(m);
        System.out.println(n);
        char[][] grid = new char[m][n];

        List<Integer> sofaPos = new ArrayList<>();
        List<Integer> targetPos = new ArrayList<>();

        // Read the grid and collect sofa ('s') and target ('T') positions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.next().charAt(0);
                if (grid[i][j] == 's') {
                    sofaPos.add(i);
                    sofaPos.add(j);
                } else if (grid[i][j] == 'T') {
                    targetPos.add(i);
                    targetPos.add(j);
                }
            }
        }

        // Ensure exactly two 's' and two 'T' positions are found
        if (sofaPos.size() != 4 || targetPos.size() != 4) {
            System.out.println(-1); // Invalid input
            return;
        }

        // Extract sofa and target positions
        int x1 = sofaPos.get(0), y1 = sofaPos.get(1);
        int x2 = sofaPos.get(2), y2 = sofaPos.get(3);
        int tx1 = targetPos.get(0), ty1 = targetPos.get(1);
        int tx2 = targetPos.get(2), ty2 = targetPos.get(3);

        // Initialize visited set
        Set<String> visited = new HashSet<>();

        // Run DFS
        dfs(grid, x1, y1, x2, y2, tx1, ty1, tx2, ty2, visited, 0);

        // Output the minimum steps (or -1 if no path is found)
        System.out.println(minSteps == Integer.MAX_VALUE ? -1 : minSteps);
    }
}