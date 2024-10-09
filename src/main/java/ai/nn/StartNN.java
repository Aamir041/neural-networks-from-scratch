package ai.nn;

public class StartNN {
    public static void main(String[] args) {
        Double[] inputs = {1.2, 5.1, 2.1};
        Double[] weights = {3.1, 2.1, 8.7};
        Double bias = 3d;

        Double output = 0d;

        for(int i=0; i<inputs.length; i++){
            output += (inputs[i]*weights[i]);
        }

        output += bias;

        System.out.println(output);


    }
}
