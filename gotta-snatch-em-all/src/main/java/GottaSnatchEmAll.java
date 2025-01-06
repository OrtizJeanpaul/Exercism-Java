import java.util.List;
import java.util.Set;
import java.collections;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> collection = new Set<>();

        for(int i = 0; i < cards.size(); i++){
            collection.add(cards[i]);
        }
        return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> symmetricDifference = new Set<>(myCollection);
        symmetricDifference.addAll(theirCollection);

        Set<String> intersection = new Set<>(myCollection);
        intersection.retainAll(theirCollection);

        symmetricDifference.removeAll(intersection);

        return symmetricDifference;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> dupeCards = new Set<>(collections[0]);
        for(int i = 1; i < collections.size(); i++){
            dupeCards.retainAll(collections[i]);
        }

        return dupeCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> fullCollection = new Set<>();

        for(int i = 0; i < collections.size(); i++){
            fullCollection.addAll(collections[i]);
        }

        return fullCollection;
    }
}
