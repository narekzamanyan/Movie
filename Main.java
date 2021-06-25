import java.util.*;

public class Main {
    public static void main(String[] args ) {
        // Create ArrayList
        Collection myCollection = new ArrayList();
        
        // Adding 5 Movies into collection
        myCollection.add(new Movie("Spider Man", 3));
        myCollection.add(new Movie("Matrix", 9));
        myCollection.add(new Movie("Terminator", 3));
        myCollection.add(new Movie("The 300 Spartans", 5));
        myCollection.add(new Movie("Shutter Island", 10));

        // Adding 6 Cartoons into collection
        myCollection.add(new Cartoon("Shrek", 8));
        myCollection.add(new Cartoon("Tom & Jerry", 7));
        myCollection.add(new Cartoon("Zootopia", 9));
        myCollection.add(new Cartoon("Inside Out", 4));
        myCollection.add(new Cartoon("Soul", 1));
        myCollection.add(new Cartoon("Frozen", 5));


        // Create a List to store only Movies
        List<Movie> sortedList = new ArrayList<>();

        // Iterating over collection and adding Movies into List
        Iterator<Movie> i = myCollection.iterator();
        while (i.hasNext()) {
            Object o = i.next();
              if(o.getClass() == Movie.class)
                  sortedList.add((Movie)o);
        }

        Collections.sort(sortedList);

        // Print the result
        Iterator<Movie> itr = sortedList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next().getTitle());

    }
}

