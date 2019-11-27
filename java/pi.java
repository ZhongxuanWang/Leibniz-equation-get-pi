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


class getpiinperiod{
    public static void main(String args[])
    {
        double place = 0;
        double k = 0;
        double result = 0;
        while(true)
        {
            result = method(k,result);
            k++;
            if(place==10000000) System.out.println(result * 4.0);;
        }
    }
    public static double method(double k, double num)
    {
        return (Math.pow(-1.0,k) / (2.0*k + 1.0) + num);
    }
}
