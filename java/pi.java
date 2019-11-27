class getpiintime{
    public static void main(String args[]){
        System.out.println(calculatePi(5));
    }

    private static double calculatePi(int timeAllowed){
        int counter = 1;
        double totalSum = 0;
        long start = System.currentTimeMillis();
        while ((System.currentTimeMillis()-start)/1000F < 5){
            totalSum += 1.0/Math.pow(counter, 2);
            counter += 1;
        }
        return Math.sqrt(totalSum*6);
    }
}
