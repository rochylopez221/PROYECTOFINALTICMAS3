
import com.example.proyectofinalticmas.Mvvm
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ComparisonViewModelTest {
    private lateinit var viewModel: Mvvm

    @Before
    fun setUp() {
        // Initialize the ViewModel
        viewModel = Mvvm()
    }

    @Test
    fun testCompareValues() {
        // Test when two equal values are passed
        val result1 = viewModel.compareValues("Hello", "Hello")
        assertTrue(result1)

        // Test when two different values are passed
        val result2 = viewModel.compareValues("Hello", "World")
        assertFalse(result2)

        // Test when one value is empty
        val result3 = viewModel.compareValues("", "World")
        assertFalse(result3)
    }
}