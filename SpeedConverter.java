public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){ return -1L; }
        return (long) Math.round(kilometersPerHour/1.609d);
    }
    
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){ System.out.println("Invalid Value"); return;}
        System.out.println(kilometersPerHour + " km/h = " + 
            toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
