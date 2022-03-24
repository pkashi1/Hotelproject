public class hotel implements Comparable<hotel>{
    
    private String name;
    private int stars ;// (int): the official star rating of the hotel (1-5)
    private double googleRating ;//: the average star-rating on Google
    private double averageRoomPrice ;
    
    public hotel(){
    
    }
    
    public hotel(String Name, int Stars){// The class has a constructor which initializes name and stars.
        name = Name;
        stars = Stars;
    }

    public void setGoogleRating(double moogleRating){// The class has the method setGoogleRating which sets the hotel’s googleRating and 
        googleRating = moogleRating;
    }
    public void setaverageRoomprice(double price){
        averageRoomPrice = price;//the method setRoomPrice which sets the averageRoomPrice.
    }

    public void printInfo(){//The class also has the method printInfo which prints the hotel’s name, stars, its average room price, 
       // and Google rating in one line.
        System.out.printf("%s name and %8d stars\t and %8d is averageroomprice\t %d rating  ", name, stars, averageRoomPrice,googleRating);
    }

    public int compareTo(hotel other){
        if(Double.compare(averageRoomPrice, other.averageRoomPrice)!=0)//If the price is the same, they get compared based on the number of stars (highest to lowest), 
        {
            return -1* Integer.compare(stars, other.stars);
        }

        else if(Integer.compare(stars, other.stars)!=0){
                return (Double.compare(googleRating, other.googleRating));
            }
        else
            {
                return (Double.compare(averageRoomPrice, other.averageRoomPrice));
            }//Hotels are compared based on the average room price first (lowest to highest).
        }
    }
    

 


/*
 Hotels are compared based on the average room price first (lowest to highest).
   If the price is the same, they get compared based on the number of stars (highest to lowest), 
   if the number of stars is the same, they get compared based on their Google star rating (highest to lowest).

 

*/

