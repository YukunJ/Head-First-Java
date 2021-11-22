public class ElectricGuitar {
    
    String brand;
    int numOfPickups;
    boolean rockStarUsersIt;
    
    String getBrand() {
        return brand;
    }
    
    void setBrand(String aBrand) {
        brand = aBrand;
    }
    
    int getNumOfPickups() {
        return numOfPickups;
    }
    
    void setNumOfPickups(int num) {
        numOfPickups = num;
    }
    
    boolean getRockStarUsesIt() {
        return rockStarUsersIt;
    }
    
    void setRockStarUsersIt(boolean yesOrNo) {
        rockStarUsersIt = yesOrNo;
    }
}
