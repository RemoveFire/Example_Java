package Work01.Unit05;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.LinkedBlockingQueue;

public class WavePro {

    public static final String reset = "\u001B[0m";
    public static final String red = "\u001B[31m";
    public static final String yellow = "\u001B[33m";
    public static void printMap(int[][] map) {
        System.out.println(red + "Начальной координатой движения считается '2': \n" + reset);
        for (int[] a : map) {
            for (int x : a){
                if (x == 1)
                    System.out.print(yellow + "▓▓▓▓" + reset);
                else
                    System.out.print(" " + red + x + reset + "\t");
                }

            System.out.println();

        }
    }

    public static void WaveAlgoritm() throws IOException, InterruptedException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // Вводим размер массива, к примеру 11
        System.out.println("Введите размер массива: ");
        int size = Integer.parseInt(bf.readLine().trim());
        // Вводим массив через Enter, к примеру:
        // 0 0 0
        // 1 1 0
        // 0 0 0

        // или такой массив = 11, с координатами точки А(3,2) , В(5,5):
        //0 0 0 0 0 0 0 0 0 0 0
        //0 1 1 0 0 0 1 1 1 1 0
        //0 1 1 1 1 0 0 1 1 1 0
        //0 1 0 0 1 1 0 0 0 0 0
        //0 1 1 0 1 1 1 1 1 0 0
        //0 0 0 0 1 0 1 1 1 1 0
        //0 0 1 1 1 0 0 1 0 0 0
        //0 0 1 0 1 1 0 1 0 1 0
        //0 1 1 0 0 1 0 0 0 0 0
        //0 1 1 0 0 1 1 1 1 1 0
        //0 0 0 0 0 0 0 0 0 0 0


        System.out.println("Введите массив: ");
        int[][] map = new int[size + 2][size + 2];

        for (int i = 0; i < size; i++) {
            String[] line = bf.readLine().trim().split("[ ]+");
            for (int j = 1; j < size + 1; j++)
                map[i + 1][j] = Integer.parseInt(line[j - 1]);
        }

        for (int i = 0; i <= size + 1; i++) {

            map[0][i] = map[size + 1][i] = 1;
            map[i][0] = map[i][size + 1] = 1;
        }
        // Вводим начала координат точки А, к примеру: 0 0
        System.out.println("Введите начальные координаты(Точка А [строка, столбец]): ");
        Position start = new Position(bf.readLine().trim());
        // Вводим конечные координаты точки В, к приммеру: 2 0
        System.out.println("Введите конечные координаты(Точка В [строка, столбец]): ");
        Position finish = new Position(bf.readLine().trim());

        Position[] neighboors = new Position[4];
        neighboors[0] = new Position(1, 0);
        neighboors[1] = new Position(-1, 0);
        neighboors[2] = new Position(0, 1);
        neighboors[3] = new Position(0, -1);

        Position here = new Position(start.row, start.col);
        Position nbr = new Position();

        map[start.row][start.col] = 2;
        LinkedBlockingQueue<Position> q = new LinkedBlockingQueue<>();

        do {
            for (Position neighboor : neighboors) {
                nbr.row = here.row + neighboor.row;
                nbr.col = here.col + neighboor.col;

                if (map[nbr.row][nbr.col] == 0) {
                    map[nbr.row][nbr.col] = map[here.row][here.col] + 1;

                    if (nbr.row == finish.row && nbr.col == finish.col)
                        break;
                    q.put(new Position(nbr.row, nbr.col));
                }
            }
            if (nbr.row == finish.row && nbr.col == finish.col)
                break;
            if (q.isEmpty()) break;

            here = q.remove();
        } while (true);

        printMap(map);

        int pathLength = map[finish.row][finish.col] - 2;
        Position[] path = new Position[pathLength];

        here = finish;
        for (int i = pathLength - 1; i >= 0; i--) {
            path[i] = here;
            for (Position neighboor : neighboors) {
                nbr.row = here.row + neighboor.row;
                nbr.col = here.col + neighboor.col;

                if (map[nbr.row][nbr.col] == i + 2)
                    break;
            }
            here = new Position(nbr.row, nbr.col);
        }
        System.out.println("\n" + red + "Координаты движения короткого хода:" + reset);
        for (Position pos : path)
            System.out.print(pos + red + "-> "+ reset);

        bf.close();
    }
}
