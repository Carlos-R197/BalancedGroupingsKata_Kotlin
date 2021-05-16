/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package BalancedGroupings3

import kotlin.test.Test
import kotlin.test.assertEquals

class BalancedGroupingTest {
    val groupingsProblem = BalancedGroupingsProblem()

    @Test fun WhitespaceTest() {
        assertEquals(true, groupingsProblem.isBalanced("   "))
    }

    @Test fun UnmatchedGroupingTest() {
        assertEquals(false, groupingsProblem.isBalanced(" (a + b "))
    }

    @Test fun MatchedGropingTest() {
        assertEquals(true, groupingsProblem.isBalanced("[a + b]"))
    }

    @Test fun MultipleUnmachedGroupingsTest() {
        assertEquals(false, groupingsProblem.isBalanced("[{a*b}/c})"))
    }

    @Test fun MultipleMatchedGroupingsTest() {
        assertEquals(true, groupingsProblem.isBalanced("{[(zy/a) * (d + f)]}"))
    }
}
