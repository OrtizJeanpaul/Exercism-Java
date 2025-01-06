import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> collection = new HashSet<>();

        for(int i = 0; i < cards.size(); i++){
            collection.add(cards.get(i));
        }
        return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> myUniqueCards = new HashSet<>(myCollection);
        myUniqueCards.removeAll(theirCollection);

        Set<String> theirUniqueCards = new HashSet<>(theirCollection);
        theirUniqueCards.removeAll(myCollection);

        if(myCollection.isEmpty() || theirCollection.isEmpty() || myUniqueCards.isEmpty() || theirUniqueCards.isEmpty()){
            return false;
        }
        // Set<String> symmetricDifference = new HashSet<>(myCollection);
        // symmetricDifference.addAll(theirCollection);

        // Set<String> intersection = new HashSet<>(myCollection);
        // intersection.retainAll(theirCollection);

        // symmetricDifference.removeAll(intersection);

        // return symmetricDifference.size() > 0;
        return true;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> dupeCards = new HashSet<>(collections.get(0));
        for(int i = 1; i < collections.size(); i++){
            dupeCards.retainAll(collections.get(i));
        }

        return dupeCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> fullCollection = new HashSet<>();
        for(int i = 0; i < collections.size(); i++){
            fullCollection.addAll(collections.get(i));
        }

        return fullCollection;
    }
}
