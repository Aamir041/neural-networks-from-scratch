package ai.nn;

import java.util.Arrays;

public class StartNN {
    public static void main(String[] args) {

        Double[] inputs = {1d, 2d, 3d, 2.5d};

        Double[][] weights = {
                {0.2d, 0.8d, -0.5d, 1.0},
                {0.5d, -0.91d, 0.26d, -0.5d},
                {-0.26d, -0.27d, 0.17d, 0.87d}
        };
        Double[] bias = {2d,3d,0.5d};

        Double[] output = new Double[weights.length];

        for(int i=0; i<weights.length; i++){
            output[i] = 0d;
            for (int j = 0; j<weights[i].length; j++){
               output[i] += (inputs[j] * weights[i][j]);
           }
           output[i] += bias[i];
        }

        System.out.println(Arrays.toString(output));


    }
}
