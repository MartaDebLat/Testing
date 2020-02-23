import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Test
    public void add_addingMoreThan2Numbers_returnsCorrectResult() {
        // to będzie test „czarnej skrzynki”

        Calculator calcu = new Calculator(new Subcalculator());
        int result = calcu.Add(1, 2, 3, 4);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void add_addingMoreThan2Numbers_correctlyCallsSubcalculator() {
        // to będzie test „białej skrzynki”

        //     Subcalculator subCalcu = mock(Subcalculator.class);

        Subcalculator subCalcu = spy(Subcalculator.class);

        Calculator calcu = new Calculator(subCalcu);

        calcu.Add(1, 2, 5);

        verify(subCalcu, times(3)).Add(anyInt(), anyInt());
        verify(subCalcu, times(1)).Add(0, 1);
    }
}
