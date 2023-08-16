public class sumaPrefija {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, ingrese una lista de números enteros como argumentos.");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        int prefixSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            prefixSum += numbers[i];
            System.out.println(numbers[i] + ", " + prefixSum);
        }
    }
}