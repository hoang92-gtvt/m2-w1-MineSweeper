public class MineSweeper {
    static String[][] map = {
            {"*", ".", "*", ".", "."},
            {".", "*", ".", ".", "."},
            {".", "*", ".", ".", "."},
            {".", "*", ".", ".", "."},
            {".", "*", ".", ".", "."}
    };
    final static int heightMap = map.length;
    final static int widthMap = map[0].length;
    static String[][] mapReport = new String[heightMap][widthMap];

    public static void main(String[] args) {
        for (int i = 0; i < heightMap; i++) {
            for (int j = 0; j <widthMap ; j++) {
                if(map[i][j].equals("*")){
                    mapReport[i][j]="*";
                }else{
                    setMap(i,j);

                }
            }
        }
        for (int i = 0; i < heightMap ;i++) {
            for (int j = 0; j <widthMap ; j++) {
                System.out.print(mapReport[i][j]);
            }
            System.out.println("");

        }

//
    }

    public static void setMap(int y, int x) {
//      String [][] checkArray = new String [3][3];

            int number = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int posY=y-1+i;
                    int posX=x-1+j;
                    if(posY<0 || posX<0){
                        continue;
                    }
                    if(posY>map.length-1 ||posX>map.length-1){
                        continue;
                    }

                    if (map[y - 1 + i][x - 1 + j].equals("*")) {
                        number++;
                    }
                }
                mapReport[y][x] = String.valueOf(number);
//                if (map[y][x] == "*") {
//                    map[y][x] = String.valueOf(number - 1);
//                } else map[y][x] = String.valueOf(number);
            }

    }


}
