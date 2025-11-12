public class RootBeerSong {
   public static void main(String[] args) {
   singRootBeerSong(10);
   }
   
   public static void singRootBeerSong(int numOfBottles) {
        while (numOfBottles > 0) {
        System.out.println(numOfBottles + " bottles of root beer on the wall");
        System.out.println(numOfBottles + " bottles of root beer");
        System.out.println("Take one down pass it around");
        numOfBottles = numOfBottles - 1;
        System.out.println(numOfBottles + " bottles of root beer on the wall");
        }
   }
   
   
   
   
   
}