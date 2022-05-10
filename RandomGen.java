import java.util.Comparator;
import java.util.Random;
import java.util.random.RandomGeneratorFactory;

public class RandomGen {

    public static void main(String[] args) {
        RandomGeneratorFactory.all()
                .sorted(Comparator.comparing(RandomGeneratorFactory::name))
                .forEach(factory -> System.out.println(String.format("%s\t%s\t%s\t%s",
                        factory.group(),
                        factory.name(),
                        factory.isJumpable(),
                        factory.isSplittable())));
    }
}
