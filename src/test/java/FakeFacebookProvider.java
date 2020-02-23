import java.util.Arrays;
import java.util.List;

public class FakeFacebookProvider extends FacebookProvider {
    @Override
    public List<Character> GetFriends(String fullName) throws InterruptedException {
        return Arrays.asList(new Character("znajomy", "znajomy", 20,  null),
                new Character("Taki", "Tam", 20,  null));
    }
}
