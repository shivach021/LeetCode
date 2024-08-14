public class FruitIntoBasket {

    public static void main(String[] args) {
        int[] fruits = new int[]{4,1,1,1,3,1,7,5};
        System.out.println(totalFruit(fruits));
    }

    public static int totalFruit(int[] fruits) {
        if (fruits.length < 2) {
            return fruits.length;
        }

        int max = 0;
        for (int i = 0; i < fruits.length; i++) {
            int firstFruitType = fruits[i];
            int secondFruitType = -1;
            int count = 0;
            int secondFruitPosition = -1;
            for (int j = i; j < fruits.length; j++) {
                System.out.println("checking at i = "+ i + " and j = "+ j);
                if (fruits[j] != firstFruitType && secondFruitType == -1) {
                    secondFruitType = fruits[j];
                    secondFruitPosition = j;

                }
                if (fruits[j] != firstFruitType && fruits[j] != secondFruitType) {
                    System.out.println("breaking at i = "+ i + " and j = "+ j + " and count is "+ count);
                    if (secondFruitPosition > 0) {
                        i = secondFruitPosition - 1;
                    }
                    break;
                }
                count++;
                if (max < count) {
                    max = count;
                }
            }
        }
        return max;

    }
}
