package ai.nn.utils;

public class Process {

    public static Double dotProduct(Double[] vector1, Double[] vector2){
        Double output = 0d;
        for (int i = 0; i < vector1.length; i++) {
            output += vector1[i]*vector2[i];
        }
        return output;
    }

    public static Double[] dotProduct(Double[][] vector1, Double[] vector2){
        Double[] output = new Double[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            output[i] = 0d;
            for (int j = 0; j < vector1[i].length; j++) {
                output[i] += (vector2[j] * vector1[i][j]);
            }
        }
        return output;
    }

    public static Double[] add(Double[] dotProducts, Double[] biases){
        Double[] output = new Double[dotProducts.length];
        for (int i = 0; i < dotProducts.length; i++) {
            output[i] = dotProducts[i] + biases[i];
        }
        return output;
    }
}
