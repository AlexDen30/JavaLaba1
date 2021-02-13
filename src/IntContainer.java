public class IntContainer {

    /**
     *  countOfNums is current count of numbers in container
     */
    private int countOfNums;
    private int nums[];

    /**
     *  Default constructor. Set count of nums = 0 and create array with 3 int cells
     */
    IntContainer() {
        this.countOfNums = 0;
        nums = new int[3];
    }

    /**
     *  Set collection as array from
     */
    IntContainer(int[] from) {
        this.countOfNums = from.length;
        nums = from;
    }
    /**
     * Expand array of container
     */
    public void expand() {
        int buf[] = new int[nums.length + 3];
        for (int i = 0; i < countOfNums; i++) {
            buf[i] = nums[i];
        }

        nums = buf;
    }

    /**
     * Push a number in the end of collection
     *
     * @param num the number you want add to end of collection
     */
    public void pushEndNum(int num) {

        if (nums.length == countOfNums) {
            expand();
        }

        nums[countOfNums] = num;
        countOfNums++;
    }

    /**
     * Push a number in the top of collection
     *
     * @param num the number you want add to top of collection
     */
    public void pushForwardNum(int num) {

        if (nums.length == countOfNums) {
            expand();
        }

        int buf[] = new int[nums.length];
        buf[0] = num;

        for (int i = 1; i<=countOfNums; i++) {
            buf[i] = nums[i-1];
        }

        nums = buf;
        countOfNums++;
    }

    /**
     * Get a first number of collection
     *
     * @return returns first number in collection
     */
    public int getFirstNum() {

        if (nums.length == 0) {
            System.out.println("Container is empty!");
            return 0;
        } else {
            return nums[0];
        }
    }

    /**
     * Get a last number of collection
     *
     * @return returns last number in collection
     */
    public int getLastNum() {

        if (nums.length == 0) {
            System.out.println("Container is empty!");
            return 0;
        } else {
            return nums[countOfNums-1];
        }
    }

    /**
     * Get a first number of collection than remove it from collection
     *
     * @return returns first number in collection
     */
    public int popFirstNum() {

        if (nums.length == 0) {
            System.out.println("Container is empty!");
            return 0;
        } else {
            int res = nums[0];

            int buf[] = new int[nums.length - 1];
            for (int i = 1; i < countOfNums; i++) {
                buf[i-1] = nums[i];
            }

            countOfNums--;
            nums = buf;
            return res;
        }
    }

    /**
     * Get a last number of collection than remove it from collection
     *
     * @return returns last number in collection
     */
    public int popLastNum() {

        if (nums.length == 0) {
            System.out.println("Container is empty!");
            return 0;
        } else {
            int res = nums[countOfNums-1];

            int buf[] = new int[nums.length - 1];
            for (int i = 0; i < countOfNums - 1; i++) {
                buf[i] = nums[i];
            }

            countOfNums--;
            nums = buf;
            return res;
        }
    }

    /**
     * Delete first num in collection
     */
    public void deleteFirstNum() {

        if (nums.length == 0) {
            return;
        } else {

            int buf[] = new int[nums.length - 1];
            for (int i = 1; i < countOfNums; i++) {
                buf[i-1] = nums[i];
            }

            countOfNums--;
            nums = buf;
            return;
        }
    }

    /**
     * Delete last num in collection
     */
    public void deleteLastNum() {

        if (nums.length == 0) {
            return;
        } else {

            int buf[] = new int[nums.length - 1];
            for (int i = 0; i < countOfNums - 1; i++) {
                buf[i] = nums[i];
            }

            countOfNums--;
            nums = buf;
            return;
        }
    }

    /**
     * Print collection
     */
    public void printCollection() {

        for(int i = 0; i<countOfNums; i++) {
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

}
