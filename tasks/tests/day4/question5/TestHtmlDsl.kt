package day4.question5

import day4.createTable
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HtmlDSLKtTest {
    @Test
    fun testSample() {
        Assertions.assertEquals("<table><tr><td></td><td></td></tr></table>", createTable().toString())
    }
}