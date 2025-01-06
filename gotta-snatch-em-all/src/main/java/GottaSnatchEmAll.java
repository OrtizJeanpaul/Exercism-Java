import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> collection = new HashSet<>();

        for(int i = 0; i < cards.length(); i++){
            collection.add(cards[i]);
        }
        return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> symmetricDifference = new HashSet<>(myCollection);
        symmetricDifference.addAll(theirCollection);

        Set<String> intersection = new HashSet<>(myCollection);
        intersection.retainAll(theirCollection);

        symmetricDifference.removeAll(intersection);

        return symmetricDifference;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> dupeCards = new HashSet<>(collections[0]);
        for(int i = 1; i < collections.length(); i++){
            dupeCards.retainAll(collections[i]);
        }

        return dupeCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> fullCollection = new HashSet<>();

        for(int i = 0; i < collections.length(); i++){
            fullCollection.addAll(collections[i]);
        }

        return fullCollection;
    }
}
