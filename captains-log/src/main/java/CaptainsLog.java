import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        throw new UnsupportedOperationException("Please implement th CaptainsLog.randomPlanetClas() method");
    }

    String randomShipRegistryNumber() {
        throw new UnsupportedOperationException("Please implement the CaptainsLog.randomShipRegistryNumber() method");
    }

    double randomStardate() {
        throw new UnsupportedOperationException("Please implement the CatainsLog.randomStardate() method");
    }
}
