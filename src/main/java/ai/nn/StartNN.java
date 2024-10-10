package ai.nn;

import ai.nn.utils.Process;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StartNN {
    public static void main(String[] args) {

        // Layered output
        Double[] inputs = {1d, 2d, 3d, 2.5d};
        Double[][] weights = {
                {0.2d, 0.8d, -0.5d, 1.0},
                {0.5d, -0.91d, 0.26d, -0.5d},
                {-0.26d, -0.27d, 0.17d, 0.87d}
        };
        Double[] biases = {2d,3d,0.5d};

        Double[] output = Process.add(Process.dotProduct(weights, inputs), biases);
        System.out.println(Arrays.toString(output));

        // Basic Neuron 3 Inputs Node
        Double[] inputs1 = {1d, 2d, 3d, 2.5d};
        Double[] weights1 = {0.2d, 0.8d, -0.5d, 1.0d};
        Double bias1 = 2d;
        Double output1 = Process.dotProduct(weights1,inputs1) + bias1;
        System.out.println(output1);

    }
}
