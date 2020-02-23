import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
public class NumbersConverterTest {
    //   "I" ->"1"
    static Stream<Arguments> argumentProvider(){
        return Stream.of(
                arguments("III",3),
                arguments("XIII",13),
                arguments("XXV",25),
                arguments("MMMIII",3003),
                arguments("XIX",19)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentProvider")
    public void convert_comvertI_result1(String RomanNumber, int ArabicNumber) {
        NumbersConverter numberConverter = new NumbersConverter();
        int result = numberConverter.convertRomanToArabic(RomanNumber);
        assertThat(result).isEqualTo(ArabicNumber);
    }
}