import java.util.*;

class Node {

    int[][] board;
    int g;
    int h;
    int f;
    int emptyRow, emptyCol;

    Node parent;

    // Constructor
    Node(int[][] board, int g, Node parent) {

        this.board = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                this.board[i][j] = board[i][j];

                if (board[i][j] == 0) {
                    emptyRow = i;
                    emptyCol = j;
                }
            }
        }

        this.g = g;

        // Heuristic value
        this.h = calculateHeuristic();

        // Total cost
        this.f = this.g + this.h;

        this.parent = parent;
    }

    // Manhattan Distance Heuristic
    int calculateHeuristic() {

        int distance = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                int value = board[i][j];

                if (value != 0) {

                    int targetRow = (value - 1) / 3;
                    int targetCol = (value - 1) % 3;

                    distance += Math.abs(i - targetRow)
                            + Math.abs(j - targetCol);
                }
            }
        }

        return distance;
    }

    // Goal Check
    boolean isGoal() {

        int[][] goal = {
                {1,2,3},
                {4,5,6},
                {7,8,0}
        };

        return Arrays.deepEquals(board, goal);
    }
}

public class Practical {

    static int[] rowDir = {-1, 1, 0, 0};
    static int[] colDir = {0, 0, -1, 1};

    static void solve(int[][] startBoard) {

        PriorityQueue<Node> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a.f));

        Node start = new Node(startBoard, 0, null);

        pq.add(start);

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            // Goal reached
            if (current.isGoal()) {

                printSolution(current);
                return;
            }

            // Generate neighbors
            for (int i = 0; i < 4; i++) {

                int newRow = current.emptyRow + rowDir[i];
                int newCol = current.emptyCol + colDir[i];

                if (isValid(newRow, newCol)) {

                    int[][] newBoard = copyBoard(current.board);

                    // Swap empty tile
                    newBoard[current.emptyRow][current.emptyCol]
                            = newBoard[newRow][newCol];

                    newBoard[newRow][newCol] = 0;

                    Node neighbor =
                            new Node(newBoard,
                                    current.g + 1,
                                    current);

                    pq.add(neighbor);
                }
            }
        }
    }

    static boolean isValid(int row, int col) {

        return row >= 0 && row < 3
                && col >= 0 && col < 3;
    }

    static int[][] copyBoard(int[][] board) {

        int[][] newBoard = new int[3][3];

        for (int i = 0; i < 3; i++) {
            newBoard[i] = board[i].clone();
        }

        return newBoard;
    }

    // Print final path
    static void printSolution(Node node) {

        List<Node> path = new ArrayList<>();

        while (node != null) {

            path.add(node);
            node = node.parent;
        }

        Collections.reverse(path);

        System.out.println("Solution:");

        for (Node step : path) {

            for (int[] row : step.board) {

                for (int val : row) {
                    System.out.print(val + " ");
                }

                System.out.println();
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] startBoard = {
                {1,2,3},
                {4,0,6},
                {7,5,8}
        };

        solve(startBoard);
    }
}