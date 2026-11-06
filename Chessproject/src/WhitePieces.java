import java.util.ArrayList;
import java.util.Arrays;

public class WhitePieces {
       private ArrayList<int[]> pawns = new ArrayList<>(
              Arrays.asList(
                     new int[]{1,0},
                     new int[]{1,1},
                     new int[]{1,2},
                     new int[]{1,3},
                     new int[]{1,4},
                     new int[]{1,5},
                     new int[]{1,6},
                     new int[]{1,7}
              )
       );
       private ArrayList<int[]> rooks = new ArrayList<>(
              Arrays.asList(
                     new int[]{0,0},
                     new int[]{0,7}
              )
       );
       private ArrayList<int[]> knights = new ArrayList<>(
              Arrays.asList(
                     new int[]{0,1},
                     new int[]{0,6}
              )
       );
       private ArrayList<int[]> bishops = new ArrayList<>(
              Arrays.asList(
                     new int[]{0,2},
                     new int[]{0,5}
              )
       );
       private ArrayList<int[]> queens = new ArrayList<>(
              Arrays.asList(
                     new int[]{0,3}
              )
       );
       private ArrayList<int[]> kings = new ArrayList<>(
              Arrays.asList(
                     new int[]{0,4}
              )
       );

 }